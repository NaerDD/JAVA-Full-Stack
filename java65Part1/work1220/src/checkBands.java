import java.util.HashMap;

public class checkBands {
    private HashMap<Integer,checkItem> checkItem;
    private String BandsName;
    private Integer BandsSumPrice;

    //新建项目 只需要项目名字 后续再进行添加
    public checkBands(String bandsName) {
        this.BandsName = bandsName;
        this.checkItem = new HashMap<>();
        //初始金额
        this.BandsSumPrice = 0;
    }


    @Override
    public String toString() {
        return "套餐目录:" +
                "套餐号:" + BandsName + " 套餐包含项目:" + checkItem + " 套餐总价=" + BandsSumPrice;
    }

    public HashMap<Integer, checkItem> getCheckItem() {
        return checkItem;
    }

    //添加项目
    public void setCheckItem(int key,checkItem c1) {
        this.checkItem.put(key,c1);
        //调用set将价格累加到总价上去
        this.setBandsSumPrice(this.getBandsSumPrice()+c1.getItemPrice());
    }

    public String getBandsName() {
        return BandsName;
    }
    //修改套餐名
    public void setBandsName(String bandsName) {
        BandsName = bandsName;
    }

    public Integer getBandsSumPrice() {
        return BandsSumPrice;
    }

    public void setBandsSumPrice(Integer bandsSumPrice) {
        BandsSumPrice = bandsSumPrice;
    }
}
