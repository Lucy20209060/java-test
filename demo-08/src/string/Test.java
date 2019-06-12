package string;

public class Test {
    public static void main(String[] args){
        String s1 = "鞍辔卸，长剑腥腥挂壁。";
        System.out.println("字符串的长度："+s1.length());

        System.out.println("'长'字符所在的位置下标："+s1.indexOf('长'));

        System.out.println("'腥腥'字符串所在的位置下标："+s1.indexOf("腥腥"));

        System.out.println("截取特定位置的字符串："+s1.substring(2,5));

        String str1 = "哈哈哈";
        String str2 = "哈哈哈";
        String str3 = new String("哈哈哈");
        String str4 = new String("哈哈哈");

        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));

        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str3 == str4);
    }
}
