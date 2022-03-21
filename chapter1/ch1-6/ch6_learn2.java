import java.util.Scanner;

public class ch6_learn2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in); // scan 객체 선언

        String str = scan.nextLine();
        //문자열을 입력받은 후 입력받은 값을 변수 str에 저장합니다.
        int in = Integer.parseInt(str);
        //str을 Int형으로 형변환 시킨 후 변수 in에 저장합니다.

        System.out.printf("in = %d%n",in);
        //입력된 str값이 int타입으로 변경되어 출력됩니다.
    }
}