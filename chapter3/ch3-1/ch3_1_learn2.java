import java.util.Scanner;

public class ch3_1_learn2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("정수를 입력 : ");

        if(scan.hasNextInt()){
            System.out.printf("정수가 입력되었습니다.");
        }else{
            // 문자, 문자열, 실수 
            System.out.printf("정수외의 수가 입력되었습니다.");
        }
    }
}