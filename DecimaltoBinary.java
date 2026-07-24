import java.util.Scanner;
public class DecimaltoBinary {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);

        int Decimal = sc.nextInt();
        int ans = 0;

        int pw= 1;

        while(Decimal > 0){
            int parity = Decimal %2;
            ans+= parity *pw;
            pw *=10;
            Decimal /=2;
        }
        System.out.println(ans);
    }
}
