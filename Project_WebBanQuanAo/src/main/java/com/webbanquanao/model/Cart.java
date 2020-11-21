package com.webbanquanao.model;

import java.io.Serializable;
import java.util.Date;

public class Cart implements Serializable{
    private String id;
    private int u_id;
    private Date buyDate;
    private Boolean action;
    private User buyer;

    public Cart()
    {
        super();
    }
    public Cart(String id, int u_id, Date buyDate, Boolean action, User buyer) {
        super();
        this.id = id;
        this.u_id = u_id;
        this.buyDate = buyDate;
        this.action = action;
        this.buyer=buyer;
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

    public User getBuyer() {
        return buyer;
    }

    public void setBuyer(User buyer) {
        this.buyer = buyer;
    }
}
