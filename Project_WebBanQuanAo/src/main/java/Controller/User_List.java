package Controller;

import Model_Query.BLUser;
import Model_Table.TbUser;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

@WebServlet("/User_List")
public class User_List extends HttpServlet {


    protected void FuncRequest(HttpServletRequest request, HttpServletResponse response) throws Exception, ServletException, IOException {
        String url = "/View/admin/list-user.jsp";

        ArrayList<TbUser> users = new ArrayList<TbUser>();

        BLUser blUser = new BLUser();
        ResultSet result = null;
        result = blUser.TableUser();

        while (result.next()) {
            users.add(new TbUser(result.getInt(1), (String) result.getString(2), result.getString(3), result.getString(4), result.getString(5), result.getString(6),result.getInt(7)));
        }

        request.setAttribute("users", users);

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            FuncRequest(request, response);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e);
        }

    }
}
