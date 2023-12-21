//项目类(单个)
public class item {
    private String iname;
    private String details;
    private double price;

    public item() {
    }

    public item(String iname, String details, double price) {
        setName(iname);
        setDetails(details);
        setPrice(price);
    }

    public String getName() {
        return iname;
    }

    public void setName(String iname) {
        this.iname = iname;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "iname='" + iname + '\'' +
                ", details='" + details + '\'' +
                ", price=" + price +
                '}'+"\t";
    }
}
