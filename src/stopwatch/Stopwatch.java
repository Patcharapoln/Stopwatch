package stopwatch;

/**
 * A Stopwatch that measures elapsed time between a starting time and stopping
 * time, or until the present time.
 * 
 * @author Patcharapol Nirunpornputta
 */
public class Stopwatch {
	/** constant for converting nanoseconds to seconds. */
	private static final double NANOSECONDS = 1.0E-9;
	/** time that the stopwatch was started, in nanoseconds. */
	private long startTime;
	/** time that the stopwatch was stopped, in nanoseconds */
	private long stopTime;
	/** time that the stopwatch was stopped, in nanoseconds */
	private boolean run;

	/** Start stopwatch if it's not running , reset stopwatch */
	public void start() {
		this.startTime = System.nanoTime();
		this.run = true;
	}

	/** Stop stopwatch if it running */
	public void stop() {
		this.stopTime = System.nanoTime();
		this.run = false;
	}

	/**
	 * Return the elapsed time of the stopwatch. If the stopwatch is running,
	 * then return the elapsed time since start until the current time. If
	 * stopwatch is stopped, then return the time between the start and stop
	 * times.
	 * 
	 * @return the elapsed time in seconds with decimal
	 */
	public double getElapsed() {
		if (run) {
			return (System.nanoTime() - startTime) * NANOSECONDS;
		} else
			return (stopTime - startTime) * NANOSECONDS;
	}

	/** Check stopwatch is running or not
	 * 
	 * @return true if stopwatch is running
	 * 		   false if stopwatch isn't running
	 */
	public boolean isRunning() {
		return run;
	}
}
