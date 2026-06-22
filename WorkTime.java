import java.util.*;
import java.util.Scanner;

public class WorkTime{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day followed by Capital letter ");
        String day =  sc.nextLine();

//        if(day.equals("Monday")){
//            System.out.println("It is a weekday");
//        }
//        else if(day.equals("Tuesday")){
//            System.out.println("It is a weekday");
//        }
//        else if(day.equals("Wednwsday")){
//            System.out.println("It is a weekday");
//        }
//        else if(day.equals("Thursday")){
//            System.out.println("It is a weekday");
//        }
//        else if(day.equals("Friday")){
//            System.out.println("It is a weekday");
//        }
//        else if(day.equals("Saturday")){
//            System.out.println("It is a weekday");
//        }
//        else if(day.equals("Sunday")){
//            System.out.println("It is a weekend");
//        }
//        else{
//            System.out.println(day + " is not a day ");
//        }

        switch(day){
            case "Monday "-> System.out.println("It is a weekday 😣");
            case "Tuesday "-> System.out.println("It is a weekday 😣");
            case "Wednesday "-> System.out.println("It is a weekday 😣");
            case "Thursday "-> System.out.println("It is a weekday 😣");
            case "Friday"-> System.out.println("It is a weekday 😣");
            case "Saturday "-> System.out.println("It is a weekday 😣");
            case "Sunday"-> System.out.println("It is a weekend 🥰");
            default -> System.out.println(day + " is not a day ");
        }
    }

}
