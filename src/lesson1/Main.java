package lesson1;

import java.util.Random;

public class Main {
static Random random = new Random();
    public static void main(String[] args) {
        Competitor[] competitors = {
                new Human("Иван", random.nextInt(500) + 500, random.nextInt(2)+2),
                new Cat("Чероки", random.nextInt(1500)+50, random.nextInt(4)+2),
                new Cat("Тигр", random.nextInt(1000)+500, random.nextInt(6)+4),
                new Robot("Спутник", random.nextInt(550)+50, random.nextInt(2)+1),
                new Human("Карл", random.nextInt(3000)+1000, random.nextInt(3)+1),
                new Robot("Электроник", random.nextInt(2000)+500, random.nextInt(10))
        };

        Obstacle[] obstacles ={
                new Treadmill(random.nextInt(1000)+20),
                new Wall(random.nextInt(5) + 1),
                new Treadmill(random.nextInt(1000)+20),
                new Wall(random.nextInt(5) + 1),
        };

        for (Competitor c:competitors ) {
            for (Obstacle o:obstacles ) {
                o.doIt(c);
                if(!c.isOnDistance()){
                    break;
                }
            }
        }

        for (Competitor competitor : competitors) {
            competitor.info();
        }
    }
}
