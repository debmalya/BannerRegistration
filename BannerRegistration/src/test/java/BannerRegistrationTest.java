import org.junit.Assert;
import org.junit.Test;



public class BannerRegistrationTest {

	private static final String SEPARATOR = "--------------";
	private static final String PARAGRAPH_TWO_SENTENCE = "Faulkner to Mathews, 1 run, picks up a single through point to retain the strike."
			+ "Faulkner to Mathews, 1 run, able to work away a run towards the leg slip";

	@Test
	public void testSentenceParse() {
		BannerRegistration reg = new BannerRegistration();
		String[] sentences = reg.parseParagrpah(PARAGRAPH_TWO_SENTENCE);
		Assert.assertEquals(2,sentences.length);
		for (String each:sentences) {
			System.out.println(SEPARATOR);
			System.out.println(each);
			System.out.println(SEPARATOR);
			String[] values = reg.parseSentence(each);
			for (String eachPart: values) {
				System.out.println(eachPart);
			}
		}
	}
	
	@Test
	public void testDisplayText() {
		BannerRegistration reg = new BannerRegistration();
		reg.displayTestCase(PARAGRAPH_TWO_SENTENCE);
		System.out.println("Total words :" + reg.getTotalWordCount());
		System.out.println("Frequency map :" + reg.getFrequencyMap());
	}

}
