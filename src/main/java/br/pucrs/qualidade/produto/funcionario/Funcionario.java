package br.pucrs.qualidade.produto.funcionario;

public class Funcionario {

	private int matricula;
	private String nome;
	private int categoria;
	private int numeroDependentes;
	private double salarioBase;

	public Funcionario(int matricula, String nome, int categoria, int numeroDependentes, double salarioBase) throws Exception {		
		setMatricula(matricula);
		setNome(nome);
		setCategoria(categoria);
		setNumeroDependentes(numeroDependentes);
		setSalarioBase(salarioBase);			
	}	

	public double getSalarioBase() {
		return salarioBase;
	}	

	public int getNumeroDependentes() {
		return numeroDependentes;
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

	public void setNome(String nome) {
		this.nome = nome;
	}
	

	public void setNumeroDependentes(int numeroDependentes) throws IllegalArgumentException{
		if(numeroDependentes < 0) {
			throw new IllegalArgumentException();		
		}else {
			this.numeroDependentes = numeroDependentes;				
		}	
	}	

	public void setMatricula(int matricula) throws IllegalArgumentException{
		if(matricula > 99999) {
			throw new IllegalArgumentException();		
		}else if(matricula<10000) {
			throw new IllegalArgumentException();
		}else {
			this.matricula = matricula;
		}			
	}

	public void setCategoria(int categoria) throws IllegalArgumentException{
		if(categoria > 5) {
			throw new IllegalArgumentException();		
		}else if(categoria <1) {
			throw new IllegalArgumentException();
		}else {
			this.categoria = categoria;
		}	
	}

	
	public void setSalarioBase(double salarioBase) throws IllegalArgumentException{
		if(salarioBase < 1 ) {
			throw new IllegalArgumentException();					
		}else {
			this.salarioBase = salarioBase;	
		}	
	}	


	public double calculaDescontos() {


		double desconto = 0;
		
		
		if(getSalarioBase() > 10000) {
			desconto = 0.37;
		} else if(getSalarioBase() >= 2500) {
			desconto = 0.2;
		} else {
			desconto = 0.1;
		}
				
		return desconto*getSalarioBase();

	}


	public double calculaAdicionais() {

		double resultado = 0;

		switch (getCategoria()) {		
		case 3:
			resultado = getSalarioBase()*0.2;
			break;
		case 4:
			resultado = (getNumeroDependentes()*0.05) * getSalarioBase();
			break;
		case 5:
			resultado = (getNumeroDependentes()*0.05) + (getSalarioBase() * 0.2);
			break;

		default:
			resultado = 0;
			break;
		}


		return resultado;	 
	}

	public double calculaSalarioLiquido() {
		double resultado = (getSalarioBase() +calculaAdicionais()) - calculaDescontos();	  
		return resultado;
	}
}
