package Diablo;

public abstract class EvilDevil {
	int atack;
	int defence;
	int blood;
	String name;

	EvilDevil(int atack, int defence, int blood,String name) {
		this.name = name;
		this.atack = atack;
		this.defence = defence;
		this.blood = blood;
	}
	abstract public void punchHero(Hero hero);
}
