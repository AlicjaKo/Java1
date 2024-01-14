import java.util.Scanner;
class E08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Give a number (0 to quit):");
            int x = scanner.nextInt();
            if (x==0) {
                break;
            }
            else if ((x%2)==0) {
                System.out.println("Number is even");
            }
            else {
                System.out.println("Number is odd");
            }
        }
    
    }
}