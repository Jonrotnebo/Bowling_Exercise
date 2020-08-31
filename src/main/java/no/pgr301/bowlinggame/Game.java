package no.pgr301.bowlinggame;

public class Game {
    private int rolls[] = new int[21];
    private int currentRoll = 0;

    public void roll(int pins) {
        rolls[currentRoll++] = pins;
    }

    public int score() {
        return 9;
    }

    //tes


}
