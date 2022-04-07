import java.util.Scanner;

public class ch3_3_learn3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("단일문자를 입력하세요 : ");
        String str = scan.next();
        char ch = str.charAt(0);
        // scanner에서 단일문자를 입력받는 함수는 없습니다, 그러니 입력은 문자열로 받지만
        // 맨 앞자리 문자만 잘라서 ch에 저장합니다.

        switch (ch){ //num 변수와 case 입력값과 같은 case를 실행
            case 'a':{ // str에 test1이 입력된 경우
                System.out.println("a 입력");
                break;
            }
            case 'b':{ // str에 test2이 입력된 경우
                System.out.println("b 입력");
                break;
            }
            case 'c':{ // str에 test3이 입력된 경우
                System.out.println("c 입력");
                break;
            }
            default:{ // str에 test1 ~ test3 이외의 값이 입력된 경우
                System.out.println("a ~ c 이외의 문자 입력");
            }
        }
    }
}
