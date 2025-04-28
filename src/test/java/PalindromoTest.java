import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromoTest {

    private Palindromo checker;

    @BeforeEach
    void setup() {
        checker = new Palindromo();
    }

    @Test
    void notPalindromeTest() {
        assertFalse(checker.esPalindromo("arriba"));
    }

    @Test
    void palindromeTest() {
        assertTrue(checker.esPalindromo("rotor"));
    }

    @Test
    void numberTest() {
        assertTrue(checker.esPalindromo("1221221"));
    }

    @Test
    void spaceTest() {
        assertTrue(checker.esPalindromo("roto r"));
    }

    @Test
    void phraseSpaceTest() {
        assertTrue(checker.esPalindromo(" casa asac"));
    }

    @Test
    void nullTest(){
        assertFalse(checker.esPalindromo(""));
    }
}