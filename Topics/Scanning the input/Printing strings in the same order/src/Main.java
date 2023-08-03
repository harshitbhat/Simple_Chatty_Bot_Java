import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int numberOfElements = 4;

        for (int i = 0; i <  numberOfElements; i++) {
            String word = scanner.next();
            System.out.println(word);
        }
    }
}