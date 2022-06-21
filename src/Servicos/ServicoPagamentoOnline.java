package Servicos;

public interface ServicoPagamentoOnline {
    double taxaPagamento(double valor);
    double taxaJuros(double valor, Integer qtdMeses);
}
