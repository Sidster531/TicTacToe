import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int seats = scanner.nextInt();
        int[][] cinema = new int[rows][seats];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < seats; j++) {
                cinema[i][j] = scanner.nextInt();
            }
        }
        int neighboringSeats = scanner.nextInt();
        int found = 0;
        int row = 0;
        for (int i = rows - 1; i >= 0; i--) {
            found = 0;
            for (int j = 0; j < seats; j++) {
                if (cinema[i][j] == 0) {
                    found++;
                    if (found == neighboringSeats) {
                        row = i + 1;
                    }
                } else {
                    found = 0;
                }
            }
        }
        System.out.println(row);
    }
}
