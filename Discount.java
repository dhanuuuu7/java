import java.util.Scanner;
public class Discount {
    public static void main(String []args ){
        Scanner sc = new Scanner(System.in);

        System.out.println("you are a senior or not ? :");
        boolean isSenior = sc.nextBoolean() ;
        System.out.println("you are a student or not ? :");
        boolean isStudent = sc.nextBoolean();
        double price = 69.69;

        if(isStudent){
                if(isSenior){
                    System.out.println("you get a senior discount of 20%.");
                    System.out.println("you get a student discount of 10%.");
                    price *= 0.7;

                }
                else{
                    System.out.println("you get a student discount of 10%.");
                    price *= 0.9;
                }
        
        }
        else{
            if(isSenior){
            System.out.println("you get a senior discount of 20%.");
            price *= 0.8;
            }
    
        }
        System.out.printf("the price after discount is ₹%.2f",price);

    }
}
