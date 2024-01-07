public class work9 {
    public static void main(String[] args) {
//        3.2006年培养学员8万人，每年增长25%，请问按此增长速度，到哪一年培训学员人数将达到20万人？
        int  year = 2006;
        int people = 80000;
        for (; people < 200000; year++) {
            people = (int) ((int)people*1.25);
        }
        System.out.println(year+"年人数达到20万人"+people);
    }

}
