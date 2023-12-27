package ProductManager.bean;

import java.sql.Date;

public class product {
    public product() {
    }

    /**
     *   `id` int(10) NOT NULL AUTO_INCREMENT,
     * 	`prodName` VARCHAR(50) NOT NULL,
     * 	`proPrice` FLOAT,
     * 	`publisher` VARCHAR(20),
     * 	`createTime` date,
     * 	`prodColor` VARCHAR(10),
     * 	`prodCount` int(10),
     * 	`cateId` int(10)
     */
    private Integer id;
    private String prodName;
    private Float proPrice;
    private String publisher;
    private Date date;

    public product(Integer id, String prodName, Float proPrice, String publisher, Date date, String prodColor, Integer prodCount, Integer cateId) {
        this.setId(id);
        this.setProdName(prodName);
        this.setProPrice(proPrice);
        this.setPublisher(publisher);
        this.setDate(date);
        this.setProdColor(prodColor);
        this.setProdCount(prodCount);
        this.setCateId(cateId);
    }

    private String prodColor;
    private Integer prodCount;
    private Integer cateId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public Float getProPrice() {
        return proPrice;
    }

    public void setProPrice(Float proPrice) {
        this.proPrice = proPrice;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getProdColor() {
        return prodColor;
    }

    public void setProdColor(String prodColor) {
        this.prodColor = prodColor;
    }

    public Integer getProdCount() {
        return prodCount;
    }

    public void setProdCount(Integer prodCount) {
        this.prodCount = prodCount;
    }

    public Integer getCateId() {
        return cateId;
    }

    public void setCateId(Integer cateId) {
        this.cateId = cateId;
    }
}
