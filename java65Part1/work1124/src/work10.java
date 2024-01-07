public class work10 {
//    public static void main(String[] args) {
//        System.out.println(5);
//        for (int i = 0; i < 5; i++) {
//            System.out.println("*****");
//        }
//    }

//    public static void main(String[] args) {
//        System.out.println(6);
//        for (int i = 0; i < 6; i++) {
//            for (int j = 0; j < i+1; j++) {
//                System.out.print("*");
//            }
//            System.out.println("");
//        }
//    }

//        public static void main(String[] args) {
//            int rows = 5;
//
//            for (int i = 1; i <= rows; i++) {
//                // 打印空格
//                for (int j = rows; j > i; j--) {
////                    每次打5 4 3 2 1个空格
//                    System.out.print(" ");
//                }
//
//                // 打印星号
//                for (int k = 1; k <= (2 * i - 1); k++) {
//                    //每次打 1 3 5 7 9 个*
//                    System.out.print("*");
//                }
//
//                // 换行 每一行打完换行
//                System.out.println();
//            }
//        }

//    public static void main(String[] args) {
//        int rows = 6;
//        for (int i = 0; i <= rows; i++) {
//            // 打印空格
//            for (int j = rows; j > i; j--) {
////                    每次打5 4 3 2 1个空格
//                System.out.print("*");
//            }
//            // 换行 每一行打完换行
//            System.out.println();
//        }
//    }

//        public static void main(String[] args) {
//            int rows = 5;
//
//            for (int i = rows; i >= 1; i--) {
//                // 打印空格
//                for (int j = rows; j > i; j--) {
//                    System.out.print(" ");
//                }
//
//                // 打印星号
//                for (int k = 1; k <= (2 * i - 1); k++) {
//                    System.out.print("*");
//                }
//
//                // 换行
//                System.out.println();
//            }
//        }

//    public static void main(String[] args) {
//        int rows = 5;
//        //上半部分
//        for (int i = 0; i < rows; i++) {
//            // 打印空格
//            for (int j = rows; j > i; j--) {
//                System.out.print(" ");
//            }
//
//            // 打印星号
//            for (int k = 1; k <= (2 * i - 1); k++) {
//                System.out.print("*");
//            }
//
//            // 换行
//            System.out.println();
//        }
//        //下半部分
//        for (int i = rows; i >= 1; i--) {
//            // 打印空格
//            for (int j = rows; j > i; j--) {
//                System.out.print(" ");
//            }
//
//            // 打印星号
//            for (int k = 1; k <= (2 * i - 1); k++) {
//                System.out.print("*");
//            }
//
//            // 换行
//            System.out.println();
//        }
//    }

    public static void main(String[] args) {
        int rows = 5;
        //上半部分
        for (int i = 0; i < rows; i++) {
            // 打印空格
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }

            // 打印星号
            for (int k = 1; k <= (2 * i - 1); k++) {
                if (k == 1 || k == (2 * i - 1)) {
                    System.out.print("*"); // 打印*号
                } else {
                    System.out.print(" "); // 打印空格
                }
            }

            // 换行
            System.out.println();
        }
        //下半部分
        for (int i = rows; i >= 1; i--) {
            // 打印空格
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }

            // 打印星号
            for (int k = 1; k <= (2 * i - 1); k++) {
                if (k == 1 || k == (2 * i - 1)) {
                    System.out.print("*"); // 打印*号
                } else {
                    System.out.print(" "); // 打印空格
                }
            }

            // 换行
            System.out.println();
        }
    }

    }



