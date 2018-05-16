package br.pucrs.qualidade.produto.funcionario.unittest;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import br.pucrs.qualidade.produto.funcionario.Funcionario;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class FuncionariosSetsPassTest {

	private Funcionario fun;
	
	@Before
	public void setup() throws Exception{
		fun = new Funcionario(11111, "João", 1, 0, 1);
	}


	@Test
	@FileParameters("src/test/java/br/pucrs/qualidade/produto/funcionario/resources/baseTestesFuncionariosSetsPass.csv") 
	public void setMatricula(int  matricula, int categoria, int numeroDependentes, double salarioBase, int matriculaExpected, int categoriaExpected, int nroExpected, double salarioExpected ) throws Exception{	

		fun.setMatricula(matricula);
		
		int actual = fun.getMatricula();
		
		System.out.println(matriculaExpected + "   "+ actual);
		
		assertEquals(matriculaExpected, actual);


	}
	
	@Test
	@FileParameters("src/test/java/br/pucrs/qualidade/produto/funcionario/resources/baseTestesFuncionariosSetsPass.csv") 
	public void setCategoria(int  matricula, int categoria, int numeroDependentes, double salarioBase, int matriculaExpected, int categoriaExpected, int nroExpected, double salarioExpected ) throws Exception{	

		fun.setCategoria(categoriaExpected);
		
		int actual = fun.getCategoria();
		
		System.out.println(categoriaExpected + "   "+ actual);
		
		assertEquals(categoriaExpected, actual);


	}
	
	@Test
	@FileParameters("src/test/java/br/pucrs/qualidade/produto/funcionario/resources/baseTestesFuncionariosSetsPass.csv") 
	public void setNumeroDependentes(int  matricula, int categoria, int numeroDependentes, double salarioBase, int matriculaExpected, int categoriaExpected, int nroExpected, double salarioExpected ) throws Exception{	

		fun.setNumeroDependentes(numeroDependentes);
		
		int actual = fun.getNumeroDependentes();
		
		System.out.println(nroExpected + "   "+ actual);
		
		assertEquals(nroExpected, actual);


	}
	
	@Test
	@FileParameters("src/test/java/br/pucrs/qualidade/produto/funcionario/resources/baseTestesFuncionariosSetsPass.csv") 
	public void setSalario(int  matricula, int categoria, int numeroDependentes, double salarioBase, int matriculaExpected, int categoriaExpected, int nroExpected, double salarioExpected ) throws Exception{	

		fun.setSalarioBase(salarioBase);
				
		double actual = fun.getSalarioBase();
		
		System.out.println(salarioExpected + "   "+ actual);
		
		assertEquals(salarioExpected, actual,0001);


	}

}
