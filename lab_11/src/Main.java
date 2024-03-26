import java.util.Scanner;

// InvalidAgeException özel istisna sınıfı
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Bir sayı girin: ");
            String numberInput = scanner.nextLine();

            try {
                int number = Integer.parseInt(numberInput);
                int square = number * number;
                System.out.println("Sayının karesi: " + square);
            } catch (NumberFormatException e) {
                throw new NumberFormatException("Sayı formatı hatalı!");
            }

            System.out.print("Bir yaş girin: ");
            int age = Integer.parseInt(scanner.nextLine());

            if (age < 18) {
                throw new InvalidAgeException("Yaş 18'den küçük olamaz!");
            }
            
            System.out.println("Girilen değerler doğru formatta ve uygun yaşta.");
        } catch (NumberFormatException | InvalidAgeException e) {
            System.out.println("Hata: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
