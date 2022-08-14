package pattern.structural.adapter;

public class MovableAdapter implements MovableTarget {
    private MovableAdaptee movableAdaptee;

    public MovableAdapter(MovableAdaptee movableAdaptee) {
        this.movableAdaptee = movableAdaptee;
    }

    public float speed() {
        return movableAdaptee.speed() * 1.60934f;
    }
}
