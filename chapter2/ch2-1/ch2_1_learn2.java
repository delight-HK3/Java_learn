public class ch2_1_learn1{
    public static void main(String[] args) {
        int x = 10;
        int y = 9;

        if(x > y){
            System.out.println("x는 y보다 큽니다.");
        }
        if(x < y){
            System.out.println("y는 x보다 큽니다.");
        }
        if (x >= y){
            System.out.println("x는 y보다 크거나 같습니다.");
        }
        if (x <= y){
            System.out.println("y는 x보다 크거나 같습니다.");
        }
        if (x == y){
            System.out.println("x와 y의 크기는 같습니다.");
        }
        if (x != y) {
            System.out.println("x와 y는 같지 않습니다.");
        }
    }
}