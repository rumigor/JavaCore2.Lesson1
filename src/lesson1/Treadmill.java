package lesson1;

public class Treadmill extends Obstacle {
    int length;

    public Treadmill(int length) {
        this.length = length;
    }

    @Override
    public void doIt(Competitor c) {
        c.run(length);
    }
}
