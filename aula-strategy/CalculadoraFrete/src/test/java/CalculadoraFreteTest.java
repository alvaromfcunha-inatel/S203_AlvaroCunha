import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculadoraFreteTest {

    CalculadoraFrete calc;

    @Before
    public void before() {
        calc = new CalculadoraFrete();
    }

    @Test
    public void deveCalcularFreteParaSedex() {
        Fretavel sedex = new FreteSedex();
        Double valor = calc.calcula(sedex, 100);
        Double esperado = 90.00;
        assertEquals(valor, esperado);
    }

    @Test
    public void deveCalcularFreteParaDHL() {
        Fretavel dhl = new FreteDHL();
        Double valor = calc.calcula(dhl, 100);
        Double esperado = 90.00;
        assertEquals(valor, esperado);
    }

    @Test
    public void deveCalcularFreteParaJadLog() {
        Fretavel jadlog = new FreteJadLog();
        Double valor = calc.calcula(jadlog, 100);
        Double esperado = 150.00;
        assertEquals(valor, esperado);
    }

    //    @Test(expected = RuntimeException.class)
    //    public void deveLancarExceptionParaServicoDesconhecido() {
    //        calc.calcularFrete("desconhecido", 100);
    //    }
}
