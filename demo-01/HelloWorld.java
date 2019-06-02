public class HelloWorld {
    // 无参无返回值
    public void testFn() {
        System.out.println("Hello World");
    }
    // 无参有返回值
    public int area() {
        int length = 10;
        int width = 5;
        int s = length * width;
        return s;
    }
    // 有参无返回值
    public void max(float a, float b){
        float temp =  a > b ? a : b ;
        System.out.println("最大值：" + temp);
    }

    // 有参有返回值
    public int area_r(int length, int width) {
        return length * width;
    }

    // 数组作为参数
    public void printArray(int[] arr){
        System.out.println("数组长度：" + arr.length);
    }

    // 查找数组元素
    public int seachArrayElement(int n, int[] arr){
        return arr[n];
    }

    // 方法重载
    public int plus(int m, int n){
        return m+n;
    }
    public double plus(double m, double n){
        return m+n;
    }
    public int plus(int[] arr){
        int num = 0;
        for(int i = 0; i < arr.length; i++){
            num = num + arr[i];
        }
        return num;
    }

    // 可变参数
    public void sum(int ...n){
        int sum = 0;
        for(int i:n){
            sum = sum + i;
        }
        System.out.println("sum: "+sum);
    }

    public static void main(String []args) {
        // 创建HelloWorld类的hw对象
        HelloWorld hw = new HelloWorld();
        // 使用对象名.方法名() 调用方法
        hw.testFn();

        hw.sum(1);
        hw.sum(1, 2);
        hw.sum(1,2 ,3);

        int plus1 = hw.plus(1, 2);
        double plus2 = hw.plus(1.2, 2.3);
        int[] arr10 = {1, 2, 3};
        int plus3 = hw.plus(arr10);

        System.out.println(plus1 + " " + plus2 + " " + plus3);

        int s = hw.area();
        System.out.println(s);

        float f1 = 2.3f, f2 = 2f;
        hw.max(f1, f2);

        s = hw.area_r(3, 4);
        System.out.println(s);

        int[] array = {1, 2, 3, 4, 5};
        hw.printArray(array);




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
        // int max = intArray[0];
        // for(int i = 0; i < intArray.length; i++){
        //     if(intArray[i] > max){
        //         max = intArray[i];
        //     }
        // }
        // System.out.println(max);

        // for(int n:intArray){
        //     System.out.print(n + " ");
        // }
        // System.out.println();

        for(int n:intArray){
            System.out.print(n+", ");
        }

        System.out.println();

        int temp;
        for(int i = 0; i < intArray.length; i++){
            System.out.print(intArray[i]+", ");
            for(int j = 0; j < intArray.length - i - 1; j++){
                if(intArray[j] > intArray[j+1]){
                    temp = intArray[j+1];
                    intArray[j+1] = intArray[j];
                    intArray[j] = temp;
                }
            }
        }

        System.out.println();
        for(int n:intArray){
            System.out.print(n+"-");
        }
        
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