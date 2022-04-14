public class ch3_6_learn4 {
    public static void main(String[] args) {
        for(int i = 0; i < 11; i=i+2 ) {
            // 모래시계의 점자를 11부터 출력
            for(int k = 0; k < i; k=k+2 ) {
                // 모래시계를 만드려면 공백이 필요한데
                // 공백은 i의 값과 k의 값을 비교하여 공백을 낸다.
                // 2번째 반복하는 경우에는 i가 2이고 0과 비교를 하면 첫번째 는 참이고
                // i가 2이고 k에 2더하면 2와 2가 나오는데 같기 때문에 for문을 이탈한다.
                System.out.printf(" ");
            }
            for(int j = 0; j < 11-i; j++ ) {
                System.out.printf("*");
                // 11에 i를 뺀만큼 *을 출력한다.
            }
            System.out.printf("%n");
            //반복을 마치면 다음줄로 이동
        }
        for(int i = 9; i > 0; i=i-2 ) {
            for(int k = 1; k < i; k=k+2 ) {
                // 처음에는 0과 9를 바교 하여 참이기 때문에 공백이 하나 출력된다.
                // i의 값이 9이면 k의 값이 1 3 5 7 로 올라가 결국 9가 되면 조건이 거짓이 
                // 되기 때문에 공백 4개를 출력시킨다.  
                System.out.printf(" ");
            }
            for(int j = 0; j <= 11-i; j++ ) {
                System.out.printf("*");
                // 11에 i를 뺀만큼 *을 출력한다.
            }
            System.out.printf("%n");
            //반복을 마치면 다음줄로 이동
        }
    }
}
