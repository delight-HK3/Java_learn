import java.util.Scanner;

public class ch3_3_learn1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("정수를 입력하세요 : ");
        int num = scan.nextInt();
        switch (num){ //num 변수와 case 입력값과 같은 case를 실행
            case 1:{ // num에 1이 입력된 경우
                System.out.println("1 입력");
                break;
            }
            case 2:{ // num에 2이 입력된 경우
                System.out.println("2 입력");
                break;
            }
            case 3:{ // num에 3이 입력된 경우
                System.out.println("3 입력");
                break;
            }
            default:{ // num에 1 ~ 3 이외의 값이 입력된 경우 
                System.out.println("1 ~ 3 이외의 수 입력");
            }
        }
    }
}
