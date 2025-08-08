import java.util.Scanner;

public class ArmstrongNumber {
    public static boolean isArmstrong(int num) {
        int originalNum = num;
        int numberOfDigits = String.valueOf(num).length();
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, numberOfDigits);
            num /= 10;
        }
        return sum == originalNum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it is an Armstrong number: ");
        int number = scanner.nextInt();
        
        System.out.println(number + (isArmstrong(number) ? " is" : " is not") + " an Armstrong number.");
        scanner.close();
    }
}
