package Hospital;

public class Doctor extends Person {
	Patient patient;
	boolean isFree;

	Doctor(String fName, String lName, long telnum) {
		super(fName, lName, telnum);
		this.isFree = true;
	}

	public void addPatient(Patient patientt) {
		if (patientt != null && this.isFree) {
			
			this.patient = patientt;
			patientt.card.doctor = this;
			this.isFree = false;
		}
	}

	public String toString() {
		return "Doctor " + this.fName + " " + this.lName + "\nTelNum " + this.telNum;
	}

	public void infoForDoctir() {
		System.out.println(this);
		if (this.patient != null) {
			System.out.println(this.patient);
		}
	}

	void createPlan() {

	}
}
