package Hospital;

public class Patient extends Person {
	Card card;
	boolean isMale;

	Patient(String fName, String lName, long telnum, boolean isMale) {
		super(fName, lName, telnum);
		card = new Card();
		this.isMale = isMale;
	}

	public void addDoctor(Doctor doc) {
		if (doc != null && doc.isFree) {
			doc.patient = this;
			this.card.doctor = doc;
			doc.isFree = false;
		} else if (!doc.isFree) {
			System.out.println("Docotr " + doc.lName + " is not free at the moment");
		}
	}

	public String toString() {
		return "Patient " + this.fName + " " + this.lName + "\nTelNum " + this.telNum;
	}

	public void infoPatient() {
		System.out.println(this);
		if (this.card.doctor != null) {
			System.out.println(this.card.doctor);
		}
	}
}
