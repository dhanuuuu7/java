import java.util.*;
public class SortArray {
    static int[] SortZeroesandOnes(int[] arr){
        int n = arr.length;
        int zeroes =0;
        for(int i = 0 ; i< n ;i++){
            if(arr[i]==0){
                zeroes++;
            }
        }
        for(int i= 0;i<n;i++){
            if(i<zeroes){
                arr[i]=0;
            }
            else{
                arr[i]=1;
            }
        }
        return arr;
    }
    static void printArray(int[] arr){
        System.out.print("[");
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("]");
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an Array:");
        int n = sc.nextInt();
        int[] Arr = new int[n];
        System.out.println("Enter "+n+" elements ");
        for(int i = 0;i<n;i++){
            Arr[i]=sc.nextInt();
        }
        System.out.print(Arrays.toString(SortZeroesandOnes(Arr)));
        System.out.println();
        printArray(Arr);
    }
}
