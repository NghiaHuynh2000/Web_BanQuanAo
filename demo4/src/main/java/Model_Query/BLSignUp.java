package Model_Query;

import Model_Connect.DBMain;

import java.sql.SQLException;

public class BLSignUp {
    DBMain db=null;
    public BLSignUp()
    {
        db= new DBMain();
    }
    public Boolean SignUp(String username, String password) throws SQLException {
        String strSQL = "insert into User(username, password) values ('" +username + "','" + password + "')";
        return db.MyExecuteNonQuery(strSQL);
    }
    public Boolean CheckSignUp(String username) throws SQLException{
        String strSQL="Select * From User Where username='"+username+"' ";
        if(db.ExecuteQueryDataSet(strSQL).next())
            return true;
        return false;
    }
}
