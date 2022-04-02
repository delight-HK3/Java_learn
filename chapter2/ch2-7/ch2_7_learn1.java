public class ch2_7_learn1 {
    public static void main(String[] args) {
        int su1 = 15;
        int su2 = 10;

        boolean bool1 = su1 > 10 && su1 < 20;
        // 기본 적으로 and는 보통 저렇게 식을 쓴다.
        boolean bool2 = 10 < su1 && su1 < 20;
        // 이렇게 가독성을 위해 변수를 오른쪽에 쓰는 경우도 있다.
        System.out.println(bool1);
        System.out.println(bool2);
    }
}