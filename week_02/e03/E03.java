import java.util.Scanner;
class E03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int x = scanner.nextInt();
        if (x>0) {
            System.out.println("Positive number");
        }
        else {
            System.out.println("Negative number");
        }
    }
}