class Robot{
    public void speak(String text){
        System.out.println(text);
    }
    public void jump(int height){
        System.out.println("Jumping: " + height);
    }
    public void move(String direction, double distance){
        System.out.println("Moving " + distance + " meters in direction " + direction);
    }
}


public class appRobot {
    public static void main(String[] args) {
        Robot sam = new Robot();
        sam.speak("I am Sam");
        sam.jump(10);
        sam.move("West", 12.2);
        String greeting = "Hello there";
        sam.speak(greeting);
    }
}
