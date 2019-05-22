
public class Timer {
	
	private long startingTime;
	private long totalTime;
	
	public Timer() {
		 this.startingTime = System.currentTimeMillis();
	}
	
	public long getTotalTimeInMillis() {
		this.totalTime = System.currentTimeMillis() - startingTime;
		return totalTime;
	}
	
	public long getTotalTimeInSeconds() {
		return getTotalTimeInMillis()/1000;
	}
	
	public long getTotalTimeInMinutes() {
		return getTotalTimeInSeconds()/60;
	}
	
	public void sleep(long millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
}
