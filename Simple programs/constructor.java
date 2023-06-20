/*Constructors are used to assign values to the class variables at the time of object creation, 
  either explicitly done by the programmer or by Java itself (default constructor). */

// public class constructor {
//   constructor(){
//     System.out.println("Default constructor");
//   }
//   public static void main(String[] args) {

//   }
// }



/* Default constructor */

class Geek {
	// data members of the class.
	String name;
	int id;
	Geek(){

    }
	
}
public class constructor {
	public static void main(String[] args)
	{
		// This would invoke the parameterized constructor.
		Geek geek1 = new Geek();
		System.out.println("\""+geek1 +"\" which is a string representation of the object reference.\"");
	}
}









/* Parameterized constructor */

// class Geek {
// 	// data members of the class.
// 	String name;
// 	int id;
// 	Geek(String name, int id)
// 	{
// 		this.name = name;
// 		this.id = id;
// 	}
// }
// class constructor {
// 	public static void main(String[] args)
// 	{
// 		// This would invoke the parameterized constructor.
// 		Geek geek1 = new Geek("avinash", 68);
// 		System.out.println("GeekName :" + geek1.name
// 						+ " and GeekId :" + geek1.id);
// 	}
// }
