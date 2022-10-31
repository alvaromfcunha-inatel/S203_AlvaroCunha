package templatemethod.relatorio.intro;

import java.util.List;

public class RelatorioVendasAnuaisGenerator {
    private String getCabecalho() {
        return "Empresa My" + "\n"
                + "----------";
    }

    private String getRodape() {
        return "----------" + '\n'
                + "* Propriedade particular - Uso confidencial";
    }

    public List<String> getConteudo(Integer ano) {
        return RelatorioService.getInstance().getVendasAnual(ano);
    }

    public String createPagina(Integer ano) {
        String cabecalho = getCabecalho();
        List<String> conteudo = getConteudo(ano);
        String rodape = getRodape();

        StringBuilder buffer = new StringBuilder();
        buffer.append(cabecalho);

        for(String linha : conteudo) {
            buffer.append('\n');
            buffer.append(linha);
        }

        buffer.append('\n');
        buffer.append(rodape);

        return buffer.toString();
    }
}
