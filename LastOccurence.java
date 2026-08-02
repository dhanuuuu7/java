import java.util.*;
public class LastOccurence {
    static int lastOccurenece(int[] arr, int x) {
        int lastIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                lastIndex = i;
            }
        }
        return lastIndex;

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
        System.out.println("Last occurence of the element :" + lastOccurenece(arr, a));

    }
}
