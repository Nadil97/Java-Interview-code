public class Swap{
    public static void main(String []args){
        int a=20;
        int b=30;
        System.out.println("Befor swaping a is ="+a);
        System.out.println("Befor swaping b is ="+b);
        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("After swaping a is ="+a);
        System.out.println("After swaping b is ="+b);
    }
}