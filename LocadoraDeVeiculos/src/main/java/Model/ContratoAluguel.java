package Model;

import java.util.Date;

public class ContratoAluguel {
    private Date data;
    private Date dataFinal;
    private Cliente cliente;
    private TipoVeiculo TV;

    public ContratoAluguel(Date data, Date duracao, Cliente cliente, TipoVeiculo TV) {
        this.data = data;
        this.dataFinal = duracao;
        this.cliente = cliente;
        this.TV = TV;
    }

    public Date getData() {
        return data;
    }

    public Date getDuracao() {
        return dataFinal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public TipoVeiculo getTV() {
        return TV;
    }
   
}
