package bowling;

public class BowlingGameI3 implements BowlingGame {

    private int[] rolls = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
    private int rollIndex = 0;

	public void roll(int i) {
        rolls[rollIndex++]= i;
	}

	public Integer score() {
        int score = 0;
        for (int i = 0; i < 10; i++) {
            score += rolls[i];
            if ( rolls[i] == 10 ) { // strike!
                score += rolls[i+1] + rolls[i+2];
            }
            else if ( i%2 == 0 && rolls[i]+rolls[i+1] == 10) { // spare!
                score += rolls[i+2];
            }
        }
		return score;
	}
}
