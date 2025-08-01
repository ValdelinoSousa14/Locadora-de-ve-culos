package Model;

import DAO.ContratoDAO;
import DAO.ExceptionDAO;
import java.util.Date;

public class ContratoAluguel {
    private String data;
    private String dataFinal;
    private String cnh;
    private String TV;
    int mesF;
    String mesff;

    public ContratoAluguel(String dia, String mes, String cnh, String TV) {
        this.mesF = 2 + Integer.parseInt(mes);
        mesff = Integer.toString(mesF);
        this.data = "2025-"+mes+dia;
        this.dataFinal = "2025-"+ mesff +dia;
        this.cnh = cnh;
        this.TV = TV;
    }

    public String getData() {
        return this.data;
    }

    public String getDuracao() {
        return dataFinal;
    }

    public String getCnh() {
        return cnh;
    }

    public String getTV() {
        return TV;
    }
   public void criarContrato( ContratoAluguel contrato) throws ExceptionDAO{
       new ContratoDAO().criarContrato(contrato);
   }
}
