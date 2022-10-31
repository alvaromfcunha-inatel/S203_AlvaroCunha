package templatemethod.relatorio.intro;

import java.util.List;

public class RelatorioVendasMensaisGenerator {
    private String getCabecalho() {
        return "Empresa My" + "\n"
                + "----------";
    }

    private String getRodape() {
        return "----------" + '\n'
                + "* Propriedade particular - Uso confidencial";
    }

    public List<String> getConteudo(Integer ano, Integer mes) {
        return RelatorioService.getInstance().getVendasMensal(ano, mes);
    }

    public String createPagina(Integer ano, Integer mes) {
        String cabecalho = getCabecalho();
        List<String> conteudo = getConteudo(ano, mes);
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
