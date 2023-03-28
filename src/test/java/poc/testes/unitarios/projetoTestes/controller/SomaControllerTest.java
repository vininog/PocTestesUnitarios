package poc.testes.unitarios.projetoTestes.controller;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class SomaControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    @DisplayName("DEVE realizar a soma dos valores a e b QUANDO for inputado os valores pela requisicao GET")
    void deveRealizarSomaDeDoisValores() {
        int a = 2;
        int b = 3;
        int resultadoEsperado = 5;

        int resultadoReal = restTemplate.getForObject("/soma/somaDoisNumeros?a={a}&b={b}", Integer.class, a, b);

        assertEquals(resultadoEsperado, resultadoReal);
    }
}
