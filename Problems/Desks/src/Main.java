import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int totalDesks = 0;
        for (int i = 0; i < 3; i++) {
            int groupSize = scanner.nextInt();
            double desksNeededForGroup = 1.0 * groupSize / 2;
            totalDesks += Math.ceil(desksNeededForGroup);
        }
        System.out.println(totalDesks);
    }
}