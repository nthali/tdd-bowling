package bowling;

public class BowlingGameI0 implements BowlingGame {

    private int score = 0;

	public void roll(int i) {
        score += i;
	}

	public Integer score() {
		return score;
	}


}
