package com.webbanquanao.controller.admin;

import com.webbanquanao.service.UserService;
import com.webbanquanao.service.impl.UserServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = { "/admin/user/WelcomeAdduser"})
public class WelcomeAddUser extends HttpServlet {
    UserService userService = new UserServiceImpl();



    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String eString = req.getParameter("e");
        if (eString != null) {
            if (eString.equals("1")) {
                req.setAttribute("errMsg", "Username da ton tai!!!");
            }
        }
        RequestDispatcher dispatcher = req.getRequestDispatcher("/View/admin/add-user.jsp");
        dispatcher.forward(req, resp);
    }


}

