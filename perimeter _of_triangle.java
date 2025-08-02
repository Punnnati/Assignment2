import java.util.Scanner; 
public class TrianglePerimeter{ 
    public static void main(String[] args){ 
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter the Length of the side 1 :"); 
        int s1 = sc.nextInt(); 
        System.out.print("Enter the Length of the side 2 :"); 
        int s2 = sc.nextInt(); 
        System.out.print("Enter the Length of the side 3 :"); 
        int s3 = sc.nextInt(); 
        int p=s1+s2+s3;
        System.out.println("The perimeter of the trangle is : "+p); 
    } 
} 
