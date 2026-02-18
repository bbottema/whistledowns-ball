class S13_MiniAsserts {
    static void assertTrue(boolean condition, String message) {
        if (!condition) throw new AssertionError(message);
    }
}
