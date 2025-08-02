import java.util.Scanner;

public class DenominationBreak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount: ");
        int amount = sc.nextInt();
        int thousands = amount / 1000;
        int remainderAfterThousands = amount % 1000;
        int fiveHundreds = remainderAfterThousands / 500;
        int remaining = remainderAfterThousands % 500;
        System.out.println("1000s: " + thousands);
        System.out.println("500s: " + fiveHundreds);
        System.out.println("Remaining: " + remaining);
    }
}
