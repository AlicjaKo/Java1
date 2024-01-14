import java.util.Scanner;

class E09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double round = 1;
        double score = 0;
        while (true) {
            System.out.println("Give a test score (-1 to quit):");
            int x = scanner.nextInt();
            if (x==-1){
                break;
            }
            else {
                score+=x;
                System.out.println("Average: " + score/round);
                round++;
            }
        }
    }
}