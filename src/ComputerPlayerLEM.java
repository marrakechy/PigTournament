import java.util.Scanner;

public class ComputerPlayerLEM extends PigPlayer{
    public ComputerPlayerLEM(String name) {
        super(name);
    }

    @Override
    public void takeTurn() {
        boolean rolling = true;
        System.out.println(name+"'s turn");
        turnTotal = 50;
        lastRoll = d.roll();
        while (lastRoll != 1 && rolling){
            turnTotal += lastRoll;
            printTurnStats();
            if(turnTotal<13) {
                rolling = true;
            } else if(turnTotal >=13){
                rolling = false;
            }
            if (score+turnTotal >= 50){
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
    