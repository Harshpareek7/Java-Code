import java.util.Scanner;
public class check {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int i = scan.nextInt();

        // Write your code here.
        double d = scan.nextDouble();
        

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
        scan.close();
    }
}


