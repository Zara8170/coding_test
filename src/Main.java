public class Main {
    public static void main(String[] args) {

        // System.out.println("Hello, World!");
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        if (A < 1 || A > 100 || B < 1 || B > 100) {
            System.out.println("Invalid input");
            return;
        }

        double avg = (double) (A + B) / 2;

        System.out.printf("%d + %.1f", A + B, avg);
        
    }
}