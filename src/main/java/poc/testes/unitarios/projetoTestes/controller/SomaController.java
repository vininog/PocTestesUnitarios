package poc.testes.unitarios.projetoTestes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import poc.testes.unitarios.projetoTestes.service.SomaService;

import java.util.List;

@RestController
@RequestMapping("/soma")
public class SomaController {
    @Autowired
    private SomaService somaService;
    @GetMapping("/somaDoisNumeros")
    public int soma(@RequestParam int a, @RequestParam int b) {
        return somaService.realizaSomaDoisElementos(a, b);
    }

    @PostMapping("/somaVariosNumeros")
    public int somaMultiplosValores(@RequestBody List<Integer> a) {
        return somaService.realizaSomaMultiplosElementos(a);
    }
}
