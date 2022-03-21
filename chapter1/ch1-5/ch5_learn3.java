public class ch_temp_learn3 {
    public static void main(String[] args) {
        // 실수 출력을 시키기 위해서는
        // 일반적으로 : %f
        // 지수형식 : %e
        // 간략한형식 : %g
        float f = 255.123423453f;
        double d = 254.315234534;
        System.out.printf("%f%n",f);
        // 소수점아래 6자리까지 출력
        // float의 정밀도가 7자리 이기때문에 소수점아래 4자리 까지가 정확
        System.out.printf("%e%n",f); //지수형식으로 출력

        System.out.printf("%f%n",d);
        // 소수점아래 6자리까지 출력
        // double의 정밀도는 15자리 이기 때문에 정밀도 문제는 없는데도 결과가 8이나온 이유는
        // 소수점아래 7자리의 5가 반올림 되어서 8이 나옵니다.
        System.out.printf("%e%n",d); //지수형식으로 출력

        System.out.printf("%g%n", 123.2345234); // 간략하게 소수점아래 3자리 까지 반올림 되어 출력합니다.
        System.out.printf("%g%n", 0.000000001);
    }
}
