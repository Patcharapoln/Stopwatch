package stopwatch;
/**
 * Add Double objects from an array.
 *
 * @author Patcharapol Nirunpornputta
 *
 */

public class SumDouble implements Runnable {
	private int counter;
	private Double sum;
	static final int ARRAY_SIZE = 500000;
	
	/**
	 * Initialize SumDouble with the counter.
	 * 
	 * @param counter is how many times to add the number
	 */

	public SumDouble(int counter) {
		this.counter = counter;
	}

	/**
	 * Add numbers from 1 until ARRAY_SIZE by using Double
	 */
	
	@Override
	public void run() {
		
		// create array of values to add, before we start the timer
		Double[] values = new Double[ARRAY_SIZE];
		for (int i = 0; i < ARRAY_SIZE; i++)
			values[i] = new Double(i + 1);

		// count = loop counter, i = array index
		for (int count = 0, i = 0; count < counter; count++, i++) {
			if (i >= values.length)
				i = 0;
			sum = sum + values[i];
		}
		
	}
	
	/**
	 * Return information of task
	 * 
	 * @return information and result of task
	 */
	@Override
	public String toString() {
		return "Sum array of Double objects with count= "+ counter + "\nsum = " + sum;
	}
}
