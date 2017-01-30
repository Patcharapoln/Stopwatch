package stopwatch;
/**
 * Append chars to a string.
 * 
 * @author Patcharapol Nirunpornputta
 *
 */

public class AppendToString implements Runnable {
	private int length;
	private String result;
	/**
	 * Initialize the AppendToString with a specific length.
	 * 
	 * @param length is the length of the final String
	 * 
	 */

	public AppendToString(int length) {
		this.length = length;
		this.result = "";
	}
	/**
	 * Add char to String until length
	 */

	@Override
	public void run() {
		final char CHAR = 'a';
		int k = 0;
		while (k++ < length) {
			result = result + CHAR;
		}

	}
	
	/**
	 * Return information of task
	 * 
	 * @return information and result of task
	 */

	@Override
	public String toString() {
		return String.format("Append %,d chars to String\nfinal string length = %d", length, result.length());
	}

}