import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.FileNotFoundException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class theMorseCodeConverterTestStudent {

	/**
	 * Testing for correct conversion of all characters using key phrase to hit all letters
	 */
	

	@Test
	public void testConvertMorseStringToEnglishString() {	
		String Translate = MorseCodeConverter.convertToEnglish​("--. .. ...- . / -- . / -.-- --- ..- .-. / .- -. ... .-- . .-. / -.. ---");
		assertEquals("give me your answer do", Translate);
	}
		@Test
		public void testConvertMorseStringToEnglishString1() {	
			String Translate2 = MorseCodeConverter.convertToEnglish​(".-.. .. -.- . / - .... . / -- --- --- -. / -.-- --- ..- .-. / ..-. .- -.-. . / .-- .- ... / -.-. .-. . .- - . -.."
					);
			assertEquals("like the moon your face was created", Translate2);


	}
	
	@Test
	public void testConvertMorseFileToEnglishString() {	
		
		
		File file = new File("src/howDoILoveThee.txt"); 
		try {
			assertEquals("how do i love thee let me count the ways", MorseCodeConverter.convertToEnglish​(file));
		} catch (FileNotFoundException e) {
			assertTrue("Unwanted exception was caught", false);
		}
	}
	

}
