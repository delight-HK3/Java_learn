public class ch5_learn4 {
    public static void main(String[] args) {
        double test = 1.123413252;
        // %전체자리.소수점아래자리f
        // 전체 14자리 중 소수점 아래 10자리의 빈곳을 0으로 채움니다.
        System.out.printf("d=%14.10f%n",test);

        System.out.printf("[%s]%n","www.testtest.com");
        System.out.printf("[%d]%n",1122112211);
        //전체 출력을 합니다.

        System.out.printf("[%20s]%n","www.testtest.com");
        System.out.printf("[%20d]%n",1122112211);
        //문자열 20자리중 앞에서부터 공백을채우고 남은 부분을 url로 채움니다.

        System.out.printf("[%-20s]%n","www.testtest.com");
        System.out.printf("[%-20d]%n",1122112211);
        // 문자열 20자리중 앞에서부터 url로 채우고 남은 부분을 공백으로 채움니다.

        System.out.printf("[%.8f]%n",1.1122112211);
        System.out.printf("[%.8s]%n","www.testtest.com");
        // url의 앞에서부터 8자리만 출력합니다.

        System.out.printf("[%06d]%n", 15);
        System.out.printf("[%06f]%n", 15.12);
        System.out.printf("[%014.6f]%n", 15.12);
        // 14자리 중 앞에서부터 0으로 채우고 15.12를 출력시킨 후 남은 소수점아래 4자리를 0으로 채움니다.
        // 접미사 앞에 -를 붙여 앞에서부터 출력시키려 하면 에러가 나옵니다.
    }
}
