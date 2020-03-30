package pacote;

public class Disciplina {
	
	private String nomeDisciplina;
	private double cargaHoraria;
	public static double mediaFinal;
	public static double calcFaltas;
			
	public double getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(double cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	public String getNomeDisciplina() {
		return nomeDisciplina;
	}
	public void setNomeDisciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
	}
	public static void setMediaFinal(double mediaFinal) {
		Disciplina.mediaFinal = Boletim.mediaFinal;
	}
	public static void setFaltas(double faltas) {
		Disciplina.calcFaltas = Boletim.calcFaltas;
	}
	
	public Disciplina (String nomeDisciplina, double cargaHoraria) {
		
		this.nomeDisciplina = nomeDisciplina;
		this.cargaHoraria = cargaHoraria;
		
	}

}
