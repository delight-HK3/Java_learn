public class test {
    public static void main(String[] args) {
        System.out.println("//----------- 0.0 ~ 2.0 -----------//");
        for(int i=1; i<=5; i++){
            System.out.printf("%f%n",Math.random()*3);
            // 1.0 이상 표현하고 싶으면 Math.random()에 * (임의값)
            // 위의 코드는 0.0 ~ 2.0을 표현하기 위해 저렇게 작성
        }

        System.out.println("//----------- 1.0 ~ 3.0 -----------//");
        for(int z=1; z<=5; z++) {
            System.out.printf("%f%n", (Math.random() * 3) + 1);
            // 0.0 ~ 2.0사이를 표현 하고 싶으면 3을 곱하면 되지만
            // 3까지 표현하고 싶으면 1을 더하면 된다.
        }
    }
}