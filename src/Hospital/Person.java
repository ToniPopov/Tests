package Hospital;

public class Person {
	protected String fName;
	protected String lName;
	protected long telNum;

	Person() {
		this.fName = "Firstname";
		this.lName = "Lastname";
		this.telNum = 800000000L;
	}

	Person(String fName, String lName, long telnum) {
		if (fName != null && !fName.isEmpty()) {
			this.fName = fName;
		}
		if (lName != null && !lName.isEmpty()) {
			this.lName = lName;
		}
		if (telnum > 999) {
			this.telNum = telnum;
		}
	}
}
