package poc.testes.unitarios.projetoTestes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import poc.testes.unitarios.projetoTestes.service.MultiplicacaoService;

import java.util.List;

@RestController
@RequestMapping("/multiplicacao")
public class MultiplicacaoController {
    @Autowired
    private MultiplicacaoService multiplicacaoService;

    @GetMapping("/multiplicaDoisNumeros")
    public int multiplica(@RequestParam int a, @RequestParam int b) {
        return multiplicacaoService.realizaMultiplicacaoDoisElementos(a, b);
    }

    @PostMapping("/multiplicaVariosNumeros")
    public int multiplicaMultiplosValores(@RequestBody List<Integer> a) {
        return multiplicacaoService.realizaMultiplicacaoMultiplosElementos(a);
    }
}
