package Diablo;

public class Hero {
	String name;
	String race;
	int health;
	int speed;
	int armor;
	int atack;
	Gun gun;
	BodyArmor bodyArmor;
	Helmet helmet;
	Boots boots;
	Gloves gloves;

	private Hero() {
		this.name = "Hero";
		this.race = "Ork";
		this.health = 100;
		this.speed = 75;
		this.armor = 50;
		this.atack = 15;
	}

	Hero(String name, String race) {
		this();
		if (name != null && !name.isEmpty()) {
			this.name = name;
		}
		if (race != null && !race.isEmpty()) {
			this.race = race;
		}
	}

	public String toString() {
		return "\nHero name: " + this.name + "\nHero Attack " + this.atack + "\nHero speed: " + this.speed
				+ "\nHero race: " + this.race + "\nHero health: " + this.health + "\nHero armor: " + this.armor;
	}

	public void findArmor(Armor armor) {
		if (armor != null) {
			if (armor.getClass().getSimpleName().equals("Boots") && boots == null) {
				boots = (Boots) armor;
				armorSpeedChange(armor);
			} else if (armor.getClass().getSimpleName().equals("Helmet") && helmet == null) {
				helmet = (Helmet) armor;
				armorSpeedChange(armor);
			} else if (armor.getClass().getSimpleName().equals("Gloves") && gloves == null) {
				gloves = (Gloves) armor;
				armorSpeedChange(armor);
			} else if (armor.getClass().getSimpleName().equals("BodyArmor") && bodyArmor == null) {
				bodyArmor = (BodyArmor) armor;
				armorSpeedChange(armor);
			}

		}
	}

	public void armorSpeedChange(Armor armor) {
		System.out.println("armor " + this.armor + " speed " + this.speed);
		this.armor += armor.protection;
		this.speed += armor.affectOnSpeed;
		System.out.println("armor " + this.armor + " speed " + this.speed);
	}

	public void takeAGun(Gun gun) {
		if (gun != null && this.gun == null) {
			this.atack += gun.attack;
			this.gun = gun;
		}
	}

	public void releaseGun() {
		this.atack -= gun.attack;
		this.gun = null;
	}

	public void figthEvil(EvilDevil evil) {
		if (evil != null && evil.blood > 0) {
			if (evil.blood - this.atack < 0) {
				evil.blood = 0;
				System.out.println("Izbih taz gadinkaa ^_^");
				return;
			} else if (evil.defence == 0) {
				evil.blood -= this.atack;
			} else if (evil.defence - this.atack < 0) {
				evil.blood -= Math.abs(evil.defence - this.atack);
				evil.defence = 0;
			} else {
				evil.defence -= this.atack;
			}

			System.out.println(this.name + " shlapq s djapanka " + evil.name);
		} else {
			System.out.println("Stiga bi taz gadinka tq umralq =)");
		}
	}
}
