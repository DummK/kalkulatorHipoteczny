import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double principal;
        double annualInterestRate;
        int years;

        while (true) {
            System.out.print("Wprowadź kwote kredytu: ");
                principal = scanner.nextDouble();
                if (principal >= 1000 && principal <= 1000000) {
                    break;
                }
                else {
                    System.out.println("Błędna kwota kredytu, Wprowadź wartość między 1000 a 1 000 000");
                }
        }

        while (true) {
            System.out.print("Wprowadź roczne oprocentowanie: ");
            annualInterestRate = scanner.nextDouble();
            if (annualInterestRate >= 1 && annualInterestRate <= 30) {
                break;
            }
            else {
                System.out.println("Błędna roczna stopa oprocentowania, Wprowadź wartość między 1 a 30");
            }
        }

        while (true) {
            System.out.print("Wprowadź okres spłaty w latach: ");
            years = scanner.nextInt();
            if (years >= 1 && years <= 30) {
                break;
            }
            else {
                System.out.println("Błędny okres spłaty kredytu, Wprowadź wartość między 1 a 30");
            }
        }

            double r = annualInterestRate / 100 / 12;
            int n = years * 12;

            double M = (principal * r * Math.pow((1 + r), n)) / (Math.pow((1 + r), n) - 1);

        System.out.print("Miesięczny koszt kredytu: " + NumberFormat.getCurrencyInstance().format(M));
    }
}
