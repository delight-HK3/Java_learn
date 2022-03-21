public class ch4_learn1 {
    public static void main(String[] args){
        int change1 = 10;
        int change2 = 20;
        int temp;

        temp = change1; // change1의 값을 temp에 저장
        change1 = change2; // change2의 값을 change1에 저장
        change2 = temp; // temp의 값을 change2에 저장

        System.out.println("change1 = "+change1); // 20
        System.out.println("change2 = "+change2); // 10
    }
}