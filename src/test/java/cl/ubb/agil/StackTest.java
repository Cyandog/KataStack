package cl.ubb.agil;

import org.junit.Test;
import cl.ubb.agil.Stack; 
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class StackTest {
	
	private Stack pila;
	
	@Test
	public void ConvertirNumeroUno(){
		pila = new Stack();
		
		int resultado = pila.crearPila();
		
		assertThat(resultado,is(0));
	
	}
	

}
