import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] arr = new double[n];
        double[] arr2 = new double[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextDouble();
        }
        for(int i=0; i<arr2.length; i++){
            arr2[i] = sc.nextDouble();
        }
        for(int i=0; i<n; i++)
            System.out.println(arr[i]+arr2[i]);
        
    }
}
