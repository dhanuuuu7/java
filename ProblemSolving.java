import java.util.*;
public class ProblemSolving {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();
        int [] arr = new int[6];
        System.out.println("Enter the elements to the array : ");
        for(int i = 0 ; i <arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int count=0;
        for(int i = 0 ; i < arr.length; i++){
            for(int j = i+1 ; j< arr.length;j++){

                if(arr[i]+arr[j] == num){
                    count++;
                }
            }
        }
        System.out.println("Pairs :" + count);
    }

}
