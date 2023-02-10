import java.io.PipedOutputStream;

public class ComputerPigPlayer extends PigPlayer {


    public ComputerPigPlayer(String name) {
        super(name);
    }

    @Override
    public void takeTurn() {
        System.out.println("I'll pass");
    }
}

    