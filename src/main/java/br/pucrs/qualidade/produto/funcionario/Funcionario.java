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

	public void setNumeroDependentes(int numeroDependentes) throws Exception {
		if(numeroDependentes >= 0) {
			this.numeroDependentes = numeroDependentes;			
		}else {
			throw new IllegalArgumentException();
		}	
	}	

	public void setMatricula(int matricula) throws Exception{
		if(matricula > 0 || matricula <= 99999) {
			this.matricula = matricula;			
		}else {
			throw new IllegalArgumentException();
		}			
	}

	public void setCategoria(int categoria) throws Exception{
		if(categoria > 0 || matricula <= 5) {
			this.categoria = categoria;			
		}else {
			throw new IllegalArgumentException();
		}	
	}

	public void setSalarioBase(double salarioBase) throws Exception{
		if(salarioBase > 0 || salarioBase <= 5000) {
			this.salarioBase = salarioBase;			
		}else {
			throw new IllegalArgumentException();
		}	
	}	
	

	public double calculaDescontos() {
		
		double inss = 0.1;
		double irpf = 0;
		
		if(getSalarioBase()  > 10000) {
			irpf = 0.27;			
		}else if(getSalarioBase() < 10000 && getSalarioBase() > 25000) {
			irpf = 0.27; 
		}
		
		return (salarioBase*inss) - (salarioBase*irpf);
       
	}
	
	
	public double calculaAdicionais() {
		
		double resultado = 0;
		
		if(getCategoria() == 3) {
			resultado = (getSalarioBase() * 0.2);		
		}else if(getCategoria() == 4) {
			resultado = (getSalarioBase() * (0.05*getNumeroDependentes()));				
		}else if(getCategoria() == 5) {
			resultado = (getSalarioBase() * ((0.05*getNumeroDependentes())+0.2));									
		}
		
		return resultado;	 
	}
	
	public double calculaSalarioLiquido() {
		double resultado = calculaAdicionais() - calculaDescontos();	  
		return resultado;
	}
}
