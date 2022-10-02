// Assignment Problem 2
class Encapsulate {
	private String name;
	private int rollNo;
	private int age;
	public int getAge() { 
		return age; 
	}
	public String getName() { 
		return name; 
	}
	public int getRollNo() { 
		return rollNo; 
	}
	public void setAge(int newAge) { 
		age = newAge; 
	}
	public void setName(String newName)
	{
		name = newName;
	}
	public void setRollNo(int newRoll) { 
		rollNo = newRoll; 
	}
}

class TestEncapsulation {
	public static void main(String[] args)
	{
		Encapsulate person = new Encapsulate();

		person.setName("Deep");
		person.setAge(19);
		person.setRollNo(8);

		System.out.println("Name: " + person.getName());
		System.out.println("Age: " + person.getAge());
		System.out.println("Roll No: " + person.getRollNo());
	}
}
