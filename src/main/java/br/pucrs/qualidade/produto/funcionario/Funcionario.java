package br.pucrs.qualidade.produto.funcionario;

public class Funcionario {
	
	private int matricula;
	private String nome;
	private int categoria;
	private int numeroDependentes;
	private double salarioBase;
	
	public Funcionario(int matricula, String nome, int categoria, int numeroDependentes, double salarioBase) {
		this.matricula = matricula;
		this.nome = nome;
		this.categoria = categoria;
		this.numeroDependentes = numeroDependentes;
		this.salarioBase = salarioBase;
	}

	public int getNumeroDependentes() {
		return numeroDependentes;
	}

	public void setNumeroDependentes(int numeroDependentes) {
	
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
	
	}

	public int getMatricula() {
		return matricula;
	}

	public String getNome() {
		return nome;
	}

	public int getCategoria() {
		return categoria;
	}
	
	
	

	public double calculaDescontos() {
		
		
		
		
		return 0;
       
	}
	
	public double calculaAdicionais() {
		
		double resultado = 0;
		
		if(categoria == 3) {
			resultado = salarioBase + (salarioBase * 0.2);		
		}else if(categoria == 4) {
			resultado = salarioBase + (salarioBase * 0.05);				
		}else if(categoria == 5) {
						
		}
		
		return resultado;	 
	}
	
	public double calculaSalarioLiquido() {
		double resultado = 0;
		
		resultado = calculaAdicionais() - calculaDescontos();
		
	  
		return resultado;
	}
}
