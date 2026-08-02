import java.util.*;
public class GreaterThanX {
    static int greaterThanX(int[] arr, int x) {
        int count =0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > x) {
                count ++;
            }
        }
        return count;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element for occurence");
        int a = sc.nextInt();
        int[] arr = new int[5];
        System.out.println("Enter the elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Last occurence of the array :");
        System.out.println("Last occurence of the element :" + greaterThanX(arr, a));

    }
}
