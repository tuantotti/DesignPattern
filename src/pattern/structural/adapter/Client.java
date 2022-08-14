package pattern.structural.adapter;

public class Client {
    private MovableTarget movableTarget;

    public void speed() {
        System.out.println("Speed: " + movableTarget.speed() + "KM/H");
    }
}
