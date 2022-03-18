public class ch3_learn2 {
    public static void main(String[] args){
       	int i = 30_000_0000; // int 타입이 저장 가능한 범위를 벗어났기 때문에 에러가 납니다.
        long L = 3.14f; // 기본적으로 실수형은 정수형보다 범위가 넓기 때문에 에러가 납니다.
        float f = 3.14; // double형으로 취급이됩니다, 그렇기에 double형이 float보다 범위가 넓기 때문에 에러가 납니다. 
    }
}
