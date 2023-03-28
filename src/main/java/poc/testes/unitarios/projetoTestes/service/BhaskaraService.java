package poc.testes.unitarios.projetoTestes.service;

import org.springframework.stereotype.Service;
import poc.testes.unitarios.projetoTestes.dto.BhaskaraDTO;
import poc.testes.unitarios.projetoTestes.exception.DivisionByZeroException;
import poc.testes.unitarios.projetoTestes.exception.NegativeDeltaException;

@Service
public class BhaskaraService {
    public BhaskaraDTO calculaFormulaDeBhaskara(BhaskaraDTO bhaskaraDTO) throws NegativeDeltaException, DivisionByZeroException {
        if (bhaskaraDTO.getA() == 0) {
            throw new DivisionByZeroException();
        }

        double delta = bhaskaraDTO.getB() * bhaskaraDTO.getB() - 4 * bhaskaraDTO.getA() * bhaskaraDTO.getC();

        if (delta < 0) {
            throw new NegativeDeltaException();
        }

        bhaskaraDTO.setDelta(delta);

        double raizDelta = Math.sqrt(delta);
        double x1 = (-bhaskaraDTO.getB() + raizDelta) / (2 * bhaskaraDTO.getA());
        double x2 = (-bhaskaraDTO.getB() - raizDelta) / (2 * bhaskaraDTO.getA());

        bhaskaraDTO.setRaiz1(x1);
        bhaskaraDTO.setRaiz2(x2);

        return bhaskaraDTO;
    }
}
