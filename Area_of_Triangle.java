import java.util.Scanner; 
public class Area_of_Triangle{ 
    public static void main(String[] args){ 
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter the base of the triangle : "); 
        int b = sc.nextInt(); 
        System.out.print("Enter the height of the triangle : "); 
        int h = sc.nextInt(); 
        System.out.print("The Area of the Traingle is : "+(0.5*b*h)); 
    } 
} 
