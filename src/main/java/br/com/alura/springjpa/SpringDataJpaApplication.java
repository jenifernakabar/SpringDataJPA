package br.com.alura.springjpa;
import java.util.Scanner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import br.com.alura.springjpa.service.CrudCargoService;
import br.com.alura.springjpa.service.CrudFuncionarioService;
import br.com.alura.springjpa.service.CrudUnidadeTrabalhoService;
import br.com.alura.springjpa.service.RelatorioFuncionarioDinamico;
import br.com.alura.springjpa.service.RelatoriosService;

@EnableJpaRepositories
@SpringBootApplication
public class SpringDataJpaApplication implements CommandLineRunner {

	private Boolean system = true;

	private final CrudCargoService cargoService;
	
	private final RelatoriosService relatoriosService;

	private final CrudFuncionarioService funcionarioService;

	private final CrudUnidadeTrabalhoService unidadeTrabalhoService;
	
	private final RelatorioFuncionarioDinamico relatorioFuncionarioDinamico;
	

	public SpringDataJpaApplication(CrudCargoService cargoService, 
			RelatoriosService relatoriosService,
			CrudFuncionarioService funcionarioService, 
			CrudUnidadeTrabalhoService unidadeTrabalhoService,  
			RelatorioFuncionarioDinamico relatorioFuncionarioDinamico ) {
		
		this.cargoService = cargoService;
		this.relatoriosService = relatoriosService;
		this.funcionarioService = funcionarioService;
		this.unidadeTrabalhoService = unidadeTrabalhoService;
		this.relatorioFuncionarioDinamico = relatorioFuncionarioDinamico;
	
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Scanner scanner = new Scanner(System.in);

		while (system) {
			System.out.println("Qual função deseja executar?");
			System.out.println("0 - Sair");
			System.out.println("1 - Cargo");
			System.out.println("2 - Funcionario");
			System.out.println("3 - Unidade");
			System.out.println("4 - Relatorios");
			System.out.println("5 - Relatorio dinamico");

			Integer function = scanner.nextInt();

			switch (function) {
				case 1:
					cargoService.inicial(scanner);
					break;
				case 2:
					funcionarioService.inicial(scanner);
					break;
				case 3:
					unidadeTrabalhoService.inicial(scanner);
					break;
				case 4:
					relatoriosService.inicial(scanner);
					break;
				case 5:
					relatorioFuncionarioDinamico.inicial(scanner);
					break;
				default:
					System.out.println("Finalizando");
					system = false;
					break;
			}
		}
	}
}