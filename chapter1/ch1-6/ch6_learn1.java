import java.util.Scanner;

public class ch6_learn1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in); // scan 객체 선언

        int in = scan.nextInt(); // int타입의 값을 입력 합니다.
        float flo = scan.nextFloat(); // float타입의 값을 입력 합니다.
        double dou = scan.nextDouble(); // double타입의 값을 입력 합니다.
        String str = scan.next(); // 문자열을 입력 합니다.

        System.out.printf("in = %d%n",in);
        //입력된 num의 값이 출력됩니다.
        System.out.printf("flo = %.2f%n",flo);
        //입력된 flo의 소수점 2자리 까지 출력됩니다.
        System.out.printf("dou = %.3f%n",dou);
        //입력된 dou의 소수점 3자리 까지 출력됩니다.
        System.out.printf("str = %s%n",str);
        //입력된 str의 값이 출력됩니다.
    }
}