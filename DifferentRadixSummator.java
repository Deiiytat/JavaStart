import java.util.Scanner;

public class DifferentRadixSummator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число в 2-ой системе счисления.");
        int x = scanner.nextInt(2);
        System.out.println("Введите число в 8-ой системе: ");
        int y = scanner.nextInt(8);
        System.out.println("Введите число в 16-ой системе:");
        int z = scanner.nextInt(16);
        int sum = x + y + z;

        System.out.println(sum);
    }
}
