package Diablo;

public class Elite extends EvilDevil {

	Elite(int atack, int defence, int blood) {
		super(15, 50, 100,"Elite");
	}

	@Override
	public void punchHero(Hero hero) {
		if (hero != null) {
			hero.health -= this.atack;
		}
	}

}
