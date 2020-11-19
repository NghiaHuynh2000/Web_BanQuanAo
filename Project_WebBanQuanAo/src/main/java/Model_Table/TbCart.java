package Model_Table;

import java.util.Date;

public class TbCart {
    private String id;
    private int u_id;
    private Date buyDate;
    private Boolean action;

    public TbCart(String id, int u_id, Date buyDate, Boolean action) {
        this.id = id;
        this.u_id = u_id;
        this.buyDate = buyDate;
        this.action = action;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getU_id() {
        return u_id;
    }

    public void setU_id(int u_id) {
        this.u_id = u_id;
    }

    public Date getBuyDate() {
        return buyDate;
    }

    public void setBuyDate(Date buyDate) {
        this.buyDate = buyDate;
    }

    public Boolean getAction() {
        return action;
    }

    public void setAction(Boolean action) {
        this.action = action;
    }
}
