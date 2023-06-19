
public class variables{
    public static void main(String[] args){ // An array of strings (usually called args) as a parameter to the main method. This array allows command-line arguments to be passed to the program if needed.
        int age; //  Declaration of an integer variable named 'age'(eg _age,$age,age1)
        
        for(age=1;age<=10;age++){
            System.out.println(age);
        }
        boolean age1 = true; // Assigning a new value to the 'age' variable
        if(age1){
            System.out.println("true");
        }
        

        /*  Scope: The scope of a variable determines where it can be accessed. 
            In Java, variables can have different scopes:

            Local variables: Declared inside methods, constructors, or blocks and are accessible only within their respective scope.

            Instance variables: Declared within a class but outside any method. They are accessible to all methods of the class.

            Class variables (static variables): Shared across all instances of a class. They are declared with the static keyword.
            */
        
        variables sum = new variables();
        sum.calculateSum(); // calling the method
        
    }
    
        /* Local variables */
        
        public int calculateSum(){
        int a = 10;  // local variable 'a' declared and initialized
        int b = 20;  // local variable 'b' declared and initialized
        int sum = (a+b); // local variable 'sum' declared and assigned the sum of 'a' and 'b'
        System.out.println("Sum is " + sum);
        return sum;
}
}

  /* Instance variable */
        /* Instance variables are variables that belong to an instance(object) of a class. Each object or instance of a class has its own copy 
        of instance variables. These variables hold the state or data associated with the objects. */

    /* Class declaration rules
    There can be only one public class in a file, and the file name must match the public class name. This is required because the Java compiler uses the file name to determine the name of the public class.

    If there are additional non-public classes in the same file, their names and visibility (public, private, protected) do not matter. However, it is generally considered good practice to have only one public class per file.

    Inner classes, which are classes defined within another class, can be placed in the same file as the outer class. In this case, the file will contain multiple class definitions.*/

    class person{
    private String name; /*Instance variable */
    private int age;    /*Instance variable */

    /* Constructor */
    public person(String name , int age){
        this.name = name;
        this.age = age;
    }

    /*Getters and Setters */
    public String getName(){
        return name;
    }    
    public void setName(String a){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int a){
        this.age = age;
    }

  
     
    public void sum(){
    person P = new person("hello",20);
    P.setAge(30);
    P.setName("Harry");
    System.out.println(getName());   
    }

    }

// }