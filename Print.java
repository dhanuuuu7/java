import java.util.*;

public class Print{
    public static void main(String[] args){
        String name = "Dhanu";
        char firstLetter = 's';
        int age = 19;
        double height = 5.82;
        boolean isEmployee= true;

        System.out.printf("Hello %s\n",name);
        System.out.printf("Your friend name starts with a letter %c\n",firstLetter);
        System.out.printf("you are %d years old\n",age);
        System.out.printf("You are %.3f feet tall \n", height);
        System.out.printf("I am not an employee : %b\n",isEmployee);

    }
}