package Casa;

public class TestaCasa {
	public static void main(String[] args) {
		Casa c = new Casa();		
		c.porta1.aberta=false;
		c.porta1.estaAberta();
		c.porta2.aberta=true;
		c.porta2.estaAberta();
		c.porta3.aberta=true;
		c.porta3.estaAberta();
		c.porta4.aberta=false;
		c.porta4.estaAberta();
		System.out.println("Numero de portas abertas: "+c.quantasPortasEstaoAbertas());
		c.pinta("Azul");
		c.pinta("Azul");
		c.porta1.pinta("amarelo");		
		c.porta1.pinta("amarelo");
		c.porta2.pinta("verde");
		c.porta2.pinta("verde");
	}
}