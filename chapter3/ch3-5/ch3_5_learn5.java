public class test {
    public static void main(String[] args) {
        String[] str_array = {"test1","test2","test3","test4"};
        // 문자열 타입으로 배열을 선언 및 초기화
        for(String index : str_array){ 
            // 초기값을 선언하고 str_array배열의 
            // 내용을 초기값에 넣고 배열의 인자만큼 반복
            System.out.println(index);
            // 배열의 내용을 출력
        }
    }
}