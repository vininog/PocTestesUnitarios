package poc.testes.unitarios.projetoTestes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import poc.testes.unitarios.projetoTestes.service.SubtracaoService;

import java.util.List;

@RestController
@RequestMapping("/subtracao")
public class SubtracaoController {
    @Autowired
    private SubtracaoService subtracaoService;

    @GetMapping("/subtrairDoisNumeros")
    public int subtrair(@RequestParam int a, @RequestParam int b) {
        return subtracaoService.realizaSubtracaoDoisElementos(a, b);
    }

    @PostMapping("/subtrairMultiplosNumeros")
    public int subtrairMultiplosValores(@RequestBody List<Integer> a) {
        return subtracaoService.realizaSubtracaoMultiplosElementos(a);
    }
}
