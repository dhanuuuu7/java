import java.util.Scanner;
public class Secondmax {
    static int Findmax(int []arr) {
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        for(int i= 0 ; i<n; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }

    static int findSecondMax(int [] arr) {
        int max = Findmax(arr);
        for(int i = 0 ; i < arr.length; i++){
            if(arr[i]==max){
                arr[i]=Integer.MIN_VALUE;
            }
        }
        return Findmax(arr);
    }
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array :");
        int n = sc.nextInt();
        System.out.println("Enter the elememts to tha Array:");
        int[] Arr = new int[n];
        for(int i = 0 ; i<Arr.length;i++){
            Arr[i] = sc.nextInt();
        }
        System.out.println("Second maximum element is : "+ findSecondMax(Arr));
    }
}
