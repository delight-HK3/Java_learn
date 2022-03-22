public class ch1_8_learn1 {
	public static void main(String[] args) {
		String str1 = "5"; // 문자열 5
        	String str2 = "3,14"; // 문자열 3.14
        	String str3 = "Hello"; // 문자열 Hello
        	char ch1; // 문자열을 읽어서 일부분만 저장할 변수

        	System.out.println(str1.charAt(0) - '0'); // 숫자 5
        	// 문자 5 - 문자 0 = 숫자 5

        	System.out.println('5' - '0' + 1); // 숫자 6
        	// (문자 5 - 문자 0) + 숫자 1 = 숫자 6

        	System.out.println(Integer.parseInt("5") + 1); // 숫자 6
        	// 문자열을 숫자로 변경한 5 + 숫자 1 = 숫자 6

        	System.out.printf("%.2f%n",Float.parseFloat("3.14")); // 실수 3.14
        	// 문자열을 실수로 변경한 3.15

        	System.out.println("5" + 1);
        	// 문자열 5 + 문자열로 변경된 1 = 문자열 51

        	System.out.println(5 + '0');
        	// 숫자 5 + 문자 0을 숫자로 변경한 값 = 53

        	System.out.println((char)(5 + '0')); // 문자 5
        	// 아스키코드표를 보면 숫자 53은 문자로 5이기 때문에 문자 5가 나옵니다.

        	ch1 = str3.charAt(2); 
       	 	// 0,1,2 순으로 Hello의 3번 째 index인 l이 ch1에 저장이 됩니다.
        	System.out.println(ch1);// 문자 l
    	}
}
