package Servicos;

import Entidades.Contrato;

public class ServicoContrato {
    private ServicoPagamentoOnline servicoPagamentoOnline;

    public ServicoContrato(ServicoPagamentoOnline servicoPagamentoOnline) {
        this.servicoPagamentoOnline = servicoPagamentoOnline;
    }
    public void processamentoContrato(Contrato contrato, int qtdMes){
        double parcelaBasica = contrato.getValorTotal() / qtdMes;
        for(int i = 1; i <= qtdMes; i++){
            double taxaAtualizada = parcelaBasica + servicoPagamentoOnline.taxaJuros(parcelaBasica,i);
            double valorFinal = taxaAtualizada + servicoPagamentoOnline.taxaPagamento(taxaAtualizada);

        }
    }
}
