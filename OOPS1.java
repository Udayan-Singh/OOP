public class OOPS1 {
    public static void main(String[] args) {

        //Declaring Objects
        Student student1 = new Student();

        student1.marks = 95.5f;
        student1.name = "Praveen";
        student1.roll_no = 50;

        //Use of default constructor
        Student student2 = new Student();

        //Use of Parameterised constructor
        Student student3 = new Student(1, 32.23f, "Pramit");

        //Copy constructor
        Student student4 = new Student(student1);
        //Supplied value
        student1.Greeting();
        System.out.println(student1.marks +  " " + student1.roll_no + " " + student1.name);

        //Default value
        student2.Greeting();
        System.out.println(student2.marks +  " " + student2.roll_no + " " + student2.name);

        //Parameterised Value
        student3.Greeting();
        System.out.println(student3.marks +  " " + student3.roll_no + " " + student3.name);

        //Copied value
        student4.Greeting();
        System.out.println(student4.marks +  " " + student4.roll_no + " " + student4.name);

    }

    //Classes do not occupy space in memory.
    //Classes are like user-defined datatypes. They serve as template for objects.
    //Syntax to create a class is "Class ClassName{ }"


}
class Student{

    //Providing default values.
    int roll_no ;
    String name ;
    float marks ;

    //Creating constructor
    Student(){
        this.roll_no = 65;
        this.name = "Udayan";
        this.marks = 95.5f;
    }

    //Parameterised Constructor
    Student(int roll_no,float marks,String name){
        this.name = name;
        this.roll_no = roll_no;
        this.marks = marks;
    }

    //Copy constructor
    Student(Student other){
        this.name = other.name;
        this.roll_no = other.roll_no;
        this.marks = other.marks;
    }
    
    //Creating a function
    void Greeting() {
        System.out.println("Hello my name is " + this.name);
    }

}