import java.util.Scanner; 
public class Perimeter_Square{ 
    public static void main(String[] args){ 
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter the side of the square : "); 
        int side = sc.nextInt(); 
        int p=4*side;
        System.out.println("The perimeter of the square is : "+p); 
    } 
} 
