package Model_Query;

import Model_Connect.DBMain;

import java.sql.*;

public class BLLoginAdmin {
    DBMain db=null;
    public BLLoginAdmin()
    {
        db= new DBMain();
    }
    public Boolean CheckLogin(String email, String password) throws SQLException{
        String strSQL="Select * From user Where email='"+email+"' and password='"+password+"'";
        if(db.ExecuteQueryDataSet(strSQL).next())
            return true;
        return false;
    }
}
