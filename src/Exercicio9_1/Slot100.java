package Exercicio9_1;

/**
 * 
 * @author João Victor Bonfim Rocha - RA:816118224 - Turma:SIN3AN-MCA
 * 			
 *
 */

public class Slot100 implements Slot {
	private Slot slot;

	public Slot100() {
	}

	@Override
	public double recebeMoeda(int m) {
		if (m == 100) {
			System.out.println("-- Recebeu R$1,00");
			return 1;
		}else {
			return 0;
		}

	}

	@Override
	public void setSlot(Slot s) {
		this.slot = s;
	}

}