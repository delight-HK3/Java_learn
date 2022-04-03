public class test {
    public static void main(String[] args) {
        int num = 16;
        if(5 <= num && num <= 15)
            num++;
            System.out.printf("%d 는 5 ~ 15 사이의 수입니다.%n",num);
            //만약 출력문 까지 영향이 있었으면 출력문이 실행되지 않습니다.
            System.out.printf("%d 는 5 ~ 15 사이의 수입니다.",num);
            //만약 출력문 까지 영향이 있었으면 출력문이 실행되지 않습니다.
    }
}