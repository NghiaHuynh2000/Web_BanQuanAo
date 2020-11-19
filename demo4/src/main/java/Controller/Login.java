package Controller;

import Model_Query.BLLoginAdmin;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Login")
public class Login extends HttpServlet {
    BLLoginAdmin blLogin=new BLLoginAdmin();

    protected void FuncRequest(HttpServletRequest request, HttpServletResponse response) throws Exception, ServletException, IOException {
        String url = "/signin.jsp";
        String email=request.getParameter("email");
        String password=request.getParameter("password");
        if(email.equals("")){
            request.setAttribute("emailError","You must enter your email!");
            url="/signin.jsp";
        }
        else if(password.equals("")){
            request.setAttribute("passError","You must enter your password!");
            url="/signin.jsp";
        }
        else if(blLogin.CheckLogin(email,password))
            url="/result.jsp";
        else{
            request.setAttribute("passError","The email or the password is not correct!");
            url="/signin.jsp";
        }
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            FuncRequest(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            FuncRequest(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}