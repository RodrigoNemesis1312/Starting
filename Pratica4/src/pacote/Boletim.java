package pacote;

public class Boletim {

	private Aluno aluno;
	private Disciplina disciplina;
	private double nota1;
	private double nota2;
	private double nota3;
	private double nota4;
	private double faltas;
	public static double mediaFinal;
	public static double calcFaltas;
	public static String conceito;
	
	public double getFaltas() {
		return faltas;
	}

	public void setFaltas(double faltas) {
		this.faltas = faltas;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double getNota3() {
		return nota3;
	}

	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}

	public double getNota4() {
		return nota4;
	}

	public void setNota4(double nota4) {
		this.nota4 = nota4;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	public Boletim (Aluno aluno, Disciplina disciplina) {
		this.aluno = aluno;
		this.disciplina = disciplina;
	}
	
	public double verificarMedia() {
		 
		mediaFinal = (nota1 + nota2 + nota3 + nota4)/4;
		
			/*if (mediaFinal >= 7) {
			
				System.out.println ("O Aluno esta APROVADO! Media: " + mediaFinal); 
			
			}if (mediaFinal < 7 && mediaFinal >= 4) {
			
				System.out.println ("O Aluno esta em RECUPERACAO! Media: " + mediaFinal);
					
			}if (mediaFinal < 4) {
			
				System.out.println ("O Aluno esta REPROVADO! Media: " + mediaFinal);
			
			}*/
			return mediaFinal;
	}
	
	public String conceito () {
		
		if (mediaFinal >= 9) {
			
			conceito = "A";
			
		}if (mediaFinal < 9 && mediaFinal >= 7) {
			
			conceito = "B";
			
		}if (mediaFinal < 7 && mediaFinal >= 4) {
			
			conceito = "C";
			
		}if (mediaFinal < 4) {
			
			conceito = "D";
			
		}
		//System.out.println ("O conceito do aluno e "+ conceito);
		return conceito;
	}
	
	public double verificarFaltas () {
		
		calcFaltas = faltas / disciplina.getCargaHoraria();
		
			/*if (calcFaltas > 0.25) {
				
				System.out.println ("O Aluno esta REPROVADO por FALTAS! Porcentagem de Faltas: " + calcFaltas);
			
			}else {
				
				System.out.println ("O Aluno cumpre os requisitos de presenca! Porcentagem de Faltas: " + calcFaltas);
				
			}*/
			
		return calcFaltas;
	}

	
}
