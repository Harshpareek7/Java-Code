import java.util.Scanner;

public class practice1 {
   
    public static void main(String[] args) {

        /*P1 --> program to sum 3 numbers */
        
        // Scanner scan = new Scanner(System.in);
        // float a = scan.nextFloat();
        // float b = scan.nextFloat();
        // float c = scan.nextFloat();

        // float sum = (a+b+c);
        // System.out.println(sum);
        // scan.close();
        /*P1 end*/


        /*P2 --> calculate CGPA using marks of 3 subjects out of 100*/
        
        // Scanner scan = new Scanner(System.in);
        // float a = scan.nextFloat();
        // float b = scan.nextFloat();
        // float c = scan.nextFloat();

        // float cgpa = (a+b+c)/3;
        // System.out.println(cgpa);
        // scan.close();
        /*P2 end */
    
        /*P3 --> Enter users name and print it dynamically */
            // Scanner scan = new Scanner(System.in);
            // String name  = scan.next();
            // System.out.println("Hello "+name+", have a good day! ");
            // scan.close();
        /*P3 end */

        /*P4 --> Program to convert km to m */
        // Scanner scan = new Scanner(System.in);
        // float km = scan.nextFloat();
        // float m = km * 1000;
        
        // System.out.println("Meters:"+Math.round(m));
        // scan.close();
        /*P4 end */
        
        /*P5 --> check whether entered number is integer or not */
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        try {
            if(a%1 == 0){
            System.out.println("It's an integer");
            }else{
            System.out.println("It's not an integer");
            }}
            catch (Exception e) {
            }
        scan.close();

        }
}
