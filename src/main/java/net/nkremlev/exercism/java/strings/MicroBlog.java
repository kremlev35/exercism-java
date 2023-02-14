package net.nkremlev.exercism.java.strings;

class MicroBlog {
    public String truncate(String input) {
        int limit = 5;
        return input.codePointCount(0, input.length()) > limit
                ? input.substring(0, input.offsetByCodePoints(0, limit))
                : input;
    }
}
