class Recipe{
    int flour; // 속성(변수)
    int spice; // 속성(변수)
    String knife; // 속성(변수)
    void flour_insert(){ // 기능(메서드)
        flour++;
    }
    void spice_insert(){ // 기능(메서드)
        spice++;
    }
    void make(){ // 기능(메서드)
        System.out.println(knife);
    }
}
public class class_5_1_learn1 {
    public static void main(String[] args) {
        Recipe menu = new Recipe();
        // menu이름의 참조변수 선언과 동시에 객체를 참조변수에 저장
        menu.spice = 10; // Recipe 클래스의 spice변수에 10을 저장
        menu.flour = 5; // Recipe 클래스의 flour변수에 5를 저장
        menu.knife = "칼질"; // Recipe 클래스의 knife변수에 "칼질"문자열을 저장
        menu.flour_insert();
        // Recipe 클래스의 flour변수에 1을 추가하는 메서드를 호출
        menu.spice_insert();
        // Recipe 클래스의 spice변수에 1을 추가하는 메서드를 호출

        System.out.println(menu.spice);
        System.out.println(menu.flour);
        menu.make();
        // Recipe 클래스의 make메서드를 통해 knife에 저장되어있는 "칼질" 문자열을 호출
    }
}