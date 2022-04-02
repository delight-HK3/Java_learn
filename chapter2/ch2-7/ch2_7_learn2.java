public class ch2_7_learn2 {
    public static void main(String[] args) {
        int su1 = 10;

        boolean bool = su1 % 2 == 0 || su1 % 3 == 0;
        // 연산 과정
        // 1. 10 % 2 == 0 || 10 % 3 == 0
        // 2. 0 == 0 || 1 == 0
        // 3. true || false
        // 4. OR 연산이기 때문에 하나라도 true면 true가 나옴
        System.out.println(bool);// true
    }
}