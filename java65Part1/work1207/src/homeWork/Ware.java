package homeWork;

public class Ware {
    //属性描述该实体类的数据结构
    private String wareName;
    private double price;
    private String id;
    private int count;

    public Ware(String wareName, double price, String id, int count) {
        this.setWareName(wareName);
        this.setPrice(price);
        this.setId(id);
        this.setCount(count);
    }

    public Ware() {
    }


    public String getWareName() {
        return wareName;
    }

    public void setWareName(String wareName) {
        this.wareName = wareName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Ware{" +
                "wareName='" + wareName + '\'' +
                ", price=" + price +
                ", id='" + id + '\'' +
                ", count=" + count +
                '}';
    }
}
