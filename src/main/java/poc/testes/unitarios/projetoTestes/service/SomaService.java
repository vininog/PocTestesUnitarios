package poc.testes.unitarios.projetoTestes.service;

import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SomaService {
    public int realizaSomaDoisElementos(int a, int b){
        return a + b;
    }

    public int realizaSomaMultiplosElementos(List<Integer> elementos){
        return elementos.stream().reduce(0, (subtotal, elementoAtual) -> subtotal + elementoAtual);
    }
}
