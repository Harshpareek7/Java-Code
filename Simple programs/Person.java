public class Person {

    private String name; /* Instance variable */

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int age; /* Instance variable */

    /* Constructor */
    // public person(String name , int age){
    // this.name = name;
    // this.age = age;
    // }

    // /*Getters and Setters */
    // public String getNname(){
    // return name;
    // }
    // public void setName(){
    // this.name = name;
    // }

    // public int getAge(){
    // return age;
    // }

    // public void setAge(){
    // this.age = age;
    // }

    // Person person = new Person(){
    // person.setAge(30);
    // Person.setName("Harry");
    // }

}
