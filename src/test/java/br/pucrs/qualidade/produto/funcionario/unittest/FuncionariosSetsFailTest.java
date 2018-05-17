package br.pucrs.qualidade.produto.funcionario.unittest;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import br.pucrs.qualidade.produto.funcionario.Funcionario;

@RunWith(Parameterized.class)
public class FuncionariosSetsFailTest {	
	
	
	@Parameters(name= "{index} : setMatricula({0}),setCategoria({1}), setNumeroDependetes({2}), setSalario({3})")
	public static Collection<Object[]> data(){
		return Arrays.asList(new Object[][]{
			{9999,0,-1,0}, 	
			{100000,0,-1,0}, 	
			{9999,6,-1,0}, 	
			{100000,6,-1,0}, 	
		});		
	}
	
	@Parameter(0)
	public int matricula;
	
	@Parameter(1) 
	public int categoria;
	
	@Parameter(2)	
	public int dependente;
	
	@Parameter(3)	
	public double salario;
	
	private Funcionario fun;
	
	@Before
	public void setup() throws Exception {
		fun = new Funcionario(11111, "fulano", 1,0, 1);		
	}
	
	@Parameters()
	@Test(expected = IllegalArgumentException.class)
	public void setMatricula() throws Exception{	

		fun.setMatricula(matricula);
	}
	
	@Test(expected = IllegalArgumentException.class)	
	public void setCategoria() {
		fun.setCategoria(categoria);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void setNumeroDependentes() throws Exception{	

		fun.setNumeroDependentes(dependente);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void setSalario() throws Exception{	

		fun.setSalarioBase(salario);
	}
}