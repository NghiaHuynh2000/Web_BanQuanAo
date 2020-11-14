package Model_Query;

import Model_Connect.DBMain;

import java.sql.*;

public class BLProduct {
    DBMain db=null;
    public BLProduct(){
        db=new DBMain();
    }

    public ResultSet TableProduct() throws Exception
    {
        String strSQL="Select * From Product";
        return db.ExecuteQueryDataSet(strSQL);
    }
}

