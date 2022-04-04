import java.util.Scanner;

public class ch3_2_learn1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);// scan 객체 생성
        int su1 = scan.nextInt(); // int타입의 값을 입력하여 su1에 저장
        if (20 <= su1){// su1이 20이상일 경우
            System.out.printf("입력값 %d는 20이상입니다.%n",su1);
        }
        else if (10 <= su1 && su1 <= 19){//su1이 10이상 19이하일 경우
            System.out.printf("입력값 %d는 10 ~ 19사이에 있습니다.%n",su1);
        }
        else{// 10보다 낮을 경우
            System.out.printf("입력값 %d는 10보다 낮습니다.",su1);
        }
    }
}
