package Diablo;

public class Champion extends EvilDevil {

	Champion() {
		super(25, 20, 50, "Champion");
	}

	@Override
	public void punchHero(Hero hero) {

		if (hero != null && hero.health > 0) {
			if (hero.bodyArmor == null) {
				hero.health -= this.atack;
			} else if (hero.bodyArmor != null) {
				hero.armor -= hero.bodyArmor.protection;
				hero.bodyArmor = null;
			}
			System.out.println(this.getClass().getSimpleName() + " igrae karate v zubite na " + hero.name);
		} else {
			System.out.println("Mi toi umrql MAAA ");
		}
	}

	public String toString() {
		return "\nName: " + this.name + "\nBlood: " + this.blood + "\nAttack: " + this.atack + "\nDefence: "
				+ this.defence+"\n";
	}

}
