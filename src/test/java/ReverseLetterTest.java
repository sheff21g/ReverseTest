import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
public class ReverseLetterTest {


        @Test
        void shouldReverseExampleFromTask() {
            assertEquals("t@eb eht av$J!123",
                    ReverseLetter.reverseLetters("J@va the be$t!123"));
        }

        @Test
        void shouldReturnEmptyStringForEmptyInput() {
            assertEquals("", ReverseLetter.reverseLetters(""));
        }

        @Test
        void shouldKeepSingleLetterAsIs() {
            assertEquals("a", ReverseLetter.reverseLetters("a"));
        }

        @Test
        void shouldNotChangeStringWithoutLetters() {
            assertEquals("123 !@#", ReverseLetter.reverseLetters("123 !@#"));
        }

        @Test
        void shouldReverseStringWithOnlyLetters() {
            assertEquals("dcba", ReverseLetter.reverseLetters("abcd"));
        }

        @Test
        void shouldKeepNonLettersOnTheirPositions() {
            assertEquals("!dc-ba?", ReverseLetter.reverseLetters("!ab-cd?"));
        }

        @Test
        void shouldMoveLettersTogetherWithTheirCase() {
            assertEquals("olleH", ReverseLetter.reverseLetters("Hello"));
        }

        @Test
        void shouldReturnNullForNullInput() {
            assertNull(ReverseLetter.reverseLetters(null));
        }
    }


