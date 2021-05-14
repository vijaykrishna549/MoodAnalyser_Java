package com.moodanalyser;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoodAnalyserTest {
    @Test
    //public void testAnalyseMood()
      public void givenMessage_WhenSad_ShouldReturnSad() throws MoodAnalysisException {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("This is a Sad Message");
        assertEquals("SAD" , mood);
    }

     @Test
    public void givenMessage_WhenNotSad_ShouldReturnHappy() throws MoodAnalysisException {
         MoodAnalyser moodAnalyser = new MoodAnalyser();
         String mood = moodAnalyser.analyseMood("This is a happy Message");
         assertEquals("HAPPY" , mood);
     }
     @Test
    public void givenMessage_WhenNoEmotions_ShouldReturnDead() throws MoodAnalysisException {
         MoodAnalyser moodAnalyser = new MoodAnalyser();
         String mood = moodAnalyser.analyseMood("The Person is Dead");
         assertEquals("DEAD", mood);

     }
     @Test
    public void givenMessage_WhenNull_ShouldThrowException() {
         MoodAnalyser moodAnalyser = new MoodAnalyser(null);
         try {
             moodAnalyser.analyseMood(null);
         } catch (MoodAnalysisException e) {
             Assertions.assertEquals(MoodAnalysisException.ExceptionType.ENTERED_NULL, e.type);
         }


     }
}
