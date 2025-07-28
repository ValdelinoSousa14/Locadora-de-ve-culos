
package Model;

import java.util.Date;

public class Automovel extends Veiculo {
    private boolean direcaoH;
    private boolean cambioA;
    private int numeroP;

    public Automovel(Date datap, String placa ,boolean direcaoH, boolean cambioA, int numeroP) {
        super(datap, placa);
        this.direcaoH = direcaoH;
        this.cambioA = cambioA;
        this.numeroP = numeroP;
    }

    public boolean isDirecaoH() {
        return direcaoH;
    }

    public boolean isCambioA() {
        return cambioA;
    }

    public int getNumeroP() {
        return numeroP;
    }
}
