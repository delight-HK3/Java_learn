public class ch3_5_learn2 {
    public static void main(String[] args) {
        for(int i = 0, j = 0; i < 5 && j < 10; i++, j=j+2){
            // 초기값을 2개 정할 수 있고 조건식과, 증감식도 2개로 정할 수 있습니다.
            System.out.printf(" %d ",i);
            System.out.printf("| %d |",j);
            // 첫 번째 부터 홀수순으로 나오는 부분은 i값 이고
            // 두 번째 부터 짝수순으로 나오는 부분은 j값 입니다.

            // i가 5이하가 아닌 동시에 j도 10이하가 아닌 경우 조건식이 false이기 때문에 
            // i는 4까지 j는 8까지 나온다.
        }
    }
}
