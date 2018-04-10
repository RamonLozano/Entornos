package combate;

public class Main {

	public static void main(String[] args) {

		Personaje Tanque = new Personaje(1500, 75, 75, 75, 5, 25);

		Personaje Equilibrado = new Personaje(1000, 100, 50, 75, 25, 25);
		Personaje damage = new Personaje(750, 150, 50, 75, 25, 35);
		Personaje Destreza = new Personaje(500, 100, 50, 100, 50, 50);

		do {

			Combate.golpear(Tanque, Destreza);

			if (Combate.golpear(Destreza, Tanque)) {

				Tanque.setSalud(Tanque.getSalud() - Combate.calcularDamage(Destreza, Tanque));

			}

		} while (Tanque.getSalud() > 0 || Destreza.getSalud() > 0);

	}

}
