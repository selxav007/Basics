
public class TestException {

	public static void main(String[] args) {
		System.out.println("Start");
		try {
			int c = 5/0;
			System.out.println(c);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Start Exe");
		System.out.println("Start Exe");
	}
}
