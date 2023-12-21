public class Game {
    private Game(){};
    static String[] pokers = new String[54];
    public static void main(String[] args) {
        for (int i = 0; i < pokers.length; i++) {
            System.out.print(pokers[i]+" ");
        }
    }
    static {
        String[] number = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        String[] color = {"黑桃","梅花","方块","红桃"};
        int index = 0;
        for (int i = 0; i < color.length; i++) {
            for (int j = 0; j < number.length; j++) {
                pokers[index++] = color[i]+number[j];
            }
        }
        pokers[index++] = "大王";
        pokers[index++] = "小王";
    }
}
