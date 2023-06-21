import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String s = sc.nextLine();
       
        System.out.println("Integer is  : "+a);
        System.out.println("String"+ s);

        sc.close();
    }
}
