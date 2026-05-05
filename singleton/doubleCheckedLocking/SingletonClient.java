package singleton.doubleCheckedLocking;
public class SingletonClient {
	public static void main(String[] args) {
		Singleton singleton = Singleton.getInstance();
	}
}
 