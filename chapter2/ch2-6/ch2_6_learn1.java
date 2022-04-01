public class test {
    public static void main(String[] args) {
        int su1 = 10;
        int su2 = 11;
        int num1 = 10;
        int num2 = 10;
        System.out.println(su1 < su2); // true
        // su1이 su2보다 작기에 true를 반환
        System.out.println(su1 > su2); // false
        // su2가 su1보다 크기에 false를 반환

        System.out.println(num1 >= num2); // true
        // num1이 num2보다 크거나 같다 라는 조건에서 두 개의 값이 같기 때문에 true를 반환 
        System.out.println(num1 <= num2); // true
        // num1이 num2보다 작거나 같다 라는 조건에서 두 개의 값이 같기 때문에 true를 반환 
        System.out.println(su1 != su2); // true 
        // su1과 su2의 값이 다르기 때문에 true를 반환
        System.out.println(su1 == su2); // false
        // su1과 su2의 값이 다르기 때문에 flase를 반환
    }
}