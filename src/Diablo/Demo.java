package Diablo;

public class Demo {

	public static void main(String[] args) {
		Hero hero = new Hero("Toni", "URUK HEI");

		hero.findArmor(new Boots());
		hero.findArmor(new BodyArmor());
		hero.findArmor(new Gloves());
		hero.findArmor(new Helmet());
		System.out.println();
		System.out.println(hero);

		EvilDevil champ = new Champion();
		System.out.println(champ);
		hero.figthEvil(champ);
		System.out.println(champ);
		
		
		hero.figthEvil(champ);
		System.out.println(champ);
		
		hero.figthEvil(champ);
		System.out.println(champ);
		hero.figthEvil(champ);
		System.out.println(champ);
		hero.figthEvil(champ);
		System.out.println(champ);
		hero.figthEvil(champ);
		System.out.println(champ);
		
//		champ.punchHero(hero);
//		System.out.println();
//		System.out.println(hero);
//		champ.punchHero(hero);
//		System.out.println();
//		System.out.println(hero);
//		champ.punchHero(hero);
//		System.out.println();
//		System.out.println(hero);
//		champ.punchHero(hero);
//		System.out.println();
//		System.out.println(hero);
//		champ.punchHero(hero);
//		System.out.println();
//		System.out.println(hero);
//		champ.punchHero(hero);
//		System.out.println();
//		System.out.println(hero);
		
		
		
	}

}
