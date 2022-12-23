import it.units.sdm.jminesweeper.BoardUtil;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.awt.*;
import java.util.LinkedHashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BoardUtilTest {

    @ParameterizedTest
    @CsvSource({"1,1", "9,9", "16,16", "30,16", "50, 50", "4,29"})
    void givenABoardReturnsItsDimensions(int width, int height) {
        Map<Point, String> board = new LinkedHashMap<>();
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                board.put(new Point(i, j), "o");
            }
        }
        assertEquals(new Dimension(width, height), BoardUtil.computeBoardDimension(board));
    }

}
