package Model;

public class TipoVeiculo {
    private String nome;

    public TipoVeiculo(String nome) {
        this.nome = nome;
    }
   

    public boolean criarVeiculo(){
        if(nome.equals("onibus")){
            return true;
        }else{
            return false;
        }
    }
}
