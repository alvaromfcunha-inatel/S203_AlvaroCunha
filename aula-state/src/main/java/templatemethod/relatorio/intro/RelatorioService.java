package templatemethod.relatorio.intro;

import java.util.ArrayList;
import java.util.List;

public class RelatorioService {
    private static RelatorioService instance;

    private RelatorioService() { }

    public static RelatorioService getInstance() {
        if(instance == null)
            instance = new RelatorioService();
        return instance;
    }

    public List<String> getVendasMensal(Integer ano, Integer mes) {
        List<String> vendasMensal = new ArrayList<>();

        vendasMensal.add("CATEGORIA DE PRODUTOS      | TOTAL MENSAL");
        vendasMensal.add("Camisas Polo               |       980,00");
        vendasMensal.add("Calças Jeans               |       760,00");
        vendasMensal.add("Meias                      |       340,00");

        return vendasMensal;
    }



    public List<String> getVendasAnual(Integer ano) {
        List<String> vendasAnual = new ArrayList<>();

        vendasAnual.add("CATEGORIA DE PRODUTOS      | TOTAL ANUAL");
        vendasAnual.add("Camisas Polo               |    98000,00");
        vendasAnual.add("Calças Jeans               |    45600,00");
        vendasAnual.add("Meias                      |    39840,00");

        return vendasAnual;
    }
}
