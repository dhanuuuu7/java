import java.util.Scanner;

public class CI{
    public static void main(String []args){

        Scanner sc = new Scanner(System.in);

        double principal;
        double rate ;
        int timescompunded;
        int years ;
        double amount;

        System.out.print("Enter the principal in rupees :");
        principal =  sc.nextDouble();

        System.out.print("Enter the intrest rate (in %) :");
        rate = sc.nextDouble()/100;
        
        System.out.print("Enter the # of times compunded per year  :");
        timescompunded = sc.nextInt();

        System.out.print("Enter the # of years :");
        years = sc.nextInt();

        amount = principal * Math.pow(1+ rate/ timescompunded,timescompunded*years);
        System.out.println("The amount after "+years+" is: ₹"+ amount);
        sc.close();
        

    }
}