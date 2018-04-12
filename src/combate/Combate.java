package combate;

import java.util.Random;

public class Combate {

	public static boolean golpear(Personaje p1, Personaje p2) {

		boolean golpe;

		Random r = new Random();

		int n = r.nextInt(100);

		int pos = p1.getProbGolpe() - p2.getProbEsquivar();

		if (n > pos) {

			golpe = false;

		} else {

			golpe = true;

		}

		return golpe;

	}
	
// Codigo modificado o añadido	

	public static double calcularDamage(Personaje p1, Personaje p2) {

		double damage = 0;

		if (calcularCritico(p1)) {

			damage = (p1.getAtaque() * 1.5) - p2.getDefensa();

		} else {

			damage = p1.getAtaque() - p2.getDefensa();

		}

		return damage;
	}

	private static boolean calcularCritico(Personaje p1) {

		boolean critico;

		Random r = new Random();

		int n = r.nextInt(100);

		int pos = p1.getProbCritico();

		if (n > pos) {

			critico = false;

		} else {

			critico = true;

		}

		return critico;
	}

}
