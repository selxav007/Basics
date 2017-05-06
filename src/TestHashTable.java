import java.util.Hashtable;

public class TestHashTable {

	public static void main(String[] args) {
		Hashtable<String, String> ht = new Hashtable<String, String>();
		ht.put("name", "Dileep");
		ht.put("place", "Delhi");
		ht.put("Corse", "Mech");
		System.out.println(ht.get("place"));
	}
}
