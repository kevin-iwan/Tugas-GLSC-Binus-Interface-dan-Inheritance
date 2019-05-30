package main;

public abstract class BaseCharacter {

	protected String name;
	protected String description;
	
	public BaseCharacter() {

	}

	public BaseCharacter(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}

	public void getInfo() {
		System.out.println("");
		System.out.println("Person Details");
		System.out.println("==============");
		System.out.println("<----Name----> <----Job---->");
		System.out.println("<" + name + "> " + "<" + description + ">");
		System.out.println("");
	}
}
