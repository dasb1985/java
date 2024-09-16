import java.security.Permission;

class Person{
    String name;
    int age;

    void speak(){
        System.out.println("My name is : " + name);
    }

    int calculateYearsToRetirermen(){
        int yearsLeft = 65 - age ;
        return yearsLeft;
    }

    int getAge(){
        return age;
    }
    String getName(){
        return name;
    }
}
public class App {
    public static void main(String[] args) {
        Person person1= new Person();
        person1.name =  "jhon";
        person1.age = 18;
        //person1.speak();
        int years= person1.calculateYearsToRetirermen();

        System.out.println("years to retire: " + years);

        int age= person1.getAge();
        String name =person1.getName();
        System.out.println("name is: " + name);
        System.out.println("age is: " + name);
    }
}
