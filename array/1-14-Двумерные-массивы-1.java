import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		for(int i=0; i<arr.length; i++){
		    for(int j=0; j<arr[i].length; j++){
		        if(i==j){
		            arr[i][j]=1;
		        }else if(i < j){
                    arr[i][j] = 0;
                }else if(i > j){
                    arr[i][j] = 2;
		        }
		    }
		}
		for(int i=0; i<n; i++){
		    for(int j=0; j<n; j++){
		        System.out.print(arr[i][j]+" ");
		    }
		    System.out.println();
		}
	}
}
