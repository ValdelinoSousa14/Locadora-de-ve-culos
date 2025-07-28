package Model;

import java.util.Date;

public class Veiculo {
    private Date dataP;
    private String placa;

    public Veiculo(Date dataP, String placa) {
        this.dataP = dataP;
        this.placa = placa;
    }

    public Date getDataP() {
        return dataP;
    }

    public String getPlaca() {
        return placa;
    }
    public void cadastrarVeiculo(TipoVeiculo tp){

    }
}
