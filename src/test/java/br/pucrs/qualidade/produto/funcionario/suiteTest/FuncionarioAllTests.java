package br.pucrs.qualidade.produto.funcionario.suiteTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.pucrs.qualidade.produto.funcionario.unittest.*;

@RunWith(Suite.class)
@SuiteClasses({
	FuncionariosSetsPassTest.class,
	FuncionariosSetsFailTest.class,	
	
	FuncionariosConstructorPassTest.class,
	FuncionariosConstructorFailTest.class,	
	
	FuncionariosCalcSalLiqPassTest.class
	
})
public class FuncionarioAllTests {
	
}
