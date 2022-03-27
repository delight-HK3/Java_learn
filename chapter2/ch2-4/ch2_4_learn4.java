public class test {
    public static void main(String[] args) {
        int num1 = 1000000;
        int num2 = 3000000;

        //int num3 = num1 * num2;
        // int에서 저장할 수 있는 범위는 –2,147,483,648 ~ 2,147,483,647 사이이기 때문에
        // 표현범위를 넘었기 때문에 값이 이상하게 출력
        //System.out.println(num3);

        long lng1 = (long)num1 * num2;
        long lng2 = 1000000L * num2;
        //long 타입으로 저장하고 연산하는 부분의 타입을 long타입으로 하거나 뒤쪽에 L을 붙여 long타입 이라고 알려줘야한다.
        System.out.println(lng1);
        System.out.println(lng2);
    }
}