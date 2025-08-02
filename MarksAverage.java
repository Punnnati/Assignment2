import java.util.Scanner;

public class MarksAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks in Maths: ");
        int maths = sc.nextInt();

        System.out.print("Enter marks in Physics: ");
        int physics = sc.nextInt();

        System.out.print("Enter marks in Chemistry: ");
        int chemistry = sc.nextInt();

        int total = maths + physics + chemistry;
        double average = total / 3.0;

        System.out.println("Average marks: " + average);
    }
}