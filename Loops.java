import java.util.*;
// count the number of digits for given number n .
public class Loops {
    public static void main (String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        int num = sc.nextInt();
        int count=0;
        while(num>0){
            num = num/10;
            count++;
        }
        System.out.print(count);

    }
}
