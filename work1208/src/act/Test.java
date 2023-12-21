package act;

public class Test {
    public static void main(String[] args) {
        Player p1 = new Player("刘小翔",23,"男");
        p1.selfIntroduce();

        System.out.println("====================");

        Athlete a1 = new Athlete("章依",27,"女");
        a1.selfIntroduce();
    }
}
