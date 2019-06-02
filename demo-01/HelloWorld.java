public class HelloWorld {
    public static void main(String []args) {
        // System.out.println("Hello World"); // 打印 Hello World
        char a = 'A';
        System.out.println(a);
        char b = 65;
        System.out.println(b);
        char c = 65535;
        System.out.println(c);
        char d = (char)65536;
        System.out.println(d);

        if(true & true){
            System.out.println("&测试");
        };

        if(false | true){
            System.out.println("|测试");
        };

        char e = '8';
        System.out.println(e+1);

        int[] arr = {1, 2, 3, 4};
        System.out.println(arr[1]);

        int[] arr2 = new int[10];
        System.out.println(arr2[1]);

        int[] intArray = {32, 56, 21, 97, 64, 23, 73};
        int max = intArray[0];
        for(int i = 0; i < intArray.length; i++){
            if(intArray[i] > max){
                max = intArray[i];
            }
        }
        System.out.println(max);


    }
}

/**
 * 大小写敏感
 * 类名首字母大写
 * 方法名小写字母开头
 * 所有的 Java 程序由 public static void main(String []args) 方法开始执行
 * 
 * 标志符
 * 类名、变量名以及方法名都被称为标识符
 * 所有的标识符都应该以字母（A-Z 或者 a-z）,美元符（$）、或者下划线（_）开始
 */