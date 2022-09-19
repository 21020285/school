public class Student extends Person {
	private String program;
	private int year;
	private double fee;

	public Student(String name, String address, String program, int year, double fee) {
		super(name, address);
		this.program = program;
		this.year = year;
		this.fee = fee;
	}

	public String getProgram(String program) {
		return program;
	}

	public void setProgram() {
		this.program = program;
	}

	public int getYear(int year) {
		return year;
	}

	public void setYear() {
		this.year = year;
	}

	public double getFee(int fee) {
		return fee;
	}

	public void setFee() {
		this.fee = fee;
	}

	public String toString() {
		return "Student[" + super.toString() + ",program=" + program + ",year=" + year + ",fee=" + fee + "]";
	}
}