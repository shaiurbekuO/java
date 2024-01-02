import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) 
            arr[i] = sc.nextInt();

        if (n % 2 == 0){
            for (int i = 0; i < arr.length ; i += 2) {
                System.out.println(arr[i + 1]);
                System.out.println(arr[i]);
             }
        } else {
            for (int i = 0; i < arr.length - 1; i += 2) {
                System.out.println(arr[i + 1]);
                System.out.println(arr[i]);
            }
            System.out.println(arr[arr.length - 1]);
        }
		
	}
}