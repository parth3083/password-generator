import java.util.*;

public class password {
    public static char[] password_generator(int length) {
        String Capital_letters = "ABCDEFGHIJKLMNOPQRSUVWXYZ";
        String lower_letters = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String special_letters = "!$#&@";
        String Combined = Capital_letters + lower_letters + numbers + special_letters;
        Random rand = new Random();
        char[] password = new char[length];
        password[0] = lower_letters.charAt(rand.nextInt(lower_letters.length()));
        password[1] = Capital_letters.charAt(rand.nextInt(Capital_letters.length()));
        password[2] = numbers.charAt(rand.nextInt(numbers.length()));
        password[3] = special_letters.charAt(rand.nextInt(special_letters.length()));
        for (int i = 4; i < length; i++) {
            password[i] = Combined.charAt(rand.nextInt(Combined.length()));
        }
        return password;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the password");
        int length = sc.nextInt();
        System.out.print("Your generated password :");
        System.out.println(password_generator(length));

    }
}