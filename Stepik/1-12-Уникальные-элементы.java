import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) 
        array[i] = sc.nextInt();

        for (int i : array){
        int count = 0;
        for (int j : array) if (i == j) count++;
        if (count == 1) System.out.println(i);
        }
	}
}
