package poc.testes.unitarios.projetoTestes.service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MultiplicacaoService {
    public int realizaMultiplicacaoDoisElementos(int a, int b){
        return a * b;
    }

    public int realizaMultiplicacaoMultiplosElementos(List<Integer> a) {
        int resultado = 1;
        for(int i = 0; i < a.size(); i++) {
            resultado *= a.get(i);
        }
        return resultado;
    }
}
