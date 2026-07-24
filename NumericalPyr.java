import java.util.Scanner;
public class NumericalPyr{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for(int i=1 ;i<=n;i++){
            for(int j = 1; j<=n-i;j++){
                System.out.print(" ");
            }
            if(i==1){
                System.out.println(i);
            } else if (i==n) {
                for(int k=1;k<=2*n -1;k++){
                    System.out.print(n);
                }
                System.out.println();

            }
            else{
                System.out.print(i);//Left number in the Pyramid

                for(int l = 1;l<= 2*i - 3;l++){
                    System.out.print(" ");
                }

                System.out.println(i);// Right number
            }
        }
    }
}
