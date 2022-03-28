public class ch2_5_learn1 {
    public static void main(String[] args) {
        double dou1 = 3143.443545;
        double dou2 = 3143.945356;

        double sum1 = Math.round(dou1);
        // 3143.443545를 반올림하여 3143.0을 sum1에 저장
        double sum2 = Math.round(dou2);
        // 3143.945356를 반올림하여 3144.0을 sum2에 저장
        System.out.println((int)sum1); 
        // int로 형변환하여 3143로 출력
        System.out.println((int)sum2); 
        // int로 형변환하여 3144로 출력
    }
}
