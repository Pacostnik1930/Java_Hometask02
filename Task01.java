import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите слово: ");
        String name = scan.nextLine();
    }

    public static Boolean isPalendrome(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;

            }
        }
        return true;
    }

}
