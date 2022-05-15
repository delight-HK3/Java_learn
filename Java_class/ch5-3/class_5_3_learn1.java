class Array { // 클래스 Array 선언
    int num1;
}
public class class_5_3_learn1 {
    public static void main(String[] args) {
        Array array1 = new Array();
        // array1이름의 참조변수 선언과 동시에 Array인스턴스의 주소를 array1에 저장
        Array array2 = new Array();
        Array array3 = new Array();

        array1.num1 = 10;
        // array1의 멤버변수 num1에 10을 저장
        array2.num1 = 20;
        // array2의 멤버변수 num1에 20을 저장
        array3.num1 = 30;
        // array3의 멤버변수 num1에 30을 저장
        System.out.printf("%d ",array1.num1); // 10
        System.out.printf("%d ",array2.num1); // 20
        System.out.printf("%d%n",array3.num1);  // 30

        Array[] arraytest = new Array[3];
        // 길이가 3인 arraytest객체배열 선언
        arraytest[0] = new Array();
        // arraytest[0]에 Array 인스턴스 주소 저장
        arraytest[1] = new Array();
        arraytest[2] = new Array();

        arraytest[0].num1 = 10;
        arraytest[1].num1 = 20;
        arraytest[2].num1 = 30;
        System.out.printf("%d ",arraytest[0].num1); // 10
        System.out.printf("%d ",arraytest[1].num1); // 20
        System.out.printf("%d%n",arraytest[2].num1);  // 30
        
        Array[] arraysecond = { new Array(), new Array(), new Array()};
        // 객체배열을 생성하는 두 번째 방법
        arraysecond[0] = new Array();
        arraysecond[1] = new Array();
        arraysecond[2] = new Array();

        arraysecond[0].num1 = 10;
        arraysecond[1].num1 = 20;
        arraysecond[2].num1 = 30;
        System.out.printf("%d ",arraysecond[0].num1); // 10
        System.out.printf("%d ",arraysecond[1].num1); // 20
        System.out.printf("%d%n",arraysecond[2].num1);  // 30
    }
}