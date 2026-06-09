import java.util.Scanner;

public class WeightCn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double weight;
        double netweight;
        int choice;
        
        System.out.println("Weight Conversion Program:");

        System.out.println("1.Convert kg to lb");
        System.out.println("2.Convert lb to kg");
        System.out.println("choose an option :");
        choice = sc.nextInt();

        if(choice == 1){
            System.out.println("Enter the weight in kg:");
            weight = sc.nextDouble();
            netweight= weight * 2.20462;
            System.out.println("The new weight after the conversion: " + netweight);
        }
        else if(choice == 2){
            System.out.println("Enter the weight in lbs:");
            weight = sc.nextDouble();
            netweight = weight* 2.20462;
            System.out.println("the new weight after conversion is "+ netweight);
           }

    }
}
