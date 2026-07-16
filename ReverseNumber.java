import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to reverse:");
        int n = sc.nextInt();
        int rev=0,ans=0;
        while(n>0){
            ans = ans*10 + n%10;
            n/=10;

        }
        System.out.println("Reversed Number :"+ ans);
    }

}
