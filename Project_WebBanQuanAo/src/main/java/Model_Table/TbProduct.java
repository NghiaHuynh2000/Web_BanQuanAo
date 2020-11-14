package Model_Table;

public class TbProduct {
    private int id;
    private String name;
    private float price;
    private int cate_id;
    private String des;
    private String image;

    public TbProduct(int id,String name,float price,int cate_id,String des,String image)
    {
        this.id=id;
        this.name=name;
        this.price=price;
        this.cate_id=cate_id;
        this.des=des;
        this.image=image;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setCate_id(int cate_id) {
        this.cate_id = cate_id;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public int getCate_id() {
        return cate_id;
    }

    public String getDes() {
        return des;
    }

    public String getImage() {
        return image;
    }
}
