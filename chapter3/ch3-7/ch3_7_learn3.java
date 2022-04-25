import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // scan 객체 선언
        System.out.printf("임의의 수를 입력하세요 : ");
        int num = scan.nextInt(); // 정수를 입력하여 num에 저장
        while (num != 0){ // num이 0일 때까지 루프
            if(num%2==0){ // 2로 나누어서 나머지가 0인 경우 
                num--; // num을 1만큼 뺀다
                continue; // 다시 루프
            }
            System.out.printf("%d ",num);// 홀수를 출력
            num--; // num을 1만큼 뺀다
        } // while end
    }
}