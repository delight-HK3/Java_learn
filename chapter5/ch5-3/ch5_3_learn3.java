class DoubleArray{ // DoubleArray 클래스선언
    int num1; // 멤버변수 num1
    int num2; // 멤버변수 num2

    public DoubleArray(int num1, int num2){
        // 생성자를 선언하여 배열에 값을 저장
        this.num1 = num1; // 매개변수 num1을 멤버변수 num1에 저장
        this.num2 = num2; // 매개변수 num2을 멤버변수 num2에 저장
    }
    public int getDoubleArray_one(){
        // 멤버변수 num1을 리턴하는 멤버 메소드
        return this.num1; // 멤버변수 num1을 리턴
    }
    public int getDoubleArray_two(){
        // 멤버변수 num2을 리턴하는 멤버 메소드
        return this.num2; // 멤버변수 num2를 리턴
    }
    public void showcases(int cnt1, int cnt2){
        // 배열의 내용을 출력하는 멤버 메소드
        System.out.printf("=====[%d][%d]=====%n",cnt1,cnt2);
        System.out.printf("num1 = %d%n",getDoubleArray_one()); // num1의 내용을 출력
        System.out.printf("num2 = %d%n",getDoubleArray_two()); // num2의 내용을 출력
        System.out.printf("================%n");
    }
}
public class test {
    public static void main(String[] args) {
        DoubleArray[][] doubleArray = new DoubleArray[3][];
        // 2차원 객체배열을 3만큼 생성

        for(int i = 0; i < doubleArray.length; i++){ // 1차원 배열의 길이만큼 반복
            doubleArray[i] = new DoubleArray[(int)(Math.random() * 5) + 1];
            // 2차원 배열을 초기화하는데 난수로 2차 배열 공간을 정해준다.
        }

        for(int i = 0; i < doubleArray.length; i++){ // 1차원 배열의 길이만큼 반복
            for(int j = 0; j <doubleArray[i].length; j++){ // 2차원 배열의 길이만큼 반복
                doubleArray[i][j] = new DoubleArray((int)(Math.random() * 5) + 1,(int)(Math.random() * 5) + 1);
                // 생성자를 통해 난수로 배열에 내용을 넣어준다.
            }
        }

        for(int i = 0; i < doubleArray.length; i++){ // 1차원 배열의 길이만큼 반복
            for(int j = 0; j <doubleArray[i].length; j++){ // 2차원 배열의 길이만큼 반복
                doubleArray[i][j].showcases(i,j);
                // 배열에 저장되어있는 내용을 출력
                System.out.println(); // 다음줄 이동
            }
        }
    }
}