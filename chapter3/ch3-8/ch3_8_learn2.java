public class ch3_8_learn2 {
    public static void main(String args[]) {
        int num = 0;
        run : while(true){ // while문에 run이름을 작성
            while(true){
                num++;
                if(5 < num){
                    break run; 
                    // run while을 탈출시키기 때문에
                    // num값 6이 run while 루프 밖에 있는 
                    // printf문에 6이 출력이 된다.
                }
            } // while end
        } // run while end
        System.out.printf("%d",num); // 6이 출력
    }
}
