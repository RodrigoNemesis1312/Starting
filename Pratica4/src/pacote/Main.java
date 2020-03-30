package pacote;

public class Main {

	public static void main (String[] args) {
		
		Aluno a = new Aluno("Alvaro Alves", "000.111.222-33");
		Disciplina mat = new Disciplina ("Matematica", 160);
		Disciplina geo = new Disciplina ("Geografia", 120);
		
		Boletim bolMat = new Boletim (a, mat);
		Boletim bolGeo = new Boletim (a, geo);
		
		bolMat.setNota1(7.5);
		bolMat.setNota2(5);
		bolMat.setNota3(6.2);
		bolMat.setNota4(8);
		bolMat.setFaltas(80);
		
		bolGeo.setNota1(9);
		bolGeo.setNota2(9.5);
		bolGeo.setNota3(7);
		bolGeo.setNota4(8);
		bolGeo.setFaltas(15);
		
		bolMat.verificarMedia();
		
			if (Boletim.mediaFinal >= 7) {
			
				System.out.println ("O Aluno esta APROVADO! Media: " + Boletim.mediaFinal); 
		
				}if (Boletim.mediaFinal < 7 && Boletim.mediaFinal >= 4) {
		
					System.out.println ("O Aluno esta em RECUPERACAO! Media: " + Boletim.mediaFinal);
				
				}if (Boletim.mediaFinal < 4) {
		
					System.out.println ("O Aluno esta REPROVADO! Media: " + Boletim.mediaFinal);
		
				}
		
		bolMat.conceito();
		
			System.out.println ("O conceito do aluno e "+ Boletim.conceito);
		
		bolMat.verificarFaltas();
		
			if (Boletim.calcFaltas > 0.25) {
			
				System.out.println ("O Aluno esta REPROVADO por FALTAS! Porcentagem de Faltas: " + Boletim.calcFaltas);
	
			}else {
		
				System.out.println ("O Aluno cumpre os requisitos de presenca! Porcentagem de Faltas: " + Boletim.calcFaltas);
		
	}
		
		bolGeo.verificarMedia();
		
		if (Boletim.mediaFinal >= 7) {
		
			System.out.println ("O Aluno esta APROVADO! Media: " + Boletim.mediaFinal); 
	
			}if (Boletim.mediaFinal < 7 && Boletim.mediaFinal >= 4) {
	
				System.out.println ("O Aluno esta em RECUPERACAO! Media: " + Boletim.mediaFinal);
			
			}if (Boletim.mediaFinal < 4) {
	
				System.out.println ("O Aluno esta REPROVADO! Media: " + Boletim.mediaFinal);
	
			}
		
		bolGeo.conceito();
		
			System.out.println ("O conceito do aluno e "+ Boletim.conceito);
		
		bolGeo.verificarFaltas();
		
			if (Boletim.calcFaltas > 0.25) {
			
				System.out.println ("O Aluno esta REPROVADO por FALTAS! Porcentagem de Faltas: " + Boletim.calcFaltas);
		
			}else {
			
				System.out.println ("O Aluno cumpre os requisitos de presenca! Porcentagem de Faltas: " + Boletim.calcFaltas);
			
		}
		
	}
	 
	
	
	
}
