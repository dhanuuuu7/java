import java.util.*;
public class FindUnique {
    static int FindUnique(int []arr){
        int n = arr. length;
        for(int i =0 ;i<n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    arr[i] = -1;
                    arr[j] = -1;

                }
            }
        }
        int target =  -1;
        for(int k = 0; k <n ; k++){
                if(arr[k]>0){
                    target = arr[k];
                }
        }

        return target;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int size = sc.nextInt();
        System.out.println("Enter the elements to the array :");
        int [] arr = new int[size];
        for (int i = 0 ; i < size ; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Unique Elememnt:"+ FindUnique(arr));
    }
}
