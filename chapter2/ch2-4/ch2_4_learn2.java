public class ch2_4_learn2 {
    public static void main(String[] args) {
        long lng1 = 100L; 
        int num1 = 10;
        float flo1 = 3.14f;

        System.out.println(lng1 + num1);
        // long(8 byte) + int(4 byte) -> long(8 byte) + long(8 byte) = long(8 byte)
        // int 보다 넓은 표현범위를 가지고 있는 long타입으로 자동 형 변환하여 연산
        System.out.println(flo1 + num1);
        // float(4 byte) + int(4 byte) -> float(4 byte) + float(4 byte) = float(4 byte)
        // int 보다 넓은 표현범위를 가지고 있는 float타입으로 자동 형 변환하여 연산
        System.out.println(lng1 / flo1);
        // double(8 byte) / float(4 byte) -> double(8 byte) / double(8 byte) = double(8 byte)
        // float 보다 넓은 표현범위를 가지고 있는 double타입으로 자동 형 변환하여 연산
    }
}
