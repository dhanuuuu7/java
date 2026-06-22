
import java.util.Scanner;

public class TempTernary{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double temp;
        double newTemp;
        String unit;

        System.out.print("Enter the temperature :");

        temp = sc.nextDouble();

        System.out.print("Convert to C to F :");
        unit = sc.next().toUpperCase();

        //(condition) ? true : flase ;
        newTemp = (unit.equals("C"))? (temp -32)*5/9 : (temp *5/9) + 32;
        System.out.println(newTemp + "°"+ unit);

        System.out.println(temp);
        System.out.println(unit);


        sc.close();

    }

}
