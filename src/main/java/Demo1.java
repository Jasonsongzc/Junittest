public class Demo1 {

    public static void main(String[] args) {

        Test t = new Test();

        t.say();

    }

}

class Test {

    static int num = 1;

    void say(){

        int num = 2;

        System.out.println(num);

    }

}