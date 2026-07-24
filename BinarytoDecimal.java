import java.util.Scanner;
public class BinarytoDecimal {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);

        int Binary = sc.nextInt();
        int ans = 0;

        int pw= 1;

        while(Binary > 0){
            int ud = Binary %10;
            ans+= ud*pw;
            Binary /=10;
            pw *=2;

        }
        System.out.println(ans);
    }
}
