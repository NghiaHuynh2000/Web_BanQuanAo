package Model_Table;

public class TbCartItem {
    private String id;
    private int quantity;
    private float unitPrice;
    private int pro_id;
    private String cat_id;

    public TbCartItem(String id, int quantity, float unitPrice, int pro_id, String cat_id)
    {
        this.id=id;
        this.quantity=quantity;
        this.unitPrice=unitPrice;
        this.pro_id=pro_id;
        this.cat_id=cat_id;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(float unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getPro_id() {
        return pro_id;
    }

    public void setPro_id(int pro_id) {
        this.pro_id = pro_id;
    }

    public String getCat_id() {
        return cat_id;
    }

    public void setCat_id(String cat_id) {
        this.cat_id = cat_id;
    }
}
