package poc.testes.unitarios.projetoTestes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import poc.testes.unitarios.projetoTestes.exception.DivisionByZeroException;
import poc.testes.unitarios.projetoTestes.service.DivisaoService;

import java.util.List;

@RestController
@RequestMapping("/divisao")
public class DivisaoController {
    @Autowired
    private DivisaoService divisaoService;

    @GetMapping("/divisaoDoisNumeros")
    public double divide(@RequestParam double a, @RequestParam double b) throws DivisionByZeroException {
        return divisaoService.realizaDivisaoDoisElementos(a, b);
    }

    @PostMapping("/divisaoVariosNumeros")
    public double divideMultiplosValores(@RequestBody List<Double> a) throws DivisionByZeroException {
        return divisaoService.realizaDivisaoMultiplosElementos(a);
    }
}
