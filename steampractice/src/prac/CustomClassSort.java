package prac;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;

public class CustomClassSort {

	public static void main(String[] args) {
		List<User> list = List.of(new User(1, "smith", "Male", LocalDate.parse("1990-08-01"), 20000.0),
				new User(1, "ward", "Male", LocalDate.parse("1992-05-03"), 20000.0),
				new User(1, "allen", "Female", LocalDate.parse("1985-01-04"), 10000.0),
				new User(1, "miss", "Female", LocalDate.parse("1998-05-05"), 2000.0),
				new User(1, "buffer", "Male", LocalDate.parse("2000-11-09"), 320000.0));

		List<User> sal = list.stream().sorted(Comparator.comparing(User::getSal).reversed()).toList();
		list.stream().sorted(Comparator.comparing(User::getSal).reversed()).limit(1).forEach(System.out::println);
		
		list.stream().sorted(Comparator.comparing(User::getDob)).forEach(S);
		
		
		

	}
}

class User {

	private Integer id;
	private String uname;
	private String gender;
	private LocalDate dob;
	private Double sal;

	public User(Integer id, String uname, String gender, LocalDate dob, Double sal) {
		this.id = id;
		this.uname = uname;
		this.gender = gender;
		this.dob = dob;
		this.sal = sal;
	}

	public User() {
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", uname=" + uname + ", gender=" + gender + ", dob=" + dob + ", sal=" + sal + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public Double getSal() {
		return sal;
	}

	public void setSal(Double sal) {
		this.sal = sal;
	}

}
