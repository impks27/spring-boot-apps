package feature.api;

public class Employee {

	Long id;

	String name;

	int age;

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Actor [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	
}

