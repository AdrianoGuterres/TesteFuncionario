package br.pucrs.qualidade.produto.funcionario.unittest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;

import br.pucrs.qualidade.produto.funcionario.Funcionario;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;


@RunWith(JUnitParamsRunner.class)
public class FuncionarioConstructorTest {

	@Test(expected = Exception.class)
	@FileParameters("src/test/java/br/pucrs/qualidade/produto/funcionario/resources/baseTestesFuncionariosFail.csv") 
	public void somaTestListaArquivo(int  matricula, String nome, int categoria, int numeroDependentes, double salarioBase) throws Exception{	
		
		Funcionario fun = new Funcionario(matricula, nome, categoria, numeroDependentes, salarioBase);		
		
		
		
	}
	
	
}
