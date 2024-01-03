import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int product = 1;

        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                if (number != 0) {
                    product *= number;
                }
            } else {
                String word = scanner.next();
                if (word.equals("СТОП")) {
                    break;
                }
            }
        }

        if (product != 1) {
            System.out.println(product);
        } else {
            System.out.println("Не найдено");
        }
    }
}
