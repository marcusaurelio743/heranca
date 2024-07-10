package atv1.Aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import atv1.Entities.Funcionario;
import atv1.Entities.FuncionarioTercerizado;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Funcionario> funcionarios = new ArrayList<Funcionario>();
		
		System.out.println("informe o numero de funcionarios ");
		int n = sc.nextInt();
		
		for(int i=0; i < n; i++) {
			
			System.out.println("Funcionario "+(i+1)+" dados");
			System.out.println("funcionario é tecerizado s/n ?");
			String resp = sc.next();
			System.out.println("Nome:");
			String nome = sc.next();
			System.out.println("Horas:");
			Integer horas = sc.nextInt();
			System.out.println("Valor Hora:");
			Double valorHora = sc.nextDouble();
			
			if(resp.equalsIgnoreCase("s") || resp.equalsIgnoreCase("S")) {
				System.out.println("Valor da hora adiconal");
				Double valorHoraAdicional = sc.nextDouble();
				Funcionario func1 = new FuncionarioTercerizado(nome, horas, valorHora, valorHoraAdicional);
				funcionarios.add(func1);
			}else {
				Funcionario func2 = new Funcionario(nome, horas, valorHora);
				funcionarios.add(func2);
			}
			
		}
		
		System.out.println("-------------------Pagamentos----------------");
		
		for (Funcionario funcionario : funcionarios) {
			System.out.println(funcionario.getName()+" - $ "+funcionario.pagamento());
		}
		
		sc.close();
	}

}
