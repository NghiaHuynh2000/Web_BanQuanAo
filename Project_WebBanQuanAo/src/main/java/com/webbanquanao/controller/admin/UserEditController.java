package com.webbanquanao.controller.admin;

import com.webbanquanao.model.User;
import com.webbanquanao.service.UserService;
import com.webbanquanao.service.impl.UserServiceImpl;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = { "/admin/user/edit" })
public class UserEditController extends HttpServlet {
    UserService userService = new UserServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        User user = userService.get(id);
        request.setAttribute("user", user);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/View/admin/edit-user.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        User user = new User();
        DiskFileItemFactory diskFileItemFactory = new DiskFileItemFactory();
        ServletFileUpload servletFileUpload = new ServletFileUpload(diskFileItemFactory);

        try {
            List<FileItem> items = servletFileUpload.parseRequest(request);
            for (FileItem item : items) {
                if (item.getFieldName().equals("id")) {
                    user.setId(Integer.parseInt(item.getString()));
                } else if (item.getFieldName().equals("email")) {
                    user.setEmail(item.getString());
                } else if (item.getFieldName().equals("username")) {
                    user.setUserName(item.getString());
                } else if (item.getFieldName().equals("password")) {
                    user.setPassword(item.getString());
                } else if (item.getFieldName().equals("address")) {
                    user.setAddress(item.getString());

                } else if (item.getFieldName().equals("avatar")) {
                    if (item.getSize() > 0) {// neu co file d
                        final String dir = "F:\\upload";
                        String originalFileName = item.getName();
                        int index = originalFileName.lastIndexOf(".");
                        String ext = originalFileName.substring(index + 1);
                        String fileName = System.currentTimeMillis() + "." + ext;
                        File file = new File(dir + "/" + fileName);
                        item.write(file);

                        user.setAvatar(fileName);
                    } else {
                        user.setAvatar(null);
                    }
                }
            }
            //int id = Integer.parseInt(request.getParameter("id"));
//            String email = request.getParameter("email");
//            String username = request.getParameter("username");
//            String password = request.getParameter("password");
//            String address = request.getParameter("address");
//            String permission = request.getParameter("permission");
//            String avatar = request.getParameter("avatar");
//            user.setId(1);
//            user.setEmail(email);
//            user.setUserName(username);
//            user.setPassword(password);
//            user.setAddress(address);
//            user.setPermission(2);
//            user.setAvatar(null);
            userService.edit(user);

            response.sendRedirect(request.getContextPath() + "/admin/user/list");
        } catch (FileUploadException e) {
            e.printStackTrace();
        } catch (Exception e) {
            response.sendRedirect(request.getContextPath() + "/admin/user/list");
        }
    }
}
