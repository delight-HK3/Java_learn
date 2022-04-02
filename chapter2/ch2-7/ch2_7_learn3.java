public class ch2_7_learn3 {
    public static void main(String[] args) {
        int su1 = 10;

        boolean bool1 = (su1 % 2 == 0 || su1 % 3 == 0) && su1 % 3 == 0;
        // 연산순서
        // 1. 괄호에 있는 연산을 먼저한다.
        //    10 % 2 == 0 || 10 % 3 == 0
        //    0 == 0 || 1 == 0
        //    true || false
        //    OR 연산이기 때문에 true
        // 2. (true) && 10 % 3 == 0
        //    true && 1 == 0
        //    true && false
        //    AND연산이기 때문에 false가 최종적으로 bool1에 저장된다.
        boolean bool2 = su1 % 2 == 0 && su1 % 3 == 0 && su1 % 10 == 0;
        // 괄호가 없고 연산자가 같으면 왼쪽에서 오른쪽으로 연산
        // 1. 10 % 2 == 0 && 10 % 3 == 0
        //    0 == 0 && 1 == 0
        //    true && false
        //    AND연산이기 때문에 false
        // 2. false && 10 % 10 == 0
        //    false && 0 == 0
        //    false && true
        //    AND연산이기 때문에 false가 최종적으로 bool2에 저장된다.
        System.out.println(bool1);// false
        System.out.println(bool2);// false
    }
}