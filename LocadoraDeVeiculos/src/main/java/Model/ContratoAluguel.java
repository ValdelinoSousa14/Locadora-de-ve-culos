package Model;

import java.util.Date;

public class ContratoAluguel {
    private Date data;
    private int duracao;
    private Cliente cliente;
    private TipoVeiculo TV;

    public ContratoAluguel(Date data, int duracao, Cliente cliente, TipoVeiculo TV) {
        this.data = data;
        this.duracao = duracao;
        this.cliente = cliente;
        this.TV = TV;
    }

    public Date getData() {
        return data;
    }

    public int getDuracao() {
        return duracao;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public TipoVeiculo getTV() {
        return TV;
    }
   
}
