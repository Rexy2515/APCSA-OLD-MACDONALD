
import java.util.Random;

public class Chick implements Animal {
    private String type;
    private String sound1;
    private String sound2;

    public Chick(String type, String sound) {
        this.type = type;
        this.sound1 = sound;
        this.sound2 = null;
    }

    public Chick(String type, String sound1, String sound2) {
        this.type = type;
        this.sound1 = sound1;
        this.sound2 = sound2;
    }

    @Override
    public String getType() {
        return type;
    }

   @Override
public String getSound() {
    if (sound2 == null) {
        return sound1;
    }

    Random rand = new Random();
    int choice = rand.nextInt(2);

    if (choice == 0) {
        return sound1;
    } else {
        return sound2;
    }
}
}