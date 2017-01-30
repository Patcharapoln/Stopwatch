package stopwatch;
/**
 * Append chars to a StringBuilder
 * 
 * @author Patcharapol Nirunpornputta
 *
 */

public class AppendToStringBuilder implements Runnable {
	private int length;
	private String result;
	/**
	 * Initialize the AppendToStringBuilder with a specific length.
	 * 
	 * @param length is the length of the final String
	 * 
	 */

	public AppendToStringBuilder(int length) {
		this.length = length;
		this.result= "";
	}
	/**
	 * Add char to StringBuilder until length
	 */

	@Override
	public void run() {
		final char CHAR = 'a';
		StringBuilder builder = new StringBuilder();
		int k = 0;
		while (k++ < length) {
			builder = builder.append(CHAR);
		}
		result = builder.toString();
	}

	/**
	 * Return information of task
	 * 
	 * @return information and result of task
	 */
	@Override
	public String toString() {
		return String.format("Append %,d chars to StringBuilder\nfinal string length = %d", length ,result.length());
	}
}
