package Model_Table;

public class TbProduct {
    private int id;
    private String image;
    private String name;
    private float price;
    private int cate_id;
    private String des;

    public TbProduct(int id, String image, String name, float price, int cate_id, String des) {
        this.id = id;
        this.image = image;
        this.name = name;
        this.price = price;
        this.cate_id = cate_id;
        this.des = des;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getCate_id() {
        return cate_id;
    }

    public void setCate_id(int cate_id) {
        this.cate_id = cate_id;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
}
