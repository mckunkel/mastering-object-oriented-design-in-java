package clients;

import domain.Doctor;
import domain.Employee;
import domain.Nurse;

public class EmergencyRoomProcess {

	public static void main(String[] args) {
		HosptialManagement ERDirector = new HosptialManagement();
		Employee peggy = new Nurse(1, "Peggy", "emergency", true);
		ERDirector.callUpon(peggy);

		Employee suzan = new Doctor(2, "Suzan", "emergency", true);

		ERDirector.callUpon(suzan);

	}
}
