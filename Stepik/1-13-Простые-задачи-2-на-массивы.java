import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        int j = 0;
        for (int i = 0; i < n; i++){
            j = i*i;
            System.out.print(j + " ");
        }
    }
}