package stopwatch;

public class Stopwatch {
	private static final double NANOSECONDS = 1.0E-9;
	private long startTime;
	private long stopTime;
	private boolean run;

	public void start() {
		this.startTime = System.nanoTime();
		this.run = true;
	}

	public void stop() {
		this.stopTime = System.nanoTime();
		this.run=false;
	}

	public double getElapsed() {
		if(run==true){
			return System.nanoTime()-startTime;
		}
		else
			return stopTime-startTime;
	}

	public boolean isRunning() {
		return run;

	}
}
