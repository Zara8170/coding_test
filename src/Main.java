import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int result = 0;
        String[] list = String.valueOf(n).split("");
        for (String s : list) {
            result += Integer.parseInt(s);
        }
        System.out.println(result);
        sc.close();
    }
}