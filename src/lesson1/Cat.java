package lesson1;

public class Cat implements Competitor {
    String name;
    protected int maxRunDistance;
    protected int maxJumpHeight;
    protected boolean onDistance = true;

    public Cat(String name, int maxRunDistance, int maxJumpHeight) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
    }

    @Override
    public void run(int dist) {
        if (dist <= maxRunDistance) {
            System.out.printf("%s %s успешно пробежал %d  метров\n", "Кот",name, dist);
        } else {
            System.out.printf("%s %s не смог пробежать %d  метров\n", "Кот", name, dist);
            onDistance = false;
        }
    }

    @Override
    public void jump(int height) {
        if (height <= maxJumpHeight) {
            System.out.printf("%s %s успешно прыгнул %d  метров\n", "Кот", name, height);
        } else {
            System.out.printf("%s %s не смог прыгнуть %d  метров\n", "Кот", name, height);
            onDistance = false;
        }
    }

    @Override
    public boolean isOnDistance() {
        return onDistance;
    }

    @Override
    public void info() {
        System.out.printf("%s %s  %b\n", "Кот", name, onDistance);
    }
}
