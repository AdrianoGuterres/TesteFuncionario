package br.pucrs.qualidade.produto.funcionario.unittest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;

import br.pucrs.qualidade.produto.funcionario.Funcionario;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;


@RunWith(JUnitParamsRunner.class)
public class FuncionariosConstructorFailTest {

	@Test(expected = IllegalArgumentException.class)
	@FileParameters("src/test/java/br/pucrs/qualidade/produto/funcionario/resources/baseTestesFuncionariosConFail.csv") 
	public void constructorTest(int  matriculaActual, String nomeActual, int categoriaActual, int no_dependentesActual, double salarioBaseActual) throws Exception{	
		
		Funcionario fun = new Funcionario(matriculaActual, nomeActual, categoriaActual, no_dependentesActual, salarioBaseActual);			
	}
	
	
}
