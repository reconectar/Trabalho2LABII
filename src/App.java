
public class App {

	public static void main(String[] args) {
		Timer timer = new Timer();
		timer.sleep(5000);
		System.out.println(timer.getTotalTimeInMillis());
		System.out.println(timer.getTotalTimeInSeconds());
	}
}
