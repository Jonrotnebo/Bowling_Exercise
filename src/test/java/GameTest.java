import no.pgr301.bowlinggame.Game;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {
    private Game g;

    protected void SetUp() throws Exception {
        g = new Game();
    }

    @Test
    public void testNoStrikeNoSpare() {
        Game game = new Game();
        game.roll(5);
        game.roll(4);
        assertEquals(9, game.score());
    }

    @Test
    public void rollMany(int n, int pins) {
        for (int i = 0; i < n; i++)
            g.roll(pins);
    }
}
