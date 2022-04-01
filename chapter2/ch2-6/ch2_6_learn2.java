public class test {
    public static void main(String[] args) {
        char ch1 = 'a';
        char ch2 = 'A';

        System.out.println(ch1 < ch2); // false
        // ch1에 저장되어있는 a를 int로 변환하면 97, ch2에 저장되어있는 A는 65 
        // 이렇게 두 개가 나옵니다, 두 정수를 비교했을 때 97 < 65 식을 적용하면
        // 거짓이기 때문에 false가 나옵니다.
        System.out.println(ch1 > ch2); // true
        // ch1에 저장되어있는 a를 int로 변환하면 97, ch2에 저장되어있는 A는 65 
        // 이렇게 두 개가 나옵니다, 두 정수를 비교했을 때 97 > 65 식을 적용하면
        // 참이기 때문에 true가 나옵니다.
    }
}