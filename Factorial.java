import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("which factorial you want :");
        int n = sc.nextInt();

        int fact =1;
        for(int i = n;i>0;i--){
            fact *= n;
            n--;
        }
        System.out.println(fact);
    }
}
