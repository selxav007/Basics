
public class Const {
	
	String Name;
	int age;
	int RollNo;
	
	public Const(String Name, int age, int RollNo)
	{
		this.Name = Name;
		this.age = age;
		this.RollNo =RollNo;
		
		
		
	
	}

	public static void main(String[] args) {
		
		Const c = new Const("Dil", 12, 101);
		Const d = new Const("Dilee", 13, 103);
		System.out.println(c.Name);
		System.out.println(c.age);
		System.out.println(c.RollNo);
		System.out.println(d.Name);
		System.out.println(d.age);
		System.out.println(d.RollNo);
	}

}
