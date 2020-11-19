package Model_Query;

import Model_Connect.DBMain;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import data.account;
public class BLlistUser {
    DBMain db=null;
    public BLlistUser()
    {
        db= new DBMain();
    }
    public  ArrayList<account> getListAccount(){
        ArrayList<account> list = new ArrayList<>();
        try{

            String strSQL="Select * From user";

            ResultSet rs = db.ExecuteQueryDataSet(strSQL);
            while (rs.next()){
                account a = new account(rs.getString(1), rs.getString(2), rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7));
                list.add(a);
            }
            return list;
        }
        catch (Exception e){
        }
        return null;
    }

}
