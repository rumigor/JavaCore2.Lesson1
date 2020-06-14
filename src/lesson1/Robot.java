package lesson1;

public class Robot implements Competitor {
    String name;
    protected int maxRunDistance;
    protected int maxJumpHeight;
    protected boolean onDistance = true;

    public Robot(String name, int maxRunDistance, int maxJumpHeight) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
    }

    @Override
    public void run(int dist) {
        if (dist <= maxRunDistance) {
            System.out.printf("%s %s успешно пробежал %d  метров\n", "Робот",name, dist);
        } else {
            System.out.printf("%s %s не смог пробежать %d  метров\n", "Робот", name, dist);
            onDistance = false;
        }
    }

    @Override
    public void jump(int height) {
        if (height <= maxJumpHeight) {
            System.out.printf("%s %s успешно прыгнул %d  метров\n","Робот", name, height);
        } else {
            System.out.printf("%s %s не смог прыгнуть %d  метров\n","Робот", name, height);
            onDistance = false;
        }
    }

    @Override
    public boolean isOnDistance() {
        return onDistance;
    }

    @Override
    public void info() {
        System.out.printf("%s %s %b\n", "Робот", name, onDistance);
    }
}
