package templatemethod.relatorio.refactor;

import java.util.List;

public abstract class RelatorioGeneratorTemplate {
    private String getCabecalho() {
        return "Empresa My" + "\n"
                + "----------";
    }

    private String getRodape() {
        return "----------" + '\n'
                + "* Propriedade particular - Uso confidencial";
    }

    public abstract List<String> getConteudo();

    public String createPagina() {
        String cabecalho = getCabecalho();
        List<String> conteudo = getConteudo();
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
