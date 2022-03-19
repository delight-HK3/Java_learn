public class ch_temp_learn1 {
    public static void main(String[] args) {
        //같은 값을 넣어도 지시자가 다르면 결과가 이렇게 나옵니다.
        System.out.printf("%d%n", 20); // 20 10진수 dec
        System.out.printf("%o%n", 20); // 24 8진수 oct
        System.out.printf("%x%n", 20); // 14 16진수 hex
        System.out.printf("%s%n", Integer.toBinaryString(20)); // 10100 2진수
    }
}
