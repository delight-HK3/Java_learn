class num{
    int num1; // 멤버변수
    String str1; // 멤버변수
    boolean trfa; // 멤버변수
    void display(){ // 멤버메서드
        System.out.printf("display 함수호출%n");
    }
}
public class test {
    public static void main(String[] args) {
        num n = new num();
        // num클래스 타입의 참조변수 n선언 후 num인스턴스를 생성하고
        // 생성된 num인스턴스의 주소를 n에 저장
        System.out.printf("%d%n",n.num1);
        // n인스턴스의 num1 멤버변수를 출력
        System.out.printf("%s%n",n.str1);
        // n인스턴스의 str1 멤버변수를 출력
        System.out.printf("%s%n",n.trfa);
        // n인스턴스의 trfa 멤버변수를 출력
        n.display();
        // n인스턴스의 display 멤버 메서드를 호출
    }
}