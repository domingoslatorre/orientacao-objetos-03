package exemplos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class QuadradoTeste {

    @Test
    public void criarObjetoQuadrado() {
        Quadrado q1 = new Quadrado(10.0);
        assertNotNull(q1);
    }

    @Test
    public void presencaAtributoLado() {
        Quadrado q1 = new Quadrado(10.0);
        assertNotNull(q1.getLado());
    }

    @Test
    public void metodoCalcularArea() {
        Quadrado q1 = new Quadrado(10.0);
        Double valorEsperado = 100.0;
        Double valorObtido = q1.calcularArea();
        assertEquals(valorEsperado, valorObtido);
    }

    @Test
    public void metodoCalcularPerimetro() {
        Quadrado q1 = new Quadrado(10.0);
        Double valorEsperado = 40.0;
        Double valorObtido = q1.calcularPerimetro();
        assertEquals(valorEsperado, valorObtido);
    }
}
