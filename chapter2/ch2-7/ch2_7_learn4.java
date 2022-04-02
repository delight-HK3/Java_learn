public class ch2_7_learn4 {
    public static void main(String[] args) {
        char ch1 = 'd';

        boolean bool1 = 'a' < ch1 && ch1 < 'z';
        // 연산순서
        // 1. 'a'는 정수로 변경하면 97, 'z'는 122, 'd'는 100
        // 2. 97 < 100 && 100 < 122 
        // 3. true && true
        // 4. true가 bool1에 저장
        System.out.println(bool1);// true
    }
}