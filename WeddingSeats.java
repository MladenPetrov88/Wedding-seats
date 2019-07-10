import java.util.Scanner;

public class WeddingSeats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char lastSector = scanner.nextLine().charAt(0);
        int rows = Integer.parseInt(scanner.nextLine());
        int seats = Integer.parseInt(scanner.nextLine());
        int total = 0;

        for (char i = 'A'; i <= lastSector; i++) {
            for (int j = 1; j <= rows; j++) {
                if (j % 2 == 1) {
                    for (int k = 1; k <= seats; k++) {
                        System.out.println("" + i + j + (char) (k+96));
                        total++;
                    }
                }

                else if (j % 2 == 0) {
                    for (int k = 1; k <= seats + 2; k++) {
                        System.out.println("" + i + j + (char)(k+96));
                        total++;
                    }
                }
            }
            rows++;
        }

        System.out.println(total);
    }
}