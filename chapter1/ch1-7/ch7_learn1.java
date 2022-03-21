public class ch7_learn1 {
    public static void main(String[] args){
        short Min_s = -32768, Max_s = 32767;
        //short 타입의 범위는 -32768 ~ 32767까지 입니다.
        char Min_c = 0, Max_c = 65535;
        //char 타입의 범위는 0 ~ 65535까지 입니다.

        System.out.println("Min_s = " + Min_s);
        // short 타입의 최소값인 -32768이 나옵니다.
        System.out.println("Min_s - 1 = " + (short)(Min_s-1));
        // 최소값 -32768 에서 1을 뺐기 때문에 최대값인 32767이 나옵니다.
        System.out.println("Max_s = " + Max_s);
        // short 타입의 최대값인 32767이 나옵니다.
        System.out.println("Max_s + 1 = " + (short)(Max_s+1));
        // 최대값 32767 에서 1을 더했기 때문에 최소값인 -32768이 나옵니다.

        System.out.println("Min_c = " + (int)Min_c);
        // char 타입의 최소값인 0이 나옵니다.
        System.out.println("Min_c - 1 = " + (int)--Min_c);
        // 최소값 0 에서 1을 뺐기 때문에 최대값인 65535가 나옵니다.
        System.out.println("Max_c = " + (int)Max_c);
        // char 타입의 최대값인 65535이 나옵니다.
        System.out.println("Max_c + 1 = " + (int)++Max_c);
        // 최대값 65535 에서 1을 더했기 때문에 최소값인 0이 나옵니다.
    }
}
