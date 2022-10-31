package templatemethod.relatorio.refactor;

import templatemethod.relatorio.intro.RelatorioService;

import java.util.List;

public class RelatorioVendasMensaisGenerator extends RelatorioGeneratorTemplate {
    private Integer ano;
    private Integer mes;

    public RelatorioVendasMensaisGenerator(Integer ano, Integer mes) {
        this.ano = ano;
        this.mes = mes;
    }

    @Override
    public List<String> getConteudo() {
        return RelatorioService.getInstance().getVendasMensal(this.ano, this.mes);
    }
}
