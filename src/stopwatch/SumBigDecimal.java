package stopwatch;

import java.math.BigDecimal;
/**
 * Add BigDecimal objects from an array.
 * 
 * @author Patcharapol Nirunpornputta
 *
 */
public class SumBigDecimal implements Runnable {
	private int counter;
	private BigDecimal sum = new BigDecimal(0.0);
	static final int ARRAY_SIZE = 500000;
	
	/**
	 * Initialize BigDecimal with the counter.
	 * 
	 * @param counter is how many times to add the number
	 */

	public SumBigDecimal(int counter) {
		this.counter = counter;
	}
	
	/**
	 * Add numbers from 1 until ARRAY_SIZE by using BigDecimal
	 */
	@Override
	public void run() {

		// create array of values to add, before we start the timer
		BigDecimal[] values = new BigDecimal[ARRAY_SIZE];
		for (int i = 0; i < ARRAY_SIZE; i++)
			values[i] = new BigDecimal(i + 1);
		for (int count = 0, i = 0; count < counter; count++, i++) {
			if (i >= values.length)
				i = 0;
			sum = sum.add(values[i]);
		}

	}
	/**
	 * Return information of task
	 * 
	 * @return information and result of task
	 */
	
	@Override
	public String toString() {
		
		return "Sum array of BigDecimal with count= "+ counter+ "\nsum = " + sum;
	}

}
