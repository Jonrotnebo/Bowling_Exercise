import no.pgr301.bowlinggame.Game;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {

    @Test
    public void testNoStrikeNoSpare() {
        Game game = new Game();
        game.roll(5);
        game.roll(4);
        assertEquals(0, game.score());
    }


    @Test
    public void testGutterGame(){
        Game game = new Game();
        for (int i=0; i<20; i++){
            game.roll(0);
            assertEquals(0, game.score());
        }
    }

    // just a basic test
    @Test
    public void testStrikeOne() {
        Game game = new Game();
        game.roll(10);
        assertEquals(10, game.score());
    }

}
