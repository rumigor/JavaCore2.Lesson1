package lesson1;

public class Robot implements Jumpable, Runnable {
    String name;
    int maxRun;
    int maxJump;

    @Override
    public void run() {
        System.out.println("кот " + name + " бежит");
    }

    @Override
    public void jump() {
        System.out.println("кот " + name + " прыгает");

    }
}
