package Model;

public class Escritorio {
    private String local;
    private int numero;

    public Escritorio(String local, int numero) {
        this.local = local;
        this.numero = numero;
    }

    public String getLocal() {
        return local;
    }

    public int getNumero() {
        return numero;
    }   
}
