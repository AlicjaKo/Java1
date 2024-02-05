import java.util.Scanner;

class E07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which multiplication table to show?");
        int x = scanner.nextInt();
        System.out.println("Until which multiplier should the table show?");
        int y = scanner.nextInt();
        for (int i = 0; i<y+1; i++) {
            System.out.println(i + " x " + x + " = " + (x*i));
        }       
    }
}