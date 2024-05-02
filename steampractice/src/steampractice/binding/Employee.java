package steampractice.binding;

public class Employee {

	private Integer id;
	private String name;
	private Integer salary;
	private Integer age;
	private Integer salInteger;
	
	
	
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Integer getSalInteger() {
		return salInteger;
	}
	public void setSalInteger(Integer salInteger) {
		this.salInteger = salInteger;
	}
	public Employee(Integer id, String name, Integer salary, Integer age, Integer salInteger) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.age = age;
		this.salInteger = salInteger;
	}
	public Employee(Integer id, String name, Integer salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", age=" + age + ", salInteger="
				+ salInteger + "]";
	}
	
	
	
	
	
	
}
