package Model_Connect;

import java.sql.*;

public class DBMain {
    String err="";
    Connection connection = null;
    Statement statement = null;
    ResultSet kq=null;
    public DBMain() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost/webbanquanao", "root", "hoang1503");
        }
        catch (ClassNotFoundException e) {

        }
        catch (SQLException e) {

        }
    }

    public ResultSet ExecuteQueryDataSet(String strSQL) throws SQLException
    {
        statement = connection.createStatement();
        kq = statement.executeQuery(strSQL);
        return kq;
    }

    public Boolean MyExecuteNonQuery(String strSQL) throws SQLException
    {
        Boolean f=false;
        try {
            statement = connection.createStatement();
            statement.executeUpdate(strSQL);

            f=true;
        }
        catch (SQLException e)
        {

        }
        return f;
    }
}
