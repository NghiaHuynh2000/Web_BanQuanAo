package Controller;


import Model_Query.BLProduct;
import Model_Table.TbProduct;

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

@WebServlet("/Product_List")
public class Product_List extends HttpServlet {


    protected void FuncRequest(HttpServletRequest request, HttpServletResponse response) throws Exception, ServletException, IOException {
        String url="/View/admin/list-product.jsp";

        ArrayList<TbProduct> products=new ArrayList<TbProduct>();

        BLProduct blProduct=new BLProduct();
        ResultSet result=null;
        result=blProduct.TableProduct();

        while(result.next())
        {
            products.add(new TbProduct(result.getInt(1), (String) result.getString(2),result.getString(3),result.getFloat(4),result.getInt(5),result.getString(6)));
        }

        request.setAttribute("products",products);

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
}