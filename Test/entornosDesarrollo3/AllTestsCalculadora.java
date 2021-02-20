package entornosDesarrollo3;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
	TestProducto.class,
	TestCociente.class,
	TestResta.class,
	TestSuma.class
})
public class AllTestsCalculadora {

}
