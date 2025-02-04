import java.util.Arrays;
import java.util.Scanner;

public class AddEle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        int sum=0;
        System.out.println("enter elements in array  ");
        for(int i=0; i<5; i++){
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        for(int i=0; i<5; i++){
            sum+=arr[i];
        }
        System.out.println(sum);
    }

}
