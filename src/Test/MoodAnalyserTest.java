package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bl.CustomException;
import com.bl.MoodAnalyzer;

class MoodAnalyserTest {

	public static enum moodType{NULL, EMPTY,}

	@Test
	void analyzeHappyMoodTest() {
		try {
			MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Happy Mood");
			assertEquals("Happy", moodAnalyzer.analyzeMood());
		} catch (CustomException e) {System.out.println(e.getMessage());}
	}
	
	@Test
	void analyzeSadMoodTest() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Sad Mood");
		try {
			assertEquals("SAD", moodAnalyzer.analyzeMood());
		} catch (CustomException e) {System.out.println(e.getMessage());}
	}
	
	@Test
	void analyzeNullMoodTest() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
		try {
			assertEquals("Happy", moodAnalyzer.analyzeMood());
		} catch (CustomException e) {
			System.out.println(e.getMessage());
			}
	}
	
	@Test
	void analyzeEmptyMoodTest() {
		
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer("");
		try {
			assertEquals("SAD", moodAnalyzer.analyzeMood());
		} catch (CustomException e) {System.out.println(e.getMessage());}
	}

}
