package com;


import static org.junit.jupiter.api.Assertions.assertEquals;

class MoodAnalyzerTest {

    @org.junit.jupiter.api.Test
    void testanalyzeMood_Happymood1() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Happy Mood");
        assertEquals("HAPPY", moodAnalyzer.analyzeMood());
    }

    @org.junit.jupiter.api.Test
    void testanalyzeMood_Sadmood1() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in sad Mood");
        assertEquals("HAPPY", moodAnalyzer.analyzeMood());
    }

    @org.junit.jupiter.api.Test
    void testanalyzeMood_Happymood2() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        assertEquals("HAPPY", moodAnalyzer.analyzeMood("I am in Happy Mood"));
    }

    @org.junit.jupiter.api.Test
    void testanalyzeMood_Sadmood2() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        assertEquals("HAPPY", moodAnalyzer.analyzeMood("I am in Sad Mood"));
    }
}