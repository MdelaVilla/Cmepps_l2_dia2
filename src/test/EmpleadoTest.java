package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pkg.Empleado;
import pkg.Empleado.TipoEmpleado;

class EmpleadoTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testCalculoNominaBrutaTEEncargado() {
		float expected=2600;
		float actual=Empleado.calculoNominaBruta(TipoEmpleado.Encargado, 1000, 0);
		assertEquals(actual, expected);
		//fail("Not yet implemented");
	}

	@Test
	void testCalculoNominaBrutaTEVendedor() {
		float expected=2600;
		float actual=Empleado.calculoNominaBruta(TipoEmpleado.Encargado, 1000, 0);
		assertEquals(actual, expected);
		//fail("Not yet implemented");
	}

	@Test
	void testCalculoNominaBrutaVentasMayor1000() {
		float expected=2600;
		float actual=Empleado.calculoNominaBruta(TipoEmpleado.Encargado, 1000, 0);
		assertEquals(actual, expected);
		//fail("Not yet implemented");
	}
	
	void testCalculoNominaBrutaVentasMayor1500() {
		float expected=2600;
		float actual=Empleado.calculoNominaBruta(TipoEmpleado.Encargado, 1000, 0);
		assertEquals(actual, expected);
		//fail("Not yet implemented");
	}

	void testCalculoNominaBrutaVentasMenor1000() {
		float expected=2600;
		float actual=Empleado.calculoNominaBruta(TipoEmpleado.Encargado, 1000, 0);
		assertEquals(actual, expected);
		//fail("Not yet implemented");
	}
	
	void testCalculoNominaBrutaVentasconHE() {
		float expected=2600;
		float actual=Empleado.calculoNominaBruta(TipoEmpleado.Encargado, 1000, 0);
		assertEquals(actual, expected);
		//fail("Not yet implemented");
	}
	
	void testCalculoNominaBrutaVentassinHE() {
		float expected=2600;
		float actual=Empleado.calculoNominaBruta(TipoEmpleado.Encargado, 1000, 0);
		assertEquals(actual, expected);
		//fail("Not yet implemented");
	}

	@Test
	void testCalculoNominaNetaTramo0() {
		float expected=2000;
		float actual=Empleado.calculoNominaNeta(2000);
		assertEquals(actual, expected);
		//fail("Not yet implemented");
	}
	
	@Test
	void testCalculoNominaNetaTramo15() {
		float expected=2200*0.85f;
		float actual=Empleado.calculoNominaNeta(2200);
		assertEquals(actual, expected);
		//fail("Not yet implemented");
	}

	void testCalculoNominaNetaTramo18() {
		float expected=2200*0.82f;
		float actual=Empleado.calculoNominaNeta(2600);
		assertEquals(actual, expected);
		//fail("Not yet implemented");
	}

}
