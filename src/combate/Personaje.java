package combate;

public class Personaje {

	double salud;

	double ataque;

	double defensa;

	int probGolpe;

	int probEsquivar;

	int probCritico;

	public double getSalud() {
		return salud;
	}

	public void setSalud(double salud) {
		this.salud = salud;
	}

	public double getAtaque() {
		return ataque;
	}

	public void setAtaque(double ataque) {
		this.ataque = ataque;
	}

	public double getDefensa() {
		return defensa;
	}

	public void setDefensa(double defensa) {
		this.defensa = defensa;
	}

	public int getProbGolpe() {
		return probGolpe;
	}

	public void setProbGolpe(int probGolpe) {
		this.probGolpe = probGolpe;
	}

	public int getProbEsquivar() {
		return probEsquivar;
	}

	public void setProbEsquivar(int probEsquivar) {
		this.probEsquivar = probEsquivar;
	}

	public int getProbCritico() {
		return probCritico;
	}

	public void setProbCritico(int probCritico) {
		this.probCritico = probCritico;
	}

	public Personaje(int salud, int ataque, int defensa, int probGolpe, int probEsquivar, int probCritico) {
		super();
		this.salud = salud;
		this.ataque = ataque;
		this.defensa = defensa;
		this.probGolpe = probGolpe;
		this.probEsquivar = probEsquivar;
		this.probCritico = probCritico;
	}

}
