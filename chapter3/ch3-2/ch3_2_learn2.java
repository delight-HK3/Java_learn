import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);// scan 객체 생성
        System.out.printf("몸무게를 입력하세요 : ");
        double weight = scan.nextDouble(); //몸무게를 입력

        System.out.printf("키를 입력하세요 : ");
        double height = scan.nextDouble(); //키를 입력

        double BMI = weight / (height * height * 0.0001); // BMI계산법
        if(25.9 <= BMI){// BMI가 25.9이상일 경우
            System.out.printf("BMI : %.1f 비만 입니다.%n",BMI);
        }
        else if(24.0 <= BMI && BMI <= 25.0){// BMI가 24.0이상 25.0이하일 경우
            System.out.printf("BMI : %.1f 과체중 입니다.",BMI);
        }
        else if(18.5 <= BMI && BMI <= 23.9){// BMI가 18.5이상 23.이하일 경우
            System.out.printf("BMI : %.1f 정상 입니다.",BMI);
        }
        else{// BMI가 18.5이하일 경우
            System.out.printf("BMI : %.1f 저체중 입니다.",BMI);
        }
    }
}