package Diablo;

public abstract class Gun {
	
	int attack;
	String name;

	Gun(int attack, String name) {
		if (name != null && !name.isEmpty()) {
			this.name = name;
		}
		if (attack > 0 && attack < 50) {
			this.attack = attack;
		}
	}

}
