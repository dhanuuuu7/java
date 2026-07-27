import java.util.Scanner;
public class StudentObject {
    int rollno;
    String studentName;

    public static void main(String[] args){
        StudentObject obj1 = new StudentObject();
        obj1.rollno = 299;
        obj1.studentName = "Dhanu";
        System.out.println(obj1.rollno);
        System.out.println(obj1.studentName);

        StudentObject obj2 = new StudentObject();
        obj2.rollno = 128;
        obj2.studentName = "Tarun";
        System.out.println(obj2.rollno);
        System.out.println(obj2.studentName);
    }
}
