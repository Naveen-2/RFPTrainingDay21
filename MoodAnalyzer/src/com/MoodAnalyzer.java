package com;

public class MoodAnalyzer {

    public String message;

    public String analyzeMood (String message) {
        if (message.equalsIgnoreCase("sad")) {
            return "SAD";
        } else {
            return "HAPPY";
        }
    }

    public String analyzeMood() {
        if (this.message.equalsIgnoreCase("sad")) {
            return "SAD";
        } else {
            return "HAPPY";
        }
    }

    public MoodAnalyzer() {

    }

    public MoodAnalyzer(String message) {
        this.message = message;
    }

}
