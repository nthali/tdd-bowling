package bowling;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BowlingGameTest {
    private BowlingGame game;

    @BeforeEach
    public void setUp() {
        game = new BowlingGameI3();
    }

    @Test
    public void rollASeven() {
        game.roll(3);
        game.roll(4);
        assertEquals(7, game.score());
    }

    @Test
    public void rollANine() {
        game.roll(3);
        game.roll(6);
        assertEquals(9, game.score());
    }

    @Test
    public void rollASpare() {
        game.roll(4);
        game.roll(6);
        game.roll(3);
        assertEquals(16, game.score());
    }

    @Test
    public void rollAStrike() {
        game.roll(10);
        game.roll(6);
        game.roll(3);
        assertEquals(28, game.score());
    }

    @Test
    public void rollTwoSpares() {
        game.roll(4);
        game.roll(6);
        game.roll(3);
        game.roll(7);
        game.roll(3);
        assertEquals(29, game.score());
    }

    @Test
    public void rollTwoStrikes() {
        game.roll(10);
        game.roll(10);
        game.roll(3);
        game.roll(3);
        assertEquals(45, game.score());
    }

    @Test
    public void rollTwoSeparateStrikes() {
        game.roll(10); // 10 + 3 + 3 = 16
        game.roll(3);
        game.roll(3); // 3 + 3 = 6
        game.roll(10); // 10 + 5 + 3 = 18
        game.roll(5);
        game.roll(3); // 5 + 3 = 8
        assertEquals(48, game.score());
    }

    @Test
    public void rollPerfectGame() {
        for (int i=0; i<12; i++) {
            game.roll(10);
        }
        assertEquals(300, game.score());
    }
}
