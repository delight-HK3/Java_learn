public class test {
    public static void main(String[] args) {
        double dou1 = 3143.443545;

        double sum1 = Math.round(dou1 * 1000) / 1000.0;
        // 연산 순서
        // 1. 3143.443545 * 1000 = 31434435.45
        // 2. Math.round(3143443.545) / 1000.0
        // 3. 3143444 / 1000.0
        // 4. 3143.444
        System.out.println(sum1); // 3143.444
    }
}