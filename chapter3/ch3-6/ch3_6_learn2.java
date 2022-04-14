public class ch3_6_learn2 {
    public static void main(String[] args) {
        for(int i=1; i<=10; i++){
            // 1 부터 시작하여 아래의 for문이 i값만큼 점자를 찍고나면
            // 다시 돌아와 2부터 시작하여 최종적으로 10번 점자를 찍는다.
            for(int j=1; j<=i; j++){
                System.out.printf("*");
            }
            System.out.println();
            //한 줄의 점자를 다찍으면 다음라인으로 이동
        }
    }
}
