package Map;

public class Dog {
	int age;
	String name;
	String kind;
	
	public Dog (String name, String kind, int age) {
		this.age=age;
		this.name=name;
		this.kind=kind;
	}
	//getter
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
}