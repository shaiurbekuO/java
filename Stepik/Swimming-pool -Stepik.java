import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Reading input values
        int N = sc.nextInt(); // length of the pool
        int M = sc.nextInt(); // width of the pool
        int X = sc.nextInt(); // distance from the long ledge
        int Y = sc.nextInt(); // distance from the short ledge

        // Calculate minimum distance
        int minDistanceX = Math.min(X, Math.min(M, N) - X);
        int minDistanceY = Math.min(Y, Math.max(M, N) - Y);
        int minDistance = Math.min(minDistanceX, minDistanceY);

        // Output the result
        System.out.println(minDistance);
    }
}
