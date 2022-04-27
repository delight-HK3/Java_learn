import java.util.Scanner;

class Wheel{ // Wheel 클래스 선언
    int op1; // 멤버변수
    int op2; // 멤버변수
    int turn(int sum, int turn_count){ // 멤버 메서드
        int result = 0;
        for(int cnt = 1; cnt <= turn_count; cnt++){
            // cnt를 1로하고 매개변수로 입력한 turn_count만큼 반복
            result = sum + cnt;
            // 멤버 메서드에 입력한 매개변수를 1씩 더한 값을 result에 저장
        }
        return result; // result를 리턴
    }
}
public class test {
    public static void main(String[] args) {
        Wheel wheel = new Wheel(); // wheel참조변수를 선언과 동시에 Wheel인스턴스 주소를 wheel참조변수에 저장
        Scanner scan = new Scanner(System.in); // scan 객체 선언
        System.out.printf("초기값을 작성하십시오 : ");
        wheel.op1 = scan.nextInt(); // Wheel 클래스의 op1멤버변수에 정수형 입력값을 저장
        
        System.out.printf("반복할 횟수를 작성하십시오 : ");
        wheel.op2 = scan.nextInt(); // Wheel 클래스의 op2멤버변수에 정수형 입력값을 저장
        
        int num = wheel.turn(wheel.op1,wheel.op2);
        // Wheel 클래스의 turn 멤버 메소드를 실행한 후 리턴값을 변수 num에 저장
        System.out.printf("%d을(를) 1씩 %d번 더하면 %d가 나옵니다.",wheel.op1,wheel.op2,num);
    }
}