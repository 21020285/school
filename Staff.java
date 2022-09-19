public class Staff extends Person {
	private String school;
	private double pay;

	public Staff(String name, String address, String school, double pay) {
		super(name, address);
		this.school = school;
		this.pay = pay;
	}

	public String getSchool(String school) {
		return school;
	}

	public void setSchool() {
		this.school = school;
	}

	public double getPay(double pay) {
		return pay;
	}

	public void setPay() {
		this.pay = pay;
	}

	public String toString() {
		return "Staff[" + super.toString() + ",school=" + school + ",pay=" + pay + "]";
	}
}