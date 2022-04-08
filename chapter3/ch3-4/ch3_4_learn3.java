public class test {
    public static void main(String[] args) {
        System.out.println("//----------- 0 ~ 2 -----------//");
        for(int i=1; i<=5; i++){
            System.out.printf("%d ", (int)(Math.random() * 3));
            // 정수로 표현하고 싶으면 int로 형변환을 시키면 된다. 
        }
        System.out.printf("%n//----------- 1 ~ 3 -----------//%n");
        for(int z=1; z<=5; z++) {
            System.out.printf("%d ", (int)((Math.random() * 3) + 1));
        }
    }
}

