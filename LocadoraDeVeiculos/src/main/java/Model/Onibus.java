package Model;
import java.util.Date;

public class Onibus extends Veiculo{
    private int numPassageiros;
    private boolean lotado;

    public Onibus (String placa, Date datap, int numPassageiros, boolean lotado) {
        super(datap, placa);
        this.numPassageiros = numPassageiros;
        this.lotado = lotado;
    }

    public int getNumPassageiros() {
        return numPassageiros;
    }

    public boolean isLotado() {
        return lotado;
    }
    
}
