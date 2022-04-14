public class test {
    public static void main(String[] args) {
        for(int i=10; 1<=i; i--){
            // 큰 순으로 나열하기위해서는 10부터 시작하여 1씩 
            // 빼주면 처음에는 10개를 출력하고 다음 라인에는 9개를 출력한다.
            for(int j=1; j<=i; j++){
                System.out.printf("*");
            }
            System.out.println();
            //한 줄의 점자를 다찍으면 다음라인으로 이동
        }
    }
}