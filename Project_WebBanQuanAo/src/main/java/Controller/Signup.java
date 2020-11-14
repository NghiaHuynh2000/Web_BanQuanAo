package Controller;

import Model_Query.BLLoginAdmin;
import Model_Query.BLSignUp;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Signup")
public class Signup extends HttpServlet {
    BLSignUp blsignup =new BLSignUp();

    protected void FuncRequest(HttpServletRequest request, HttpServletResponse response) throws Exception, ServletException, IOException {
        String url = "/user/error.jsp";
        String emaildk=request.getParameter("emaildk");
        String passdk=request.getParameter("passdk");
        String cfpassdk=request.getParameter("cfpassdk");
//        if(blLogin.CheckLogin(email,password))
//            url="/User/result.jsp";
        if(emaildk.equals("")){
            request.setAttribute("emaildkError","You must enter your Email!");
            url = "/User/signin.jsp";
        }
        else if(passdk.equals("")){
            request.setAttribute("passdkError","You must enter password!");
            url = "/User/signin.jsp";
        }
        else if(passdk.equals(cfpassdk)){
            if(blsignup.CheckSignUp(emaildk)){
                request.setAttribute("emaildkError","The email has been used.");
                url = "/User/signin.jsp";
            }
            else{
                blsignup.SignUp(emaildk,passdk);
                url="/User/result.jsp";
            }
        }
        else{
            request.setAttribute("cfpassdkError","The passwords didn't match. Try Again!");
            url = "/User/signin.jsp";


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