import java.util.Scanner;


public class output {

     public static void main(String[] args) {
             Scanner scan = new Scanner(System.in);
            // System.out.println("================================");
            // for(int i=0;i<3;i++)
            // {
            //     String s1=sc.next();
            //     int x=sc.nextInt();
            //     //Complete this line
            //     System.out.println(s1);

            String s = scan.nextLine();
            int stringResult = s.length();
         
            // System.out.print(s);

            // for (int i = stringResult; i < 15; i++) {
            //     System.out.print(" ");
            // } 
            

            int intInput = scan.nextInt();
            String intString = Integer.toString(intInput);
            int intValue = intString.length();
            System.out.println(intValue);
            int newValue = 3 - intValue; 
            System.out.println(newValue);
            // for (int i = 0; i < newValue; i++) {
            //     System.out.print("0"+intResult);
            
            // }
            System.out.print(s);
            for (int i = stringResult; i < 15; i++) {
                System.out.print(" ");
            } 
            if(newValue == 1){
                System.out.print("00"+intInput);
               
            }
            if(newValue == 2){
                System.out.print("0"+intInput);
                
            }   
            scan.close();
            }
            // }
            // System.out.println("================================");

    }
  

 




