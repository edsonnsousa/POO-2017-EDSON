package models;

public class EditorChefe extends Editor {
	
	public EditorChefe(String nome, String email, String senha, String Area) {
		super(nome, email, senha, Area);
	}
	public boolean destaque() {
		return true;
		
	}
	public boolean principal() {
		return true;
		
	}
}
