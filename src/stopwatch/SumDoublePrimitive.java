package stopwatch;

/**
 * Add double primitives from an array.
 * 
 * @author Patcharapol Nirunpornputta
 */

public class SumDoublePrimitive implements Runnable {
	private int counter;
	private double sum;
	static final int ARRAY_SIZE = 500000;

	/**
	 * Initialize SumDoublePrimitive with the counter.
	 * 
	 * @param counter
	 *            is how many times to add the number
	 */

	public SumDoublePrimitive(int counter) {
		this.counter = counter;
	}

	/**
	 * Add numbers from 1 until ARRAY_SIZE by using double primitive
	 */
	@Override
	public void run() {

		// create array of values to add before we start the timer
		double[] values = new double[ARRAY_SIZE];
		for (int k = 0; k < ARRAY_SIZE; k++)
			values[k] = k + 1;

		// count = loop counter, i = array index value
		for (int count = 0, i = 0; count < counter; count++, i++) {
			if (i >= values.length)
				i = 0; // reuse the array when get to last value
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
		return "Sum array of double primitives with count= " + counter + "\nsum = " + sum;
	}
}
