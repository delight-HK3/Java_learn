import java.util.Scanner;

public class ch3_7_learn2 {
    public static void main(String[] args) {
        int innum = 0;
        do{
            Scanner scan = new Scanner(System.in);
            System.out.printf("50이상을 입력하세요 : ");
            innum = scan.nextInt(); // 정수입력
            if(innum >= 50){
                break; // 50이상을 입력하면 do-while문 탈출
            }
        }while (true);
        System.out.printf("%d를 입력했습니다.",innum);
        // 입력한 innum내용을 출력
    }
}
