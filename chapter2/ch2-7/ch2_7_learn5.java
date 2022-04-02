public class ch2_7_learn5 {
    public static void main(String[] args) {
        boolean bool = !(1 < 10 && 10 < 11);
        // 논리 부정 연산자만 없으면 true가 리턴되지만 앞에 !
        // 논리 부정 연산자를 붙이면 결과가 부정되어 false를 리턴
        System.out.println(bool);
        System.out.println(!bool);
        // 부정을 다시한번 부정했기 때문에 true가 출력
    }
}