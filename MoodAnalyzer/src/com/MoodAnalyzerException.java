package com;

public class MoodAnalyzerException extends Exception {

    public enum Code {
        IS_NULL,
        IS_EMPTY,
    };
    public MoodAnalyzerException(Code code) {
        super(code.name());
    }
}
