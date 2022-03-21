public class ch_temp_learn2 {
    public static void main(String[] args) {
        // 8진수와 16진수의 접두사도 같이 출력하려면 지시자앞에 접두사를 붙여서 출력시키면 됩니다.
        System.out.printf("%#o%n", 20); // 024
        System.out.printf("%#x%n", 20); // 0x24
        System.out.printf("%#X%n", 20); // 0X24
    }
}
