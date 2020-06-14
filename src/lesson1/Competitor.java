package lesson1;

public interface Competitor extends Jumpable, Runnable{
    boolean isOnDistance();
    void info();
}
