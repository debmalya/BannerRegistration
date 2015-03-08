import java.util.Map;
import java.util.TreeMap;

public class BannerRegistration {

	/**
	 * Total number of words.
	 */
	private int totalWordCount;

	/**
	 * Frequency map - key is string and number of occurrences is the value.
	 */
	private Map<String, Integer> frequencyMap = new TreeMap<String, Integer>();

	public BannerRegistration() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int getTotalWordCount() {
		return totalWordCount;
	}

	public Map<String, Integer> getFrequencyMap() {
		return frequencyMap;
	}

	/**
	 * The United States National Institute of Health (NIH) has built a system
	 * that uses expert labeling to annotate abstracts from Pubmed so disease
	 * characteristics can be more easily identified. This open-source,
	 * supervised learning system called BANNER achieves a good level of
	 * prediction power.
	 * 
	 * Information extraction from textual data. To aid in the automated Named
	 * Entity Recognition (NER) of biomedical publications. Learn to accurately
	 * merge data collected from multiple annotators of varying quality and
	 * integrate this data into predictive models.
	 * 
	 * @param s
	 * @return
	 */
	public String displayTestCase(String s) {
		String result = null;
		String[] sentences = parseParagrpah(s);

		for (String eachSentence : sentences) {
			String[] parts = parseSentence(eachSentence);
			String[] words = getParts(eachSentence," ");
			updateCount(words);
		}
		return result;
	}

	/**
	 * Parse a paragraph and return all the sentences in the paragraph.
	 * 
	 * @param s
	 *            paragraph.
	 * @return list of sentences.
	 */
	public String[] parseParagrpah(String s) {
		return getParts(s, "[.]");
	}

	/**
	 * Get the different parts of the sentence. Split it by ",".
	 * 
	 * @param s
	 *            - one complete sentence.
	 * @return String array after splitting the sentence by ",".
	 */
	public String[] parseSentence(String s) {
		return getParts(s, ",");
	}

	/**
	 * To split a string based on specified splitter ([.],",")
	 * 
	 * @param s
	 *            string to be splitter.
	 * @param splitter
	 *            character (e.g . ,)
	 * @return
	 */
	public String[] getParts(String s, String splitter) {
		return s != null ? s.split(splitter) : null;
	}

	/**
	 * Update total word count and frequency count of each word.
	 * @param values - words in the paragraph.
	 * 
	 */
	public void updateCount(String[] values) {

		totalWordCount += values.length;
		for (String eachWord : values) {
			Integer count = frequencyMap.get(eachWord);
			if (count == null) {
				count = 0;
			}
			frequencyMap.put(eachWord, ++count);

		}

	}
}
