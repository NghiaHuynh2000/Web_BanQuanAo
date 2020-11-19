package Model_Query;

import Model_Connect.DBMain;

import java.sql.ResultSet;

public class BLlstUser {
    DBMain db=null;
    public BLlstUser()
    {
        db= new DBMain();
    }
    public ResultSet TableAccount() throws  Exception{
        String strSQL="Select username, password From user";
        return db.ExecuteQueryDataSet(strSQL);
    }
}
