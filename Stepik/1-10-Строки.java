import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Чтение ввода
        String inputString = scanner.nextLine();

        // Вывод третьего символа
        System.out.println(inputString.charAt(2));

        // Вывод предпоследнего символа
        System.out.println(inputString.charAt(inputString.length() - 2));

        // Вывод первых пяти символов
        System.out.println(inputString.substring(0, 5));

        // Вывод всей строки, кроме последних двух символов
        System.out.println(inputString.substring(0, inputString.length() - 2));

        // Вывод всей строки, кроме первых трех символов
        System.out.println(inputString.substring(3));

        // Вывод длины строки
        System.out.println(inputString.length());
    }
}
