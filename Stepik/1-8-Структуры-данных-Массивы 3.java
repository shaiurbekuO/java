import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[sc.nextInt()];
		int sum = 0;
		for(int i=0; i<arr.length; i++){
		    arr[i] = sc.nextInt();
		    if (i % 2 == 0) {
                sum += arr[i];
            }
		}System.out.println(sum);
		for(int i=0; i<arr.length; i+=2){
		    System.out.println(arr[i]);
		}
	}
}
