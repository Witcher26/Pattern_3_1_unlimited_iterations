import ru.zvezdilin.classes.Logger;
import ru.zvezdilin.classes.Randoms;

public class Main {

    public static void main(String[] args) {
        Logger log = Logger.getLogger();
        log.getInfo("Start programme");
        for (int randomNumber : new Randoms(90, 100)) {
            System.out.println("Случайное число: " + randomNumber);

            if (randomNumber == 100) {
                log.getInfo("Matched value");
                System.out.println("Выпало 100, выходим");
                break;
            }
        }

        log.getInfo("Finished programme");
    }
}
