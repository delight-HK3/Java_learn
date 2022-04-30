import java.util.Scanner;

class Array { // 클래스 Array 선언
    int num1; // 멤버변수 num1
    int num2; // 멤버변수 num2
    public void getter(int num1, int num2){
        this.num1 = num1; // 랜덤 값 num1를 멤버변수 num1에 저장
        this.num2 = num2; // 랜덤 값 num2를 멤버변수 num2에 저장
    }
    public int setter(){
        int num = 0; // num 선언
        num = this.num1 + this.num2;
        // num에 num1, num2를 더한 값을 저장
        return num;
        // num을 리턴
    }
    public void view(int cnt){
        System.out.printf("==================%n");
        System.out.printf("array[%d]%n",cnt); // 배열의 현재 번호 출력
        System.out.printf("num1 : %d%n",this.num1);
        System.out.printf("num2 : %d%n",this.num2);
        System.out.printf("num1 + num2 = %d%n",setter());
        // setter함수로 num1, num2를 더해준다.
    }
}
public class ch5_3_learn2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("만들 배열의 수를 정수로 입력하십시오 : ");
        int count = scan.nextInt(); // 정수형으로 임의의 수를 입력받아 count에 저장
        Array[] array = new Array[count]; // count만큼 객체배열 생성
        for(int i = 0; i < count; i++){ // count에서 1뺀 만큼 반복
            array[i] = new Array(); 
            // 인스턴스의 주소를 array[i]에 저장
            array[i].getter((int)(Math.random() * 10),(int)(Math.random() * 10));
            // array의 getter함수를 통해 첫 번째, 두 번째 매개변수에 1 ~ 10 랜덤 값을 넣어준다.
        }
        for(int j = 0; j < count; j++){ // count에서 1뺀 만큼 반복
            array[j].view(j);
            // array의 view함수를 통해 객체배열의 내용을 출력
        }
    } 
}
