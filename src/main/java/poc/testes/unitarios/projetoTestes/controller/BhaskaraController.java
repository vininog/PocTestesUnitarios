package poc.testes.unitarios.projetoTestes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import poc.testes.unitarios.projetoTestes.dto.BhaskaraDTO;
import poc.testes.unitarios.projetoTestes.exception.DivisionByZeroException;
import poc.testes.unitarios.projetoTestes.exception.NegativeDeltaException;
import poc.testes.unitarios.projetoTestes.service.BhaskaraService;

@RestController
@RequestMapping("/bhaskara")
public class BhaskaraController {
    @Autowired
    private BhaskaraService bhaskaraService;

    @PostMapping("/calcular")
    public ResponseEntity<BhaskaraDTO> calcularBhaskara(@RequestBody BhaskaraDTO bhaskaraDTO) {
        try {
            BhaskaraDTO resultado = bhaskaraService.calculaFormulaDeBhaskara(bhaskaraDTO);
            return ResponseEntity.ok(resultado);
        } catch (NegativeDeltaException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        } catch (DivisionByZeroException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}
