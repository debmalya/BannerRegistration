import java.util.List;

public class BannerRegistration {

	public BannerRegistration() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
		return result;
	}

	/**
	 * Parse a paragraph and return all the sentences in the paragraph.
	 * 
	 * @param s
	 *            paragraph.
	 * @return list of sentences.
	 */
	public String[] parseSentence(String s) {
		return getParts(s,"[.]");
	}

	/**
	 * Get the different parts of the sentence. Split it by ",".
	 * 
	 * @param s
	 *            - one complete sentence.
	 * @return String array after splitting the sentence by ",".
	 */
	public String[] getEachPartOfSentence(String s) {
		return getParts(s,",");
	}
	
	public String[] getParts(String s,String splitter) {
		return s != null ? s.split(splitter) : null;
	}
}
