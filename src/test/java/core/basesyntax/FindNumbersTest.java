package core.basesyntax;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class FindNumbersTest {
    private static final List<String> listOfTexts = new ArrayList<>();
    private static final int[][] listOfCorrectAnswer = {
            {96, 18, 26, 0},
            {18, 24, 2, 134, 8, 180, 8, 0},
            {-28, 8, 44, 12, 108, 6, 24, 16},
            {164, 46, 2, 104, 6}};

    @Before
    public void initialization() {
        listOfTexts.add("data 48 call 9 read13 blank0a");
        listOfTexts.add("9t12okay 1 67 4is90 sun4y 0!");
        listOfTexts.add("-14I 4 a22m 6sl54e3epy 12 ui8");
        listOfTexts.add("W82 ath23 1kill52 her3e");
    }

    @Test
    public void getAllNumbers() {
        FindNumbers findNumbers = new FindNumbers();
        for (int i = 0; i < listOfTexts.size(); i++) {
            int[] actualResult = findNumbers.getAllNumbers(listOfTexts.get(i));
            int[] expectedResult = listOfCorrectAnswer[i];
            Assert.assertArrayEquals(
                    "Test failed with text = " + listOfTexts.get(i),
                    expectedResult,
                    actualResult);
        }
    }
}
