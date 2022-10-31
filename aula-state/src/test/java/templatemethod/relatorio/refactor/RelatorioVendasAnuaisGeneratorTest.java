package templatemethod.relatorio.refactor;

import org.junit.Test;

public class RelatorioVendasAnuaisGeneratorTest {
    @Test
    public void shouldGenerateRelatorioVendasAnuais() {
        RelatorioVendasAnuaisGenerator generator = new RelatorioVendasAnuaisGenerator(2021);

        String pagina = generator.createPagina();

        System.out.println(pagina);
    }
}
