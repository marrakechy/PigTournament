public class ComputerPlayerLCE extends PigPlayer{
    public ComputerPlayerLCE(String name) {
        super(name);
    }
    @Override
    public void takeTurn() {
        int rolls = 20;
        while (turnTotal < rolls && lastRoll != 1) {
            lastRoll = d.roll();
            turnTotal += lastRoll;
        }
        score += turnTotal;
    }
}

    