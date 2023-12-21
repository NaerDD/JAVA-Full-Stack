import java.util.ArrayList;

//套餐类(多个 装item对象)
public class thali {
    private String tname;
    private ArrayList<item> item;

    public thali() {

    }
    //添加集合 只添加了名字
    public thali(String tname) {
        this.setTname(tname);
    }
    //添加集合中的项目集合
    public thali(ArrayList<item> item) {
        this.setItem(item);
    }

    public thali(String tname, ArrayList<item> item) {
        this.setTname(tname);
        this.setItem(item);
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public ArrayList<item> getItem() {
        return item;
    }

    public void setItem(ArrayList<item> item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "tname='" + tname + '\'' +
                ", item=" + item +
                '}';
    }
}
