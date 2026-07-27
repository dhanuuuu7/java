import java.util.Scanner;

class Algebra{
    int add(int a , int b ){
        int sum = a+b;
        return sum;
    }
}
public class MethodsAdd {
    public static void main(String[] args ){
        Algebra obj = new Algebra();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the numebrs a and b : ");
        int x =sc.nextInt();
        int y = sc.nextInt();
        System.out.println("Sum of the inputs is :");
        System.out.println(obj.add(x, y));
    }
}
