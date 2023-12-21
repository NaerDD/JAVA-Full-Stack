public class work7_2 {
    public static void main(String[] args) {
        for (int i = 97; i < 100; i++) {
            for (int j = 97; j < 100; j++) {
                for (int k = 97; k < 100; k++) {
                    if(i!=j & i!=k & j!=k) {
                        System.out.println("" +(char)i+(char)j+(char)k);
                    }
                }
            }
        }
    }
}
