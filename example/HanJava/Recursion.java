package HanJava;

public class Recursion {
    public static void main(String[] args) {
        System.out.println(new Fibonacci().fibonacci(7));
        "asd".equals("das");
        String a = "hello";
        String b = "abc";
        String d = (a + b).intern();
        String c = "helloabc";
        StringBuffer bf = new StringBuffer("454455");
    }
}
class Fibonacci{
    public int fibonacci(int n){
        if(n == 1 || n == 2)return 1;
        else return fibonacci(n - 1) + fibonacci(n - 2);
    }
}