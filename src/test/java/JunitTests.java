import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JunitTests {

    @Test
    void add() {
        assertEquals(4,Program.add(2,2));
    }
    @Test
    void spinWords() {
        assertEquals("emocleW",Program.spinWords("Welcome"));
        assertEquals("Hey wollef sroirraw",Program.spinWords("Hey fellow warriors"));
    }
    @Test
    void pathFinderTets(){
        String a = ".W.\n"+
                ".W.\n"+
                "...",

                b = ".W.\n"+
                        ".W.\n"+
                        "W..",

                c = "......\n"+
                        "......\n"+
                        "......\n"+
                        "......\n"+
                        "......\n"+
                        "......",

                d = "......\n"+
                        "......\n"+
                        "......\n"+
                        "......\n"+
                        ".....W\n"+
                        "....W.";

        assertEquals(true,  Program.pathFinder(a));
        assertEquals(false, Program.pathFinder(b));
        assertEquals(true,  Program.pathFinder(c));
        assertEquals(false, Program.pathFinder(d));
    }

    @Test
    void scramble() {
        assertAll(  () -> assertEquals(true, Program.scramble("rkqodlw", "world")),
                    () -> assertEquals(true, Program.scramble("cedewaraaossoqqyt", "codewars")),
                    () -> assertEquals(false, Program.scramble("katas", "steak")));
    }
}