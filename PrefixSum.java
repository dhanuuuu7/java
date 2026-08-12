import java.util.*;
public class PrefixSum {
    static int[] prefixSum(int[] arr){
        int n = arr.length;
        //without using extra space
//        for(int i =0;i<n;i++){
////            arr[n-i] used to store elements at last
//            for(int j =n-2-i;j>=0;j--){
//                 arr[n-i-1]+=arr[j];
//            }
//        }
        int[] pref = new int[n];
        pref[0]=arr[0];
        for(int i =1;i<n;i++){
            pref[i] =pref[i-1]+arr[i];
        }
        return pref;
    }
    static void printArray(int[] arr){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int[] Arr = new int[n];
        System.out.println("Enter the elements to the array:");
        for(int i =0;i<n ;i++){
            Arr[i] = sc.nextInt();
        }
        int[] p =prefixSum(Arr);
        printArray(p);

    }
}
