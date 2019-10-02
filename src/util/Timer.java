/* @author "Arthur Gramiscelli Branco"
   Created on 24/05/2019
*/

package util;

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
		return getTotalTimeInMillis() / 1000;
	}

	public long getTotalTimeInMinutes() {
		return getTotalTimeInSeconds() / 60;
	}
	
	public long getTotalTimeInHours() {
		return getTotalTimeInMinutes() / 60;
	}
	
	public String getTotalTime() {
		StringBuilder totalTime = new StringBuilder();
		if(getTotalTimeInHours()!=0) {
			totalTime.append(getTotalTimeInHours() + " h, ");
		}if(getTotalTimeInMinutes()!=0) {
			totalTime.append((getTotalTimeInMinutes() - 60*getTotalTimeInHours()) + " min, ");
		}if(getTotalTimeInSeconds()!=0) {
			totalTime.append((getTotalTimeInSeconds() - 60*getTotalTimeInMinutes()) +  " seg, ");
		}if(getTotalTimeInMillis()!=0) {
			totalTime.append((getTotalTimeInMillis() - 1000*getTotalTimeInSeconds()) + " milliseg.");
		}
		return totalTime.toString();
	}

	public void sleep(long millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
