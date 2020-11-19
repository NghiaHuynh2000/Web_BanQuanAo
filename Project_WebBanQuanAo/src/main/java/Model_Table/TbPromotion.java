package Model_Table;

import java.util.Date;

public class TbPromotion {
    private String new_id;
    private String new_name;
    private Date date_create;
    private String new_category;
    private Date date_open;
    private Date date_close;

    public TbPromotion(String new_id, String new_name, Date date_create, String new_category, Date date_open, Date date_close) {
        this.new_id = new_id;
        this.new_name = new_name;
        this.date_create = date_create;
        this.new_category = new_category;
        this.date_open = date_open;
        this.date_close = date_close;
    }

    public String getNew_id() {
        return new_id;
    }

    public void setNew_id(String new_id) {
        this.new_id = new_id;
    }

    public String getNew_name() {
        return new_name;
    }

    public void setNew_name(String new_name) {
        this.new_name = new_name;
    }

    public Date getDate_create() {
        return date_create;
    }

    public void setDate_create(Date date_create) {
        this.date_create = date_create;
    }

    public String getNew_category() {
        return new_category;
    }

    public void setNew_category(String new_category) {
        this.new_category = new_category;
    }

    public Date getDate_open() {
        return date_open;
    }

    public void setDate_open(Date date_open) {
        this.date_open = date_open;
    }

    public Date getDate_close() {
        return date_close;
    }

    public void setDate_close(Date date_close) {
        this.date_close = date_close;
    }
}
