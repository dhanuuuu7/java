import java.util.Scanner;
public class RepeatingNumber {
    static int firstRepeatingNumber(int[] arr) {
        int n = arr.length;
        int ans = -1;
        for (int i = 0 ; i<n ;i++){
            for(int j = i +1;j<n;j++){
                if(arr[i]==arr[j]){
                    ans = arr[i];

                }
            }
        }
        return ans;
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array :");
        int  size = sc.nextInt();
        int[] Arr = new int[size];
        System.out.println("Enter the elements :");
        for(int i = 0 ; i < size ; i++){
            Arr[i] = sc.nextInt();
        }
        System.out.println("Repeated Element :"+firstRepeatingNumber(Arr));
    }

}
