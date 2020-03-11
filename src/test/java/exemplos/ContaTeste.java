package exemplos;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class ContaTeste {
    private Conta conta1;

    @BeforeEach
    public void beforeEach() {
        conta1 = new Conta(1, 1000.0, 2000.0);
    }

    @AfterEach
    public void afterEach() {
        conta1 = null;
    }

    @Test
    @DisplayName("Deve criar um objeto conta")
    public void criarObjetoConta() {
        assertNotNull(conta1);
    }

    @Test
    public void presencaAtributos() {
        assertNotNull(conta1.getNumero());
        assertNotNull(conta1.getLimite());
        assertNotNull(conta1.getSaldo());
    }

    @Test
    public void metodoSetNumero() {

    }

    @Test
    public void metodoDepositar() {

    }

    @Test
    @Disabled
    public void metodoDepositarValorInvalido() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> conta1.depositar(-200.0));
        assertEquals("Valor deve ser maior que zero.", exception.getMessage());
    }

    @Test
    public void metodoSacar() {
        assertEquals(conta1.getSaldo(), 2000.0);
        assertEquals(conta1.getLimite(), 1000.0);
        conta1.sacar(2600.00);
        assertEquals(conta1.getSaldo(), -600.0);
        assertEquals(conta1.getLimite(), 1000.0);
    }

    @Test
    public void metodoSacarValorInvalido() {

    }

    @Test
    public void metodoSacarSaldoInsuficiente() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> conta1.sacar(3001.00));
        assertEquals("Saldo insuficiente.", exception.getMessage());
    }

    @Test
    public void metodoTransferir() {

    }

    @Test
    public void metodoTransferirValorInvalido() {

    }

    @Test
    public void metodoTransferirSaldoInsuficiente() {

    }
}
