import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainApp {
    //初始化4个交易员
    private Trader raoul = new Trader("Raoul", "Cambridge");
    private Trader mario = new Trader("Mario", "Milan");
    private Trader alan = new Trader("Alan", "Cambridge");
    private Trader brian = new Trader("Brian", "Cambridge");
    private Trader xxx = new Trader("XXX", "newZeLand");
    private Trader xxz = new Trader("CCC", "newZeLandX");

    //添加交易记录到List中去
    private List<Transaction> transactionList = Arrays.asList(
            new Transaction(brian, 2011, 300),
            new Transaction(raoul, 2012, 1000),
            new Transaction(raoul, 2011, 400),
            new Transaction(mario, 2012, 710),
            new Transaction(mario, 2012, 700),
            new Transaction(alan, 2012, 950),
            new Transaction(xxx, 2012, 950)
    );

    //TODO ...待添加的方法...

//    找出2011年发生的所有交易，并按交易额排序（从高到低）。
    void test_01 () {
        //将transactionList的数据转成流 存到list 流不会对原始数据操作
        List<Transaction> list = transactionList.stream()
                //过滤其他年份
                .filter(item -> item.getYear().equals(2011))
                //排序 降序 反写
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                //将流转为list
                .collect(Collectors.toList());
        System.out.println(list);
    }
    //交易员都在哪些不同的城市工作过？
    void test_02 () {
        //从交易记录中查,所以没交易过的交易员的城市不会显示  newZeLandX不会显示
        List<String> list = transactionList.stream()
                //Transaction->Transaction.getTrader
                //Trader->Trader.getCity
                .map(Transaction::getTrader)
                .map(Trader::getCity)
                .distinct()
                .collect(Collectors.toList());
        System.out.println(list);
    }
    //查找所有来自Cambridge的交易员，并按姓名排序。
    void test_03(){
        //转成流
        List<Trader> list = transactionList.stream()
                //拿到交易员名单
                .map(Transaction::getTrader)
                //过滤不在Cambridge的交易员
                .filter(trader -> trader.getName().equals("Cambridge"))
                //去重
                .distinct()
                //排序 (e1, e2) -> e1.getName().compareTo(e2.getName())
                //Comparator.comparing() 比较器 用什么比 Trader对象的getName方法 返回值来比
                .sorted(Comparator.comparing(Trader::getName))
                .collect(Collectors.toList());
        System.out.println(list);
    }
    //返回所有交易员的姓名字符串，按字母顺序排序。
    void test_04(){
        //转成流
        List<String> list = transactionList.stream()
                //拿到交易员名单
                .map(Transaction::getTrader)
                //拿到交易员名字名单
                .map(Trader::getName)
                //去除重复
                .distinct()
                /**
                 * (在没有拿到交易员名字名单时的写法)
                 * 比较原始写法
                 * (e1,e2)->e1.getName().compareTo(e2.getName())
                 * 比较缩写
                 * .sorted(Comparator.comparing(Trader::getName))
                 */
                //根据String的比较器来排序
                .sorted(String::compareTo)
                //还原成list
                .collect(Collectors.toList());
        System.out.println(list);
    }
    //返回所有交易员的姓名字符串，按字母顺序排序。
    void test_04_2 () {
        String concatStr = transactionList.stream()
                .map(Transaction::getTrader).map(Trader::getName)
                .distinct()
                .sorted(String::compareTo)
                //reduce 在第一个元素前拼接上? 然后后面的使用?操作 这里使用的字符串的concat方法进行拼接
                .reduce("_", String::concat);
        System.out.println(concatStr);
    }
    //返回所有交易员的姓名字符串，按字母顺序排序。
    void test_04_3() {
        String concatStr = transactionList.stream()
                //拿交易员名字名单
                .map(Transaction::getTrader).map(Trader::getName)
                //去重
                .distinct()
                //扁平化 每个名字 去调用本类中的自定义方法
                .flatMap(this::filterCharacter)
                //将返回的字母进行大小比较排序
                .sorted(String::compareTo)
                .reduce("", String::concat);
        System.out.println(concatStr);
    }
    // 将字符串转成char类型 一个一个的字母返回
    private Stream<String> filterCharacter(String str) {
        List<String> list = new ArrayList<>();
        for (char ch : str.toCharArray()) {
            list.add(String.valueOf(ch));
        }
        return list.stream();
    }
    //有没有交易员在Milan工作。
    void test_05() {
        List<Trader> list = transactionList.stream()
                //拿到交易员
                .map(Transaction::getTrader)
                //去重复
                .distinct()
                //过滤出 在Milan的交易员
                .filter(item -> item.getCity().equals("Milan"))
                .collect(Collectors.toList());
        System.out.println(list);
    }
    //打印生活在Cambridge的交易员的所有交易额。
    //为什么这个可以
    void test_06(){
        Integer Sum = transactionList.stream()
                //过滤不在Cambridge的交易员
                .filter(item -> item.getTrader().getCity().equals("Cambridge"))
                .collect(Collectors.summingInt(Transaction::getValue));
        System.out.println(Sum);
    }
    //为什么这个不行 因为流在.map操作后 已经从Transaction流 变成了一个 Trader流 但是此时的Trader流已经丢失了上下文 他身上并没有getter/setter方法
//    void test_06_1(){
//        Integer Sum = transactionList.stream()
//                //拿到交易员
//                .map(Transaction::getTrader)
//                //过滤不在Cambridge的交易员
//                .filter(item -> item.getCity().equals("Cambridge"))
//                .collect(Collectors.summingInt(Transaction::getValue));
//        System.out.println(Sum);
//    }
    //如果想要分步 执行改如何修改上段代码?
        void test_06_2(){
        Integer Sum = transactionList.stream()
                //拿到交易员
//                .map(Transaction::getTrader)
                //过滤不在Cambridge的交易员
//                .filter(trader -> trader.getCity().equals("Cambridge"))
                .filter(item -> item.getTrader().getCity().equals("Cambridge"))
                .map(Transaction::getValue)
                .reduce(0, Integer::sum);
        System.out.println(Sum);
    }
    //所有的交易额中，最高的交易额是多少？
    //这里 为什么不是Integer 而是Optional<Integer>?
    void test_07() {
        Optional<Integer> max = transactionList.stream()
                .map(Transaction::getValue)
                .collect(Collectors.maxBy(Integer::compareTo));
        System.out.println(max);
    }
    //所有的交易额中，最高的交易额是多少？
    void test_07_02(){
            Optional<Integer> max = transactionList.stream()
                    .map(Transaction::getValue)
                    .max(Integer::compareTo);
            System.out.println(max);
    }
    //所有的交易额中，找到交易额最小的交易  找交易 不是找交易金额 通过最小金额 找回交易订单
    void test_08_03() {
        Optional<Transaction> min = transactionList.stream()
                .min(Comparator.comparing(Transaction::getValue));
        System.out.println(min);
    }
    //
    void test_08_04() {
        Optional<Transaction> min = transactionList.stream()
                .collect(Collectors.minBy((e1, e2) -> e1.getValue().compareTo(e2.getValue())));
        System.out.println(min);
    }
    public static void main(String[] args) {
        MainApp mainApp = new MainApp();
//        mainApp.test_01();
//        mainApp.test_02();
//        mainApp.test_03();
//        mainApp.test_04();
//        mainApp.test_04_2();
//        mainApp.test_04_3();
//        mainApp.test_05();
//        mainApp.test_06_2();
//        mainApp.test_07();
//        mainApp.test_07_02();
        mainApp.test_08_03();
        mainApp.test_08_04();
    }

}
