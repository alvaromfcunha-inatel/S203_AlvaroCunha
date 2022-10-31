package templatemethod.relatorio.refactor;

import templatemethod.relatorio.intro.RelatorioService;

import java.util.List;

public class RelatorioVendasAnuaisGenerator extends RelatorioGeneratorTemplate {
    private Integer ano;

    public RelatorioVendasAnuaisGenerator(Integer ano) {
        this.ano = ano;
    }

    @Override
    public List<String> getConteudo() {
        return RelatorioService.getInstance().getVendasAnual(this.ano);
    }
}
