package Servicos;

public class ServicoPagamentoPaypal implements ServicoPagamentoOnline {
    private static final double taxaPagamento = 0.02;
    private static final double taxaJurosMes = 0.01;

    @Override
    public double taxaPagamento(double valor) {
        return valor * taxaPagamento;
    }

    @Override
    public double taxaJuros(double valor, Integer qtdMeses) {
        return valor * qtdMeses * taxaJurosMes;
    }
}
