
import java.util.concurrent.ThreadLocalRandom;
public class ProcessoSeletivo {	
private double salarioPretendido;
	private final double salarioBase = 2000.00;
	private int selecionadoFinal;
	public void candidato() {
		Atendimento horario =  new  Atendimento();
		String[]  nome={"Rafael","Marta","Luiza","Henrique","Tiago","Lucas","Mateus","Ricardo","Weverton","Maria Júlia","Geovana","Denise","Cinthya","Brenda"};
		int candidatoSelecionado = 0;
		int candidatoAtual = 0;
		while(candidatoSelecionado < 14) {
			salarioPretendido = valorPretendido();
			System.out.printf("%s, %s.", horario.horario(),nome[candidatoAtual]);
			analisarCandidato();
			candidatoAtual++;
			System.out.println("Foram selecionados"+ selecionadoFinal);
		}
		
	}

private void analisarCandidato() {
	
	
	 if(salarioPretendido < salarioBase) {
		 System.out.println("Voce foi selecionado!");
		 selecionadoFinal++;
	 }
	 	
	 	
	else if (salarioPretendido == salarioBase) System.out.printf("não temos como pagar %.2f\nMas conseguimos pagar o valor de %.2f o que acha ?\n", salarioPretendido, salarioBase);
	else 
		System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");
	
		System.out.printf("Salario Requisitado: %.2f \n",salarioPretendido);	
	
	
	
	
}
static double valorPretendido() {
    return ThreadLocalRandom.current().nextDouble(1800, 2200);
	
	
	
}


}