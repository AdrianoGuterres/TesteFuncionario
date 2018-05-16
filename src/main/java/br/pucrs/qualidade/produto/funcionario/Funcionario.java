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
		if(numeroDependentes >= 0) {
			this.numeroDependentes = numeroDependentes;			
		}else {
			throw new IllegalArgumentException();
		}	
	}	

	public void setMatricula(int matricula) throws IllegalArgumentException{
		if(matricula >= 10000 && getMatricula() <= 99999) {
			this.matricula = matricula;			
		}else {
			throw new IllegalArgumentException();
		}			
	}

	public void setCategoria(int categoria) throws IllegalArgumentException{
		if(categoria > 0 && categoria < 6) {
			this.categoria = categoria;			
		}else {
			throw new IllegalArgumentException();
		}	
	}

	
	
	
	public void setSalarioBase(double salarioBase) throws IllegalArgumentException{
		if(salarioBase > 0 ) {
			this.salarioBase = salarioBase;			
		}else {
			throw new IllegalArgumentException();
		}	
	}	


	public double calculaDescontos() {


		double desconto = 0;

		if(getSalarioBase()<2500) {
			desconto = 0.1;
		}else if(getSalarioBase()>= 2500 && getSalarioBase()<=10000) {
			desconto = 0.2;
		}else if(getSalarioBase() > 10000) {
			desconto = 0.37;
		}

		System.out.println(desconto*getSalarioBase());

		return desconto*getSalarioBase();

	}


	public double calculaAdicionais() {

		double resultado = 0;

		switch (getCategoria()) {		
		case 3:
			resultado = getSalarioBase()*0.2;
			break;
		case 4:
			resultado = (getNumeroDependentes()*0.05) +getSalarioBase();
			break;
		case 5:
			resultado = (getNumeroDependentes()*0.05 + getSalarioBase() * 0.2) +getSalarioBase();
			break;

		default:
			resultado = 0;
			break;
		}




		return resultado;	 
	}

	public double calculaSalarioLiquido() {
		double resultado = calculaAdicionais() - calculaDescontos();	  
		return resultado;
	}
}
