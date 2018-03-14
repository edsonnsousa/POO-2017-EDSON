package models;

import java.util.Date;

public class Noticia extends Autor {
	private Date data;
	private String corpo;
	private String titulo;
	private String resumo;
	private Autor jornalista;
	private Area area;
	
	Area<String> noticias = new ArrayList();
	noticias.add("Economia");
	noticias.add("Esporte");
	noticias.add("Moda");
	
		
	public boolean editar(Editor editor) {
		try{
		if (editor.getArea() == this.area){
			System.out.println("Autorizado");
		}
		catch (NullPointerException x ) {
			   System.out.println("Não autorizado" + x);
			}
		}
		
		
		return true;
	}
	public boolean cancelar(Editor editor) {
		return true;};
		
	public boolean deletar(Editor editor) {
		return true;}
	
	public boolean publicar(Editor editor) {
		return true;}
	public Area getArea() {
		return area;
	}



	public void setArea(Area area) {
		this.area = area;
	}


	public Noticia(String local, models.Date data, String corpo, String titulo,
			String resumo, Autor jornalista, Area area) {
		super(local);
		this.data = data;
		this.corpo = corpo;
		this.titulo = titulo;
		this.resumo = resumo;
		this.jornalista = jornalista;
		this.area = area;
	}


}