import java.util.Objects;

class S09_MiniAsserts {

    static void assertTrue(boolean condition, String message) {
        if (!condition) throw new AssertionError(message);
    }

    static void assertEquals(Object expected, Object actual) {
        if (!Objects.equals(expected, actual)) {
            throw new AssertionError("Expected [" + expected + "] but got [" + actual + "]");
        }
    }
}
