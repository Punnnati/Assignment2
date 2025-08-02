import java.util.Scanner; 
public class Perimeter_Rectangle{ 
    public static void main(String[] args){ 
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter the length of the Rectangle : "); 
        int l = sc.nextInt(); 
        System.out.print("Enter the breadth of the Rectangle : "); 
        int b = sc.nextInt(); 
        int p=2*(l+b);
        System.out.println("The Perimeter of the rectangle is : "+p); 
    } 
} 
