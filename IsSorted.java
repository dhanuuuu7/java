import java.util.*;
public class IsSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element for occurence");
        int a = sc.nextInt();
        int[] arr = new int[a];
        System.out.println("Enter the elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Sorted array  :" + SortedOrNot(arr));

    }
    static boolean SortedOrNot(int arr[]){
        boolean check = true;
        for(int i = 1 ; i<arr.length;i++){
            if(arr[i]< arr[i-1]){
                //not sorted
                check = false;

            }
        }
        return check;
    }
}
