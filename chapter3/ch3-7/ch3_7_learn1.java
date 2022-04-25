public class ch3_7_learn1 {
    public static void main(String[] args) {
        int sum = 0;
        int num = 0;
        while (true){ // 무한루프
            if(sum > 50){
                break; // while문을 벗어난다.
            }
            num++; 
            sum = sum + num; 
            // 0 1 3 6 10 15 21 28 36 45 55
            // 55되는 시점에서 50보다 크기 때문에 반복문을 나간다.
        }// while end
        System.out.printf("num = %d%n",num);
        System.out.printf("sum = %d",sum);
    }
}
