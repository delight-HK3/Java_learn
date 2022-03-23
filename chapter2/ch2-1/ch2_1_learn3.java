public class ch2_1_learn1{
    public static void main(String[] args) {
        int x = 10;
        int y = 9;
        boolean check = true;

        if(x >= y && y == x) {
            System.out.println("x와 y는 같고 동시에 x는 y보다 크거나 같습니다.");
        }
        if(x >= y || y == x) {
            System.out.println("x와 y는 같거나 x는 y보다 크거나 같습니다.");
        }
        System.out.println(!check);
        //논리값을 반전하기 때문에 true에서 false로 출력이 됩니다.
    }
}