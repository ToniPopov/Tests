package Hospital;

public class Department {
	Room[] room = new Room[10];
	boolean isMale;
	String diagnose;

	Department() {
		for (int i = 0; i < room.length; i++) {
			this.room[i] = new Room();
		}
	}

	void addPatient(Patient patient) {
		System.out.println(patient);
		if (patient != null) {
		done: for (int i = 0; i < this.room.length; i++) {
				for (int j = 0; j < this.room[i].patients.length; j++) {
					if (this.room[i].patients[j] == null) {
						System.out.println("i: " + i +" j: "+j);
						this.room[i].patients[j] = patient;
						this.diagnose = patient.card.diagnose;
						this.isMale = patient.isMale;
						patient.card.roomNum = i;
						break done;
					}
				}
			}
		}
	}

	public void roomInfo() {
		int count = 0;
		for (int i = 0; i < room.length; i++) {
			if (room[i].patients.length > 0) {
				for (int j = 0; j < room[i].patients.length; j++) {
					if (room[i].patients[j] != null) {
						count++;
					}
				}
			}
			System.out.println("In room number " + i + " has " + (3 - count) + " free beads");
			count = 0;
		}
	}
}
