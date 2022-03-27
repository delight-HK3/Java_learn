public class test {
    public static void main(String[] args) {
        byte by1 = 10;
        short sh1 = 10;
        char ch1 = 'A'; // 유니코드로 65

        System.out.println(by1 + sh1);
        // byte(1 byte) + short(2 byte) -> int(4 byte) + int(4 byte) = int(4 byte)
        // byte와 byte, short와 short를 더해도 결과는 int타입이 나옴
        System.out.println(ch1 + sh1);
        // char(2 byte) + short(2 byte) -> int(4 byte) + int(4 byte) = int(4 byte)
        // 문자를 숫자로 바꾸고 char, short타입을 int타입으로 변환하여 계산
    }
}