public class Test {
    public int add(int a , int b){
        return a+b;
    }
    public int add(String a, String b){
        return (a+b).length();
    }

    public String add (int a ,int b , int c){
        return "hi";
    }
    public double add (int a, int b,double c){
        return a+b+c;
    }

    public static void main(String[] args) {

    }
}
 class B extends Test{
    public String add(int a , int b, int c){
        return "Hello";
    }
}

