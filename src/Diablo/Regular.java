package Diablo;

public class Regular extends EvilDevil {

	Regular(int atack, int defence, int blood) {
		super(5, 20, 15,"Regular");
	}

	@Override
	public void punchHero(Hero hero) {
		if (hero != null) {
			hero.health -= this.atack;
		}
	}

}
