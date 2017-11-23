package Casa;


public class Porta {
	boolean aberta = false;
	String cor;
	float x;
	float y;
	float z;
	void abre() {
		if (this.aberta == true) {
			System.out.println("A porta já está aberta.");
		} else {
			this.aberta = true;
			System.out.println("A porta está aberta.");
		}
	}
	void fecha() {
		if (this.aberta == false) {
			System.out.println("A porta já está fechada.");
		} else {
			this.aberta = false;
			System.out.println("A porta está fechada.");
		}
	}
	void pinta(String corEscolhida) {
		if (this.cor == corEscolhida) {
			System.out.println("A porta ja está com essa cor");
		} else {
			this.cor = corEscolhida;
			System.out.println("A porta está com a cor " + this.cor);
		}
	}
	boolean estaAberta() {
		if (this.aberta) {
			System.out.println("A porta está aberta");
			return true;
		} else {
			System.out.println("A porta está fechada");
			return false;
		}
	}
}


