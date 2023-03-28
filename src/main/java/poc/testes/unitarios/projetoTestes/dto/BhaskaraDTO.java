package poc.testes.unitarios.projetoTestes.dto;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class BhaskaraDTO {
    private double a;
    private double b;
    private double c;
    private double delta;
    private Double raiz1;
    private Double raiz2;

    public BhaskaraDTO(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
}
