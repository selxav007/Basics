
public class department implements Employee{

	public static void main(String[] args) {
		Employee e = new department();
		e.policy();
		e.salary();
	}

	@Override
	public void salary() {
		System.out.println("Salary credited");
	}

	@Override
	public void policy() {
		System.out.println("Policy Chnged");	
	}
}
