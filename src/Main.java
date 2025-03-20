import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double principal;
        double annualInterestRate;
        int years;

            System.out.print("Wprowadź kwote kredytu: ");



            System.out.print("Wprowadź roczne oprocentowanie: ");

            System.out.print("Wprowadź okres spłaty w latach: ");

            double r = annualInterestRate / 100 / 12;
            int n = years * 12;

            double M = (principal * r * Math.pow((1 + r), n)) / (Math.pow((1 + r), n) - 1);

        System.out.print("Miesięczny koszt kredytu: " + NumberFormat.getCurrencyInstance().format(M));
    }
}
