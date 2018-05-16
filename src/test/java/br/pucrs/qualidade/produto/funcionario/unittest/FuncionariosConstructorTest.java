package br.pucrs.qualidade.produto.funcionario.unittest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;

import br.pucrs.qualidade.produto.funcionario.Funcionario;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;


@RunWith(JUnitParamsRunner.class)
public class FuncionariosConstructorTest {

	@Test
	@FileParameters("src\\test\\java\\br\\pucrs\\qualidade\\produto\\funcionario\\resources\\baseTestesFuncionariosConPass.csv") 
	public void constructorTest(int  matriculaActual, String nomeActual, int categoriaActual, int no_dependentesActual, double salarioBaseActual) throws Exception{	
		
		Funcionario fun = new Funcionario(matriculaActual, nomeActual, categoriaActual, no_dependentesActual, salarioBaseActual);		
		
		int matriculaExpected = fun.getMatricula();
		String nomeExpected = fun.getNome();
		int categoriaExpected = fun.getCategoria();
		int nro_dependetesExpected = fun.getNumeroDependentes();
		double salarioExpeted = fun.getSalarioBase();
	
		
		assertEquals(matriculaActual, matriculaExpected);
		assertEquals(nomeExpected, nomeActual);
		assertEquals(categoriaExpected, categoriaActual);
		assertEquals(nro_dependetesExpected, no_dependentesActual);
		assertEquals(salarioExpeted, salarioBaseActual,001);
	}
	
	
}
