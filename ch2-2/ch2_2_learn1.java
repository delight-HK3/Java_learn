public class test{
    public static void main(String[] args) {
        int su1 = 10;
        int su2;
        boolean result;
        su2 = -su1 + 3;
        System.out.println(su2); // -7
        // 단항 연산자는 이항 연산자보다 우선순위가 높다, 그래서 su1의 부호를 바꾼 다음
        // 덧셈이 수행된다. 여기서 su1의 '-'는 뺄셈 연산자가 아니라 부호 연산자이다.

        su2 = su1 + 3 * 10;
        System.out.println(su2); // 40
        // 기본적인 사칙연산에서는 곱셈과 나눗셈이 덧셈 뺄셈보다 우선순위가 높다.
        // 그래서 '3*y'가 먼저 계산된다.

        result = su1 > 9 && su1 < 11;
        System.out.println(result); // true
        // 비교 연산자가 먼저 수행되면서 su1 > 9 와 su1 > 11 연산이 먼저 진행되면서
        // 둘의 결과는 참이기 때문에 && 연산자는 둘다 조건이 true여만 true이기 때문에 result에 true가 들어간다.
    }
}