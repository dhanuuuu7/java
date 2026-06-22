import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int number = 3;

        String EvenOdd = (number % 2 == 0)? "EVEN":"ODD";

        System.out.print(EvenOdd);

        int hours = 13;

        String timeofDay = (hours < 12) ? "A.M":"P.M";

        System.out.println(timeofDay);
        int income = 70000;
        double taxRate = (income >= 40000) ? 0.5: 0.25;

        System.out.print(taxRate);
    }

}
