package Jason;

public class Calculate {
    //  加法运算
    public static int add(int a,int b) {
        return a+b;
    }
    //  减法运算
    public static int subtract(int a,int b) {
        return a-b;
    }
    //  乘法运算
    public static int multiply(int a,int b) {
        return a*b;
    }

    //  除法运算
    public static int divide(int a,int b)
    {
        if(b==0) {
            System.out.println("除数不能为0");
            return 0;
        }
        else
            return a/b;
    }
}
