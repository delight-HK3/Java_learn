public class ch2_5_learn3 {
     static double MakeRound(double index, int number){
        int round = 1;
        for(int i = 1; i < number; i++){
            round = round * 10;
            // 3이 입력이 들어오면 10을 3번 곱하여 1000이 round에 저장됩니다.
        }
        double result = Math.round(index * round) / (double)round;
         // 연산 순서
         // 1. 3143.443545 * 1000 = 31434435.45
         // 2. Math.round(3143443.545) / 1000.0
         // 3. 3143444 / 1000.0
         // 4. 3143.444 리턴
        return result;
    }
    public static void main(String[] args) {
        double dou1 = 3143.443545;
        double dou = MakeRound(dou1, 4);
        //MakeRound(반올림할 숫자, 반올림할 자릿수);
        System.out.println(dou);
    }
}
