package bowling;

public class BowlingGameI1 implements BowlingGame {

    private int[] rolls = { 0, 0, 0, 0 };
    private int rollIndex = 0;

	public void roll(int i) {
        rolls[rollIndex++]= i;
	}

	public Integer score() {
        int score = 0;
        for (int i = 0; i < rolls.length; i++) {
            score += rolls[i];
        }
		return score;
	}


}
