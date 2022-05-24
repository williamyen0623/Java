
public class Student {
	private String name;
	private String major;
	protected int credits = 0;
	
	public Student(String name, String major) {
		setName(name);
		setMajor(major);
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getMajor() {
		return major;
	}
	public int getCredits() {
		return credits;
	}
	public void addCredits(int credits) {
		this.credits += credits;
	}
}
