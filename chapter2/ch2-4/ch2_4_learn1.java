public class ch2_4_learn1{
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 2;

        System.out.printf("%d%n",num1 / num2); // 5
        // 같은 int자료형이기 때문에 int자료형으로 연산
        System.out.printf("%.2f%n",num1 / (float)num2); // 5.00 
        // int / float 연산순서
        // 1. int보다 범위가 큰 float타입으로 자동형변환
        // 2. float / float 로 변환 
        // 3. 5.00이 결과로 나옴
    }
}
