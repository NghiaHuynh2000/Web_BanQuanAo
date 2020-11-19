package Model_Query;

import Model_Connect.DBMain;

import java.sql.*;

public class BLUser {
    DBMain db=null;
    public BLUser(){
        db=new DBMain();
    }

    public ResultSet TableUser() throws Exception
    {
        String strSQL="Select * From User";
        return db.ExecuteQueryDataSet(strSQL);
    }
}