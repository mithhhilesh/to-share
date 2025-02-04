import java.util.Arrays;
import java.util.Scanner;

public class AddArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr1= new int[5];
        int[] arr2= new int[5];
        System.out.println("enter elements in array 1 ");
        for(int i=0; i<5; i++){
            arr1[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println("enter elements in array 2 ");
        for(int i=0; i<5; i++){
            arr2[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr2));
        for(int i=0; i<5; i++){
            arr1[i]+=arr2[i];
        }

        System.out.println("Addition of two arrays: "+Arrays.toString(arr1));



    }
}
