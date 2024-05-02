package steampractice.binding;

public class Person {

	private String name;
	private String add;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", add=" + add + "]";
	}
	public Person(String name, String add) {
		super();
		this.name = name;
		this.add = add;
	}
	
	
}
