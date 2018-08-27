package algorithm;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class ThreeCardsGameTest {
    private String inputString;

    @Before
    public void setUp() throws Exception {
        inputString = "1 2 3 4 5\n" + "8";
    }

    @Test
    public void 데이터분해() throws Exception {
        ThreeCardsGame game = ThreeCardsGame.of(inputString);

        assertThat(game.getSortedArrays().length, is(5));
        assertThat(game.getPickNumber(), is(8));
    }
}