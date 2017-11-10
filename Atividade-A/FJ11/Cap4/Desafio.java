package AtividadeC;

import javax.swing.JOptionPane;

public class Desafio {

	public static void main(String[] args) {
		
		Fibonacci num = new Fibonacci();
		int valor =Integer.parseInt(JOptionPane.showInputDialog("Posicao"));
		JOptionPane.showMessageDialog(null,(num.calcular(valor)));
		JOptionPane.showMessageDialog(null,(num.Ternario(valor)));
		
		

	}

}
