package Casa;

public class Casa {
	String cor;
	Porta porta1 = new Porta();
	Porta porta2 = new Porta();
	Porta porta3 = new Porta();
	Porta porta4 = new Porta();
	void pinta(String corCasa){
		if (this.cor == corCasa) {
			System.out.println("A casa ja está com essa cor");
		} else {
			this.cor = corCasa;
			System.out.println("A casa está com a cor " + this.cor);
		}
	}
	int quantasPortasEstaoAbertas(){
		int cont=0;
			if(this.porta1.aberta){				
				cont = cont+1;
			}
			if(this.porta2.aberta){
				cont = cont+1;
			}
			if(this.porta3.aberta){
				cont= cont+1;
			}
			if(this.porta4.aberta){
				cont= cont+1;
			}
		return cont; 
	}
}