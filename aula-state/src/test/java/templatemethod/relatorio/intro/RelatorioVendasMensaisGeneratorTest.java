package templatemethod.relatorio.intro;

import org.junit.Test;

public class RelatorioVendasMensaisGeneratorTest {
    @Test
    public void shouldGenerateRelatorioVendasMensais() {
        RelatorioVendasMensaisGenerator generator = new RelatorioVendasMensaisGenerator();

        String pagina = generator.createPagina(2021, 6);

        System.out.println(pagina);
    }
}
