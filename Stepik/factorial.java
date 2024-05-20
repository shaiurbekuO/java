import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
        long k = sc.nextLong();
        long sum = 0;
        for(int i=0; i<=k; i++){
            sum += Math.pow(n, i);
        }
        System.out.println(sum);
    }
}    
