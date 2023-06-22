package pattern.creational.prototype;

public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot("Optimus", "VietNam", "Nope");
        Robot robot1 = robot.clone();

        System.out.println("Robot: "+ robot);
        System.out.println("Robot1: "+ robot1);

        boolean isReference = robot.equals(robot1);
        System.out.println(isReference);
    }
}
