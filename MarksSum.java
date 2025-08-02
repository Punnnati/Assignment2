import java.util.Scanner;

public class MarksSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks in Maths: ");
        int m = sc.nextInt();

        System.out.print("Enter marks in Physics: ");
        int p = sc.nextInt();

        System.out.print("Enter marks in Chemistry: ");
        int c = sc.nextInt();

        int total = m + p + c;

        System.out.println("Total marks: " + total);
    }
}