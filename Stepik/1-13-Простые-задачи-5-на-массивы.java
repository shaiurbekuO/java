import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), a, b;
		int[] arr = new int[n];
		for(int i=0; i<arr.length; i++){
		    arr[i] = sc.nextInt();
		}
		a = sc.nextInt();
		b = sc.nextInt();
		if(n>b && n>a && a>-1 && b>-1){
		    System.out.print(arr[a]+arr[b]);
		}else{
		    System.out.print("Error");
		}
	}
}
