import java.util.HashSet;
import java.util.Scanner;

public  class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<String> martic = new HashSet<String>();
        while (scanner.hasNext()) {
            martic.add(scanner.next());
        }
        int number = martic.size();
        System.out.println(number);
    }
}