package poc.testes.unitarios.projetoTestes.service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubtracaoService {
    public int realizaSubtracaoDoisElementos(int a, int b) {
        return a - b;
    }

    public int realizaSubtracaoMultiplosElementos(List<Integer> a) {
        int result = a.get(0);
        for (int i = 1; i < a.size(); i++) {
            result -= a.get(i);
        }
        return result;
    }
}
