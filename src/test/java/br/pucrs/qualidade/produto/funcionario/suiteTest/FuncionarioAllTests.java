package br.pucrs.qualidade.produto.funcionario.suiteTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.pucrs.qualidade.produto.funcionario.unittest.FuncionariosCalcSalLiqTest;
import br.pucrs.qualidade.produto.funcionario.unittest.FuncionariosConstructorTest;
import br.pucrs.qualidade.produto.funcionario.unittest.FuncionariosSetsPassTest;

@RunWith(Suite.class)
@SuiteClasses({
	FuncionariosSetsPassTest.class,
	FuncionariosConstructorTest.class,
	FuncionariosCalcSalLiqTest.class	
})
public class FuncionarioAllTests {

}
