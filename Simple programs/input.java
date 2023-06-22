import java.util.Scanner;
public class input {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
       

        // Write your code here.
        
        int i = scan.nextInt();
        scan.nextLine();
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
        scan.close();
    }
}


