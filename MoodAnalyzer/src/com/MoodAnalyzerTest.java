package com;

import org.junit.Assert;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MoodAnalyzerTest {

    @org.junit.jupiter.api.Test
    void testanalyzeMood_Happymood_ParametereizedConstructor() throws MoodAnalyzerException {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Happy Mood");
        assertEquals("HAPPY", moodAnalyzer.analyzeMood());
    }

    @org.junit.jupiter.api.Test
    void testanalyzeMood_Sadmood_ParametereizedConstructor() throws MoodAnalyzerException {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in sad Mood");
        assertEquals("HAPPY", moodAnalyzer.analyzeMood());
    }

    @org.junit.jupiter.api.Test
    void testanalyzeMood_Happymood_ParametereizedMethod() throws MoodAnalyzerException {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        assertEquals("HAPPY", moodAnalyzer.analyzeMood("I am in Happy Mood"));
    }

    @org.junit.jupiter.api.Test
    void testanalyzeMood_Sadmood_ParametereizedMethod() throws MoodAnalyzerException {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        assertEquals("HAPPY", moodAnalyzer.analyzeMood("I am in Sad Mood"));
    }

    @org.junit.jupiter.api.Test
    public void testInvalidMood_whenMoodIsNull() {
        try {
            MoodAnalyzer moodAnalyser = new MoodAnalyzer(null);

            String mood = moodAnalyser.analyzeMood();
            System.out.println("invalid mood");
            Assert.assertNull(mood);
        }
        catch (NullPointerException e) {
            System.out.println();
        }
        catch (MoodAnalyzerException e) {
            System.out.println(e.getMessage());
        }
    }

    @org.junit.jupiter.api.Test
    public void testInvalidMood_whenMoodIsEmpty() {
        try {
            MoodAnalyzer moodAnalyser = new MoodAnalyzer();

            String mood = moodAnalyser.analyzeMood();

            Assert.assertNull(mood);
        }
        catch (NullPointerException e) {
            System.out.println();
        }
        catch (MoodAnalyzerException ex) {
            System.out.println(ex);
        }
    }

}