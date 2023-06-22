import java.util.Scanner;

public class percentage_new {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        float a = scan.nextFloat();
        float b = scan.nextFloat();
        float c = scan.nextFloat();
        float d = scan.nextFloat();
        float e = scan.nextFloat();
        float percentage = (a+b+c+d+e)/5;

        System.out.println(percentage);
        scan.close();
        

    }
}
