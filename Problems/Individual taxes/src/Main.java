import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int numberOfCompanies = scanner.nextInt();
        int[] annualIncomes = new int[numberOfCompanies];
        for (int i = 0; i < numberOfCompanies; i++) {
            annualIncomes[i] = scanner.nextInt();
        }
        double mostTax = 0;
        int indexOfMostTax = -1;
        for (int i = 0; i < numberOfCompanies; i++) {
            int percentTax = scanner.nextInt();
            double check = 1.0 * annualIncomes[i] * percentTax / 100;
            if (check > mostTax) {
                mostTax = check;
                indexOfMostTax = i;
            }
        }
        if (mostTax == 0) {
            System.out.println(0);
        } else {
            System.out.println(indexOfMostTax + 1);
        }
    }
}