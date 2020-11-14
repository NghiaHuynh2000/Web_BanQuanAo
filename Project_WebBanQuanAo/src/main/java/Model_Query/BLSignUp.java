package Model_Query;

import Model_Connect.DBMain;

import java.sql.SQLException;

public class BLSignUp {
    DBMain db=null;
    public BLSignUp()
    {
        db= new DBMain();
    }
    public Boolean SignUp(String emaildk, String passdk) throws SQLException {
        String strSQL = "Insert into user(email, password) values ('" +emaildk + "','" + passdk + "')";
        return db.MyExecuteNonQuery(strSQL);
    }
    public Boolean CheckSignUp(String email) throws SQLException{
        String strSQL="Select * From user Where email='"+email+"' ";
        if(db.ExecuteQueryDataSet(strSQL).next())
            return true;
        return false;
    }
}
