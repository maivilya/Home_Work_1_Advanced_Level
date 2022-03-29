import java.util.Random;

public class Main {
    public static void main(String[] args) {
        /*Human hum1 = new Human("Илюша", 30, 40);
        hum1.Run();
        hum1.Jump();

        System.out.println();

        Cat cat1 = new Cat("Сашуля", 20, 30);
        cat1.Run();
        cat1.Jump();

        System.out.println();

        Robot rob1 = new Robot(7355608, 100, 0);
        rob1.Run();
        rob1.Jump();*/

        Random rand = new Random();
        Actions[] actions = new Actions[3];

        int distance = rand.nextInt(10);
        int heigth = rand.nextInt(10);
        actions[0] = new Human("Илюша", distance, heigth);

        distance = rand.nextInt(10);
        heigth = rand.nextInt(10);
        actions[1] = new Robot(7355608, distance, heigth);

        distance = rand.nextInt(10);
        heigth = rand.nextInt(10);
        actions[2] = new Cat("Сашуля", distance, heigth);

        Barrier[] barrier = new Barrier[6];

        boolean isRoad;
        for (int i = 0; i < barrier.length; i++) {
            distance = rand.nextInt(10);
            isRoad = rand.nextBoolean();
            if (isRoad) {
                barrier[i] = new Road("Road " + i, distance);
            } else {
                barrier[i] = new Wall("Wall " + i, distance);
            }
        }

        for (int i = 0; i < actions.length; i++) {
            boolean result = true;
            for (int j = 0; j < barrier.length; j++) {


                result = barrier[j].moving(actions[i]);

                if (!result) {
                    break;
                }
            }
        }
    }
}



