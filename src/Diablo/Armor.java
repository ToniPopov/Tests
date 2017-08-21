package Diablo;

public abstract class Armor {
	int protection;
	int affectOnSpeed;

	Armor(int protection, int affectOnSpeed) {
		if (protection <= 25 && protection > 0) {
			this.protection = protection;
		}
		if (affectOnSpeed <= 25) {
			this.affectOnSpeed = affectOnSpeed;
		}
	}

}
