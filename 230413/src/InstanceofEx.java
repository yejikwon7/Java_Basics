class Person {
	String name;
	String id;
	public Person(String name) {
		this.name = name;
	}
}

class Student extends Person {
	String grade;
	String department;
	public Student(String name) {
		super(name);
	}
}

class Researcher extends Person {
	String field;
	public Researcher(String name) {
		super(name);
	}
}

class Professor extends Researcher {
	String department;
	public Professor(String name) {
		super(name);
	}
}

public class InstanceofEx {
	static void print(Person p) {
		if(p instanceof Person)
			System.out.print("Person ");
		if(p instanceof Student)
			System.out.print("Student ");
		if(p instanceof Researcher)
			System.out.print("Researcher ");
		if(p instanceof Professor)
			System.out.print("Professor ");
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("new Student() -> \t");
		print(new Student("lee"));
		System.out.print("new Researcher() -> \t");
		print(new Researcher("kim"));
		System.out.print("new Professor() -> \t");
		print(new Professor("park"));
	}

}
