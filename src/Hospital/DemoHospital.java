package Hospital;

public class DemoHospital {

	public static void main(String[] args) {
		Patient patient = new Patient("Toni", "Popov", 6098453445111143L, true);
		Doctor doc = new Doctor("Kolio", "Petkov", 888510026L);
		// doc.addPatient(patient);
		patient.addDoctor(doc);
		patient.infoPatient();
		System.out.println("================");
		doc.infoForDoctir();
		System.out.println("================");
//		System.out.println(patient);
		Department dep = new Department();
		dep.addPatient(patient);
		dep.addPatient(patient);
		dep.addPatient(patient);
		dep.addPatient(patient);
		dep.addPatient(patient);
		dep.addPatient(patient);
		dep.roomInfo();
	}
}
