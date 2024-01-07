public class HashCodeTest {
    public static void main(String[] args) {
        int hashCode = new Object().hashCode();
        // 异或求hash
        int hash = hashCode ^ (hashCode >>> 16);
        int hash1 = hashCode & (hashCode >>> 16);
        int hash2 = hashCode | (hashCode >>> 16);
        // 01000101010101000010010000101000
        System.out.println(hash);
        // 0100000101010100
        System.out.println(hash1);
        // 01000101010101000110010101111100
        System.out.println(hash2);

        // 设 数组长度为16， 下标在 0~15之间
        int index = (16 - 1) & hash; // 计算出的下标即为Node在数组的位置
        System.out.println("计算出的下标：" + index);
    }
}
