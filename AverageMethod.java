import java.util.Scanner;

public class AverageMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Number 1: ");
        int numero1 = Integer.valueOf(scanner.nextLine());

        System.out.println("Number 2: ");
        int numero2 = Integer.valueOf(scanner.nextLine());

        System.out.println("Number 3: ");
        int numero3 = Integer.valueOf(scanner.nextLine());

        double average = averageOfNums(numero1, numero2, numero3);

        System.out.println("The average is: " + average);
    }

    public static double averageOfNums(int num1, int num2, int num3) {
        int sum = num1 + num2 + num3;
        double average = sum / 3.0;

        return average;
    }
}
