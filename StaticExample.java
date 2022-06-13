public class StaticExample {

    public static void main(String[] args) {

        Human a = new Human(21,"Udayan",5500000,false);
        System.out.println(a.population);
        Human b = new Human(21, "Praveen", 5500000,true);
        System.out.println(b.population);
        Human c = new Human();
        System.out.println(Human.population);

        Greeting(b);
    }

    //We use static to define method because main is static and a static method
    //can only call upon other static methods because anything that is non-static
    //it belongs to the object.

    static void Greeting(Human a){
        System.out.println("Hello I am " + a.name);
    }
    //In layman terms, if Main does not depend on any instances, then how can
    //Greeting(a function which is inside main) depend on any instance
}

class Human{
    int age;
    String name;
    int salary;
    boolean married;
    //Static in class  is a property common to all objects
    static long population = 0;

    Human(){
        name = "Abc";
        age = 18;
        salary = 100000;
        married = false;
        Human.population+=1;
    }

    Human(int age, String name, int salary, boolean married){
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population+=1;
    }
}
