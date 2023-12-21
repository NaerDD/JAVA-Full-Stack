public class work5 {
    public static void main(String[] args) {
        String str1[] = {"AAA","AAB","AAA","AAC","BBC","BBD","AAC","DBB","AAE","AAD"};
        int length = str1.length;
        for (int i = 0; i < length; i++) {
            for (int j = i+1; j < length; j++) {
                //如果有相同的元素
                if(str1[i].equals(str1[j])){
                    //如果相同 则 保留i 从j位置后面全部数组对象前移
                    for (int k = j; k < length - 1; k++) {
                        str1[k] = str1[k + 1];
                    }
                    length--; // 由于删除元素导致数组长度变化，需要重新计算长度
                    j--; // 保证下次仍然可以检查到当前元素的其他位置
                }
            }
        }
        for (int i = 0; i < length; i++) {
            System.out.println(str1[i]);
        }
    }
}
