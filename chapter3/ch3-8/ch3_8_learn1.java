public class ch3_8_learn1 {
    public static void main(String args[]) {
        int num = 0;
        turn : for(int x=1; x<=9; x++){ // for문에 turn이름을 작성
            for(int y=1; y<=9; y++){
                if(y==4){
                    // continue turn;
                    
                    // turn for문으로 돌아가면 다시한번 아래에 있는 for문을
                    // 반복시키는데 그렇게하면 x의 값은 증가하지만 매번 
                    // continue가 되기 때문에 x가 10이 되면 자연스럽게 
                    // turn for 루프를 빠져나온다, 그래서  
                    // turn for 바깥에 있는 printf에는 0이 나온다.
                    
                     break turn; 
                    
                    // 첫 번째 for문을 나가는 의미이기 때문에 
                    // turn for 바깥에 있는 printf에는 0이 나온다.
                }
            }// for end
            num = num + x;  
            System.out.printf("%d ",num); // 0이 출력
        }// turn for end
        System.out.printf("%n%d",num); // 0이 출력
    }
}
