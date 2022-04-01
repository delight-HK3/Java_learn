public class ch2_6_learn3 {
    public static void main(String[] args) {
        String str1 = "test";
        String str2 = "test";
        String str3 = new String("testtest");
        String str4 = new String("testtest");

        System.out.println(str1 == str2); // true
        System.out.println(str1.equals(str2)); // true

        System.out.println(str3 == str4); // false
        System.out.println(str3.equals(str4)); // true
    }
}
