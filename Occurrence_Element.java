import java.util.*;
public class Occurrence_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i = 0 ; i< arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println();
        System.out.print("Enter a number you want occurence of it :");
        int x = sc.nextInt();
        int count = 0;
        for(int i = 0 ; i< arr.length;i++){
            if(arr[i]==x){
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
