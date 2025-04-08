
public class Animal {

	private String name;
	private String type;

	Animal(String name, String type) {

		this.name = name;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public int hashcode() {
		return name.hashCode();
	}

	public boolean equals(Object o) {
		Animal x = (Animal) o;
		return name.equals(x.getName());

	}
	
	public String toString() {
		
		return name;
		
	}

}
