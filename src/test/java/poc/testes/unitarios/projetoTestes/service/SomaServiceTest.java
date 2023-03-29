package poc.testes.unitarios.projetoTestes.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
class SomaServiceTest {

    @Autowired
    private SomaService somaService;

    @Test
    @DisplayName("DEVE realizar a soma dos valores a e b")
    void testRealizaSomaDoisElementos() {
        int a = 2;
        int b = 3;
        int resultadoEsperado = 5;

        int resultadoReal = somaService.realizaSomaDoisElementos(a, b);

        assertEquals(resultadoEsperado, resultadoReal);
    }

}
