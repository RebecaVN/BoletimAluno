
public class Boletim {
	
	public static void main (String [] args) {
		
		String nomeDoAluno1 = "José Da Silva";
		String nomeDoAluno2 = "Manoel Albano";
		String nomeDoAluno3 = "Cristiano Nogueira";
		
			
		int notaMatematica1 = 75;
		int notaMatematica2 = 35;
		int notaMatematica3 = 20;
		
		int notaPortugues1 = 95;
		int notaPortugues2 = 45;
		int notaPortugues3 = 35;
		
		int notaGeografia1 = 85;
		int notaGeografia2 = 45;
		int notaGeografia3 = 10;
		
		int notaHistoria1 = 65;
		int notaHistoria2 = 65;
		int notaHistoria3 = 40;
		
		double mediaA1 = (notaMatematica1 + notaPortugues1 + notaGeografia1 + notaHistoria1)/4;
		double mediaA2 = (notaMatematica2 + notaPortugues2 + notaGeografia2 + notaHistoria2)/4;
		double mediaA3 = (notaMatematica3 + notaPortugues3 + notaGeografia3 + notaHistoria3)/4;
	
		
				System.out.println("				BOLETIM ");
				System.out.println(" ");
				
				
			if(mediaA1 <50) {
				
				if(mediaA1 >30) {
					System.out.println("Nome: " + nomeDoAluno1 + " Média: " + mediaA1 + " Conselho: Exame");
				}else{
					System.out.println("Nome: " + nomeDoAluno1 + " Média: " + mediaA1 + " Conselho: Reprovado");
				}
			}else{
				System.out.println("Nome: " + nomeDoAluno1 + " Média: " + mediaA1 + " Conselho: Aprovado");
			}
				
			
						System.out.println(" ");
			
				
			if(mediaA2 <50){
				
				if(mediaA2 >30) {
					System.out.println("Nome: " + nomeDoAluno2 + " Média: " + mediaA2 + " Conselho: Exame");
				}else {
					System.out.println("Nome: " + nomeDoAluno2 + " Média: " + mediaA2 + " Conselho: Reprovado");
				}
				
			}else{
				System.out.println("Nome: " + nomeDoAluno2 + " Média: " + mediaA2 + " Conselho: Aprovado");
			}
			
			
			
					System.out.println(" ");
			
			if(mediaA3 <50){
				
				if(mediaA3 >=30) {
					System.out.println("Nome: " + nomeDoAluno3 + " Média: " + mediaA3 + "Conselho: Exame");
				}else{
					System.out.println("Nome: " + nomeDoAluno3 + " Média: " + mediaA3 + " Conselho: Reprovado");
				}
						
			}else{
				System.out.println("Nome: " + nomeDoAluno3 + " Média: " + mediaA3 + " Conselho: Aprovado");
			
			} 
	
		
	}
	
}
	
