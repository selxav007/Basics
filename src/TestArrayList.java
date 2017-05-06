import java.util.ArrayList;

public class TestArrayList {

	public static void main(String[] args) {
		ArrayList<String> myList = new ArrayList<String>();
		myList.add("Dileep");
		myList.add("Ram");
		myList.add("Ramu");
		System.out.println(myList.get(1));
		System.out.println(myList.size());
		for(int i=1; i<(myList.size());i++)
		{
			System.out.println(myList.get(i));
		}
	}
}
