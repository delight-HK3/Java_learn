import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("문자열을 입력하세요 : ");
        String str = scan.next();
        switch (str){ //num 변수와 case 입력값과 같은 case를 실행
            case "test1":{ // str에 test1이 입력된 경우
                System.out.println("test1 입력");
                break;
            }
            case "test2":{ // str에 test2이 입력된 경우
                System.out.println("test2 입력");
                break;
            }
            case "test3":{ // str에 test3이 입력된 경우
                System.out.println("test3 입력");
                break;
            }
            default:{ // str에 test1 ~ test3 이외의 값이 입력된 경우
                System.out.println("test1 ~ test3 이외의 문자열 입력");
            }
        }
    }
}