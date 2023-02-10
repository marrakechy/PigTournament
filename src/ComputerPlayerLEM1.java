public class ComputerPlayerLEM1 extends PigPlayer{
    private static final int GOLDEN_NUM = 13;
    public ComputerPlayerLEM1(String name) {
        super(name);
    }

    @Override
    public void takeTurn() {
        boolean rolling = true;
        System.out.println(name+"'s turn");
        turnTotal = 0;
        lastRoll = d.roll();
        while (lastRoll != 1 && rolling){
            turnTotal += lastRoll;
            printTurnStats();
            if(turnTotal<GOLDEN_NUM) {
                rolling = true;
            } else if(turnTotal >=GOLDEN_NUM){
                rolling = false;
            }
            if (score +turnTotal >= PigGame.WIN_SCORE){
                rolling = false;
            }
            if(rolling){
                lastRoll = d.roll();
            }
        }
        if (lastRoll == 1){
            turnTotal = 0;
            System.out.println("\t Rolled 1; no points");
        }
        score += turnTotal;
    }

}