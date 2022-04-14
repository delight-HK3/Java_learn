public class test {
    public static void main(String[] args) {
	    for(int i=2; i<=9; i++){
            // 2부터 반복을 시작하여 아래의 반복을 마치면
            // 다시 돌아와 3부터 반복을 하는 방식으로 9까지 반복
           for(int j=1; j<=9; j++){
               // 2 * 1 부터 반복을 하여 2 * 9까지 반복을 하면 
               // 다시 3 * 1 부터 3 * 9 하는 방식으로 9까지 반복 
               System.out.printf("%d * %d = %d%n",i,j,i*j);
               // i의 저장값 * j의 저장값 = i * j의 값
           }
           System.out.println(); // 단이 하나 끝나면 줄 나누기
        }
    }
}