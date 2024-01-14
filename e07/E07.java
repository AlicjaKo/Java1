import java.util.Scanner;

class E07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which multiplicand multiplication table to show?");
        int x = scanner.nextInt();
        System.out.println("Until which multiplyer?");
        int y = scanner.nextInt();
        for (int i = 1; i<y+1; i++) {
            System.out.println(i + " x " + x + " = " + (x*i));
        }       
    }
}