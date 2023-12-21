public class productinfo {
    private int id;
    private String prodName;
    private double prodPrice;
    private String publisher;
    private String prodColor;
    private int prodCount;
    private int cateId;

    public productinfo() {
    }

    public productinfo(int id, String prodName, double prodPrice, String publisher, String prodColor, int prodCount, int cateId) {
        this.setId(id);
        this.setProdName(prodName);
        this.setProdPrice(prodPrice);
        this.setPublisher(publisher);
        this.setProdColor(prodColor);
        this.setProdCount(prodCount);
        this.setCateId(cateId);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public double getProdPrice() {
        return prodPrice;
    }

    public void setProdPrice(double prodPrice) {
        this.prodPrice = prodPrice;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getProdColor() {
        return prodColor;
    }

    public void setProdColor(String prodColor) {
        this.prodColor = prodColor;
    }

    public int getProdCount() {
        return prodCount;
    }

    public void setProdCount(int prodCount) {
        this.prodCount = prodCount;
    }

    public int getCateId() {
        return cateId;
    }

    public void setCateId(int cateId) {
        this.cateId = cateId;
    }

    @Override
    public String toString() {
        return "productinfo{" +
                "id=" + id +
                ", prodName='" + prodName + '\'' +
                ", prodPrice=" + prodPrice +
                ", publisher='" + publisher + '\'' +
                ", prodColor='" + prodColor + '\'' +
                ", prodCount=" + prodCount +
                ", cateId=" + cateId +
                '}';
    }
}
