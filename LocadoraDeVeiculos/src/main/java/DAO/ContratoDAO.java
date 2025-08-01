package DAO;

import Model.ContratoAluguel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ContratoDAO {
    public void criarContrato(ContratoAluguel contrato) throws ExceptionDAO{
        if(contrato != null){
            Connection conn = null;
            PreparedStatement preparedStatement = null;
            
            try{
                String codSQL = "insert into contratoAluguel( data , datafinal , cnh ) "
                        + "values"
                        + "( ? , ? , ?)";
                
                conn = new ConexaoDAO().getConnection();
                if(conn != null){
                    preparedStatement = conn.prepareStatement(codSQL);
                    preparedStatement.setString(1 , contrato.getData());
                    preparedStatement.setString(2 , contrato.getDuracao());
                    preparedStatement.setString(3 , contrato.getCnh());
                }
            }catch (SQLException ex){
                throw new ExceptionDAO("Erro ao cadastrar idioma : "+ ex);
            }
            
        }else{
            JOptionPane.showMessageDialog(null, "Erro, insira as informações corretamente!!");
    }
}
}
