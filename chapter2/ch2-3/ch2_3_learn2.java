public class ch2_3_learn2 {
    public static void main(String[] args) {
        float flo2 = 1000; // int의 저장범위보다 float의 저장범위가 넓기 때문에 저장가능
        float flo3 = (float)1000; // 양쪽의 자료형은 일치하는 것이 좋다.
        System.out.println(flo2); // 1000.0
        System.out.println(flo3); // 1000.0

        // int num1 = 3.14f; float의 저장범위가 int보다 넓기 때문에 저장이 불가능
        int num2 = (int)3.14f; // 형변환을 해주었기 때문에 저장이 가능

        byte b = 10;
        int num3 = b; // 10byte를 int i에 저장
        System.out.println(num3);

        int num4 = 30;
        byte b2 = (byte)num4; // int에서 byte로 바꾸려면 값손실이 있을수 있기 때문에 형변환이 필요
    }
}
