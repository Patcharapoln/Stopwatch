package stopwatch;
/**
 * Run the tasks.
 *
 * @author Patcharapol Nirunpornputta
 * 
 */
public class TaskTimer {
	public static void measureAndPrint(Runnable run) {
		Stopwatch timer = new Stopwatch();
		timer.start();
		run.run();
		timer.stop();
		System.out.println(run.toString());
		System.out.printf("Elapsed time %.6f sec\n\n", timer.getElapsed());

	}

}

