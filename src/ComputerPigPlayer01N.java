public class ComputerPigPlayer01N extends ComputerPigPlayer {
    public ComputerPigPlayer01N(String name) {
        super(name);
    }

    @Override
    public void takeTurn() {
        turnTotal = 0;
        int turnScore = 0;
        lastRoll = d.roll();
        while (lastRoll != 1 && turnScore < 20) {
            turnTotal += lastRoll;
            turnScore += lastRoll;
            lastRoll = d.roll();
        }
        if (turnScore >= 20) {
            score += turnTotal;
        }
    }
}
