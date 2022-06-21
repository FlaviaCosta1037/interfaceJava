package Entidades;

import javax.xml.crypto.Data;

public class Parcelas {
    private Data vencimento;
    private Double quantidade;

    public Parcelas(Data vencimento, Double quantidade) {
        this.vencimento = vencimento;
        this.quantidade = quantidade;
    }

    public Data getVencimento() {
        return vencimento;
    }

    public void setVencimento(Data vencimento) {
        this.vencimento = vencimento;
    }

    public Double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }
}
