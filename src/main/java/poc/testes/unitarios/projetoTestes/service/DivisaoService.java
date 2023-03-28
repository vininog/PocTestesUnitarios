package poc.testes.unitarios.projetoTestes.service;

import org.springframework.stereotype.Service;
import poc.testes.unitarios.projetoTestes.exception.DivisionByZeroException;

import java.util.List;

@Service
public class DivisaoService {
    public double realizaDivisaoDoisElementos(double a, double b) throws DivisionByZeroException {
        if (b == 0) {
            throw new DivisionByZeroException();
        }
        return a / b;
    }

    public double realizaDivisaoMultiplosElementos(List<Double> a) throws DivisionByZeroException {
        double result = a.get(0);
        for (int i = 1; i < a.size(); i++) {
            double elemento = a.get(i);
            if (elemento == 0) {
                throw new DivisionByZeroException();
            }
            result /= elemento;
        }
        return result;
    }
}
