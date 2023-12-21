import java.util.Objects;

public class checkItem {
    private String itemName;
    private String itemInfo;
    private Integer itemPrice;

    public checkItem() {
    }

    @Override
    public String toString() {
        return "项目名=" + itemName +
                " 项目单价=" + itemPrice +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        checkItem checkItem = (checkItem) o;
        return Objects.equals(itemName, checkItem.itemName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemName);
    }

    public checkItem(String itemName, String itemInfo, Integer itemPrice) {
        setItemName(itemName);
        setItemInfo(itemInfo);
        setItemPrice(itemPrice);
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemInfo() {
        return itemInfo;
    }

    public void setItemInfo(String itemInfo) {
        this.itemInfo = itemInfo;
    }

    public Integer getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(Integer itemPrice) {
        this.itemPrice = itemPrice;
    }
}
