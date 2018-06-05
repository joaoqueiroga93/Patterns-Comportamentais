package Exercicio8;

/**
 * 
 * @author João Victor Bonfim Rocha - RA:816118224 - Turma:SIN3AN-MCA
 * 			
 *
 */

public class Teste {
	public static void main(String[] args) {
		
	NoticiarioAssina noticiario = new NoticiarioAssina();
	new Consumidor("Pedro Gallon", noticiario);
	noticiario.notificaNoticia("Uma nova noticia", 1, 2, "Tópicos interessantes!");
	new Consumidor("Jão", noticiario);
	noticiario.notificaNoticia("Uma noticia mais nova ainda", 2, 2, "Tópico ruim");
	
	
	}
}
