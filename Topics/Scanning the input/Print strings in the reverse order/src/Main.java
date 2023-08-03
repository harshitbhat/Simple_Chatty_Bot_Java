import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[3];

        for (int i = 0; i < 3; i++) {
            names[i] = scanner.next();
        }

        for(int i = 2; i >= 0; i--) {
            System.out.println(names[i]);
        }
    }
}