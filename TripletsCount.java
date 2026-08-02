import java.util.*;
public class TripletsCount {

    static int CountTriplets(int arr[], int target) {
        int count=0;
        for(int i = 0 ; i < arr.length; i++){
            for(int j = i+1 ; j< arr.length;j++){
                for(int k = j+1; k< arr.length;k++) {
                    if (arr[i] + arr[j] + arr[k] == target) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int size = sc.nextInt();
        System.out.println("Enter the sum of the numbers  :");
        int sum = sc.nextInt();
        int [] arr = new int[size];
        System.out.println("Enter the elements to the array : ");
        for(int i = 0 ; i <arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Pairs of 3 Sum : "+ CountTriplets(arr,sum));
    }

}
