class Frog{
    private String name;
    private int age;

    //public void setName(String newName){
    public void setName(String name){
        //name = newName;
        this.name = name;
    }
    //public void setAge(int newAge){
    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    public void setInfo(String name, int age){
        setName(name);
        setAge(age);
    }

}
public class appSetters {
public static void main(String[] args) {
    //encapsulation
    Frog frog1 = new Frog();
    //frog1.name="bertie";
    frog1.setName("bertie");
    //frog1.age=1;
    frog1.setAge(2);
    System.out.println(frog1.getName());
}
}
