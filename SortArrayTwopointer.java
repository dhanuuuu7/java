import java.util.*;
public class SortArrayTwopointer {
    static void SortSwap(int[] arr1, int i , int j){
       while(i<j) {
           if (arr1[i] == 0) {
               i++;
           } else if (arr1[j] == 1) {
               j--;
           } else if (arr1[i] == 1 && arr1[j] == 0) {
               int temp = arr1[i];
               arr1[i] = arr1[j];
               arr1[j] = temp;
               ++i;
               --j;
           }

       }

    }
    static void printArray(int[] arr){

        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of an Array:");
        int n = sc.nextInt();
        int[] Arr = new int[n];
        System.out.println("Enter "+n+" elements ");
        for(int i = 0;i<n;i++){
            Arr[i]=sc.nextInt();
        }
        int left =0;
//        System.out.print(Arrays.toString(SortSwap(Arr,left,n)));
        SortSwap(Arr,left,n-1);
        printArray(Arr);
    }

}
