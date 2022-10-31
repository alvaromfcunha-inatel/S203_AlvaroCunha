package templatemethod.relatorio.refactor;

import org.junit.Test;

public class RelatorioVendasMensaisGeneratorTest {
    @Test
    public void shouldGenerateRelatorioVendasMensais() {
        RelatorioVendasMensaisGenerator generator = new RelatorioVendasMensaisGenerator(2021, 6);

        String pagina = generator.createPagina();

        System.out.println(pagina);
    }
}
