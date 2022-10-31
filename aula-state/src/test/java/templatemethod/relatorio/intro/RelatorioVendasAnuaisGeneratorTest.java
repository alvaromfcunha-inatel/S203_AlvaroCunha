package templatemethod.relatorio.intro;

import org.junit.Test;

public class RelatorioVendasAnuaisGeneratorTest {
    @Test
    public void shouldGenerateRelatorioVendasAnuais() {
        RelatorioVendasAnuaisGenerator generator = new RelatorioVendasAnuaisGenerator();

        String pagina = generator.createPagina(2021);

        System.out.println(pagina);
    }
}
