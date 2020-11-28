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

@WebServlet(urlPatterns = { "/admin/user/add" })
public class UserAddController extends HttpServlet {
    UserService userService = new UserServiceImpl();



    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User user = new User();


        String email= req.getParameter("email");
        String username=req.getParameter("username");
        String pasword=req.getParameter("password");
        String avatar=req.getParameter("avatar");
        String address=req.getParameter("address");
        if(email==null)
            email="isnull";
        //String permission=request.getParameter("role");
        try {
            user.setEmail(""+email);
            user.setAddress(""+address);
            user.setPassword(""+pasword);
            user.setPermission(1);
            user.setRoleId(1);
            user.setUserName(""+username);
            /*final String dir = "F:\\upload";
            String originalFileName = avatar;
            int index = originalFileName.lastIndexOf(".");
            String ext = originalFileName.substring(index + 1);
            String fileName = System.currentTimeMillis() + "." + ext;
            File file = new File(dir + "/" + fileName);*/
            user.setAvatar("/image");

            userService.insert(user);
            resp.sendRedirect(req.getContextPath() + "/admin/user/list");

        } catch (Exception e) {
            resp.sendRedirect(req.getContextPath() + "/admin/user/add?e=1");
        }
    }
}

