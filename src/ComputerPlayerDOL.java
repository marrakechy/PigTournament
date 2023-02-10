public class ComputerPlayerDOL extends PigPlayer{
    public ComputerPlayerDOL(String name) {
        super(name);
    }

    @Override
    public void takeTurn() {
        boolean rolling = true;
        turnTotal = 0;
        lastRoll = d.roll();
        while (lastRoll != 1 && rolling) {
            turnTotal += lastRoll;
            printTurnStats();
            lastRoll = d.roll();
        }
        if(turnTotal >= 10){
            rolling = false;
        }
        else if (lastRoll == 1) {
            rolling = false;
            turnTotal = 0;
            System.out.println("\t Rolled 1; no points");
        }
        score += turnTotal;

    }
}
