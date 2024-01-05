import java.util.*;
class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // пример создания
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] mas = new int[n][m];

        // пример заполнения
        for (int i =0 ; i<n; i++)
            for (int j = 0; j<m; j++)
                mas[i][j] = (i + 1) * (j + 1);
        //пример вывода
        for (int i = 0; i<n; i++){
            for (int j = 0; j<m; j++)
                System.out.print(mas[i][j]+" ");
            System.out.println();
        }
    }
}