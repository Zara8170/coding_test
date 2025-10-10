import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String answer = sc.nextLine();
        int n = sc.nextInt();
        
        String result = answer.substring(answer.length() - n);
        System.out.println(result);
    }
}