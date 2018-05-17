package br.pucrs.qualidade.produto.funcionario.unittest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;

import br.pucrs.qualidade.produto.funcionario.Funcionario;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class FuncionariosCalcSalLiqPassTest {

	@Test
	@FileParameters("src/test/java/br/pucrs/qualidade/produto/funcionario/resources/baseTestesFuncionariosCalcSalLiqPass.csv") 
	public void calculaAdicionaisTest(int  matricula, String nome,int categoria, int numeroDependentes, double salarioBase,
			double salExpected,	double adicExpected, double descExpected ) throws Exception{			
		
		Funcionario fun = new Funcionario(matricula, nome, categoria, numeroDependentes, salarioBase);
		double actual = fun.calculaAdicionais();	
		assertEquals(adicExpected, actual,001);
	}

	
	
	@Test
	@FileParameters("src/test/java/br/pucrs/qualidade/produto/funcionario/resources/baseTestesFuncionariosCalcSalLiqPass.csv") 
	public void calculaDescontosTest(int  matricula, String nome,int categoria, int numeroDependentes, double salarioBase,
			double salExpected,	double adicExpected, double descExpected ) throws Exception{			
		
		Funcionario fun = new Funcionario(matricula, nome, categoria, numeroDependentes, salarioBase);
		double actual = fun.calculaDescontos();		
		assertEquals(descExpected, actual,001);
	}
	
	
	
	
	@Test
	@FileParameters("src/test/java/br/pucrs/qualidade/produto/funcionario/resources/baseTestesFuncionariosCalcSalLiqPass.csv") 
	public void calculaSalarioLiquidoTest(int  matricula, String nome,int categoria, int numeroDependentes, double salarioBase,
			double salExpected,	double adicExpected, double descExpected ) throws Exception{			
		
		Funcionario fun = new Funcionario(matricula, nome, categoria, numeroDependentes, salarioBase);
		double actual = fun.calculaSalarioLiquido();
		assertEquals(salExpected, actual,001);
	}	
}
