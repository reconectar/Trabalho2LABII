
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
			totalTime.append(getTotalTimeInHours() + " horas, ");
		}if(getTotalTimeInMinutes()!=0) {
			totalTime.append((getTotalTimeInMinutes() - 60*getTotalTimeInHours()) + " minutos, ");
		}if(getTotalTimeInSeconds()!=0) {
			totalTime.append((getTotalTimeInSeconds() - 60*getTotalTimeInMinutes()) +  " segundos, ");
		}if(getTotalTimeInMillis()!=0) {
			totalTime.append((getTotalTimeInMillis() - 1000*getTotalTimeInSeconds()) + " millisegundos.");
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
