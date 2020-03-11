package exemplos;

public class Conta {
    private Integer numero;
    private Double saldo;
    private Double limite;

    public Conta(Integer numero) {
        this(numero, 0.0, 0.0);
    }

    public Conta(Integer numero, Double limite) {
        this(numero, limite, 0.0);
    }

    public Conta(Integer numero, Double limite, Double saldo) {
        setNumero(numero);
        setLimite(limite);
        setSaldo(saldo);
    }

    public static Conta criarComLimite(Integer numero, Double limite) {
        return new Conta(numero, limite);
    }

    public static Conta criarComLimiteESaldo(Integer numero, Double limite, Double saldo) {
        return new Conta(numero, limite, saldo);
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        if(numero <= 0) {
            throw new IllegalArgumentException("Número deve ser maior que zero.");
        }
        this.numero = numero;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Double getLimite() {
        return limite;
    }

    public void setLimite(Double limite) {
        if(limite < 0) {
            throw new IllegalArgumentException("Limite deve ser maior que zero.");
        }
        this.limite = limite;
    }

    public void depositar(Double valor) {
        if(valor <= 0) {
            throw new IllegalArgumentException("Valor deve ser maior que zero.");
        }
        saldo = saldo + valor;
    }

    public void sacar(Double valor) {
        if(valor <= 0) {
            throw new IllegalArgumentException("Valor deve ser maior que zero.");
        }
        if(valor > (saldo + limite)) {
            throw new IllegalArgumentException("Saldo insuficiente.");
        }
        saldo = saldo - valor;
    }

    public void transferir(Conta conta, Double valor) {
        if(valor <= 0) {
            throw new IllegalArgumentException("Valor deve ser maior que zero.");
        }
        if(valor > (saldo + limite)) {
            throw new IllegalArgumentException("Saldo insuficiente.");
        }
        saldo = saldo - valor;
        conta.saldo = conta.saldo + valor;
    }
}

