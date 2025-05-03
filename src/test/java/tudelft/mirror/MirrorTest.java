package tudelft.mirror;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MirrorTest {

    @Test
    public void testMirrorInMiddle() {
        Mirror mirror = new Mirror();
        assertEquals("ab", mirror.mirrorEnds("abXYZba"));
    }

    @Test
    public void testSingleCharMatch() {
        Mirror mirror = new Mirror();
        assertEquals("a", mirror.mirrorEnds("abca"));
    }

    @Test
    public void testFullMirrorOddLength() {
        Mirror mirror = new Mirror();
        assertEquals("aba", mirror.mirrorEnds("aba"));
    }

    @Test
    public void testEmptyString() {
        Mirror mirror = new Mirror();
        assertEquals("", mirror.mirrorEnds(""));
    }

    @Test
    public void testNoMirror() {
        Mirror mirror = new Mirror();
        assertEquals("", mirror.mirrorEnds("xyz"));
    }

    @Test
    public void testSingleLetter() {
        Mirror mirror = new Mirror();
        assertEquals("a", mirror.mirrorEnds("a"));
    }
}
