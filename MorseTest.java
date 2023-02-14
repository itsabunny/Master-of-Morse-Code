import org.junit.Assert;
import org.junit.Test;

public class MorseTest {
    @Test
    public void test1(){
        MorseLogic morseLogic = new MorseLogic();

        //Arrange
        String input = "sos";

        //Act
        String actual = morseLogic.englishToMorse(input);
        String expected = "... --- ... ";

        //Assert
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void test2(){
        MorseLogic morseLogic = new MorseLogic();

        //Arrange
        String input = "... --- ...";

        //Act
        String actual = morseLogic.morseToEnglish(input);
        String expected = "sos";

        //Assert
        Assert.assertEquals(expected,actual);
    }
}
