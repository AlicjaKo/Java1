import java.util.Scanner;
class E04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a day: ");
        int x = scanner.nextInt();
        System.out.println("Enter a month: ");
        int y = scanner.nextInt();
        if (x == 24 && y == 12) {
            System.out.println("Merry Christmas");
        }
    }
}