package DAO;

import Model.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ClienteDAO {
    
    public void cadastrarCliente(Cliente cliente) throws ExceptionDAO{
        if(cliente.getNome() != null && cliente.getCnh() != null){
            Connection connection = null;
            PreparedStatement preparedStatement = null;
            
            try{
                String strSQL = "insert into cliente (nome , cnh) values (? , ?);";
                
                connection = new ConexaoDAO().getConnection();
                if(connection != null){
                    preparedStatement = connection.prepareStatement(strSQL);
                    preparedStatement.setString(1, cliente.getNome());
                    preparedStatement.setString(2, cliente.getCnh());
                    preparedStatement.execute();
                }
                
            }catch (SQLException ex){
                throw new ExceptionDAO("Erro ao cadastrar idioma : "+ ex); 
            }finally{
                ConexaoDAO.fecharPreparedStatement(preparedStatement);
                ConexaoDAO.fecharConexao(connection);
            }
            
        }else{
            JOptionPane.showMessageDialog(null, "Erro nas informações");
        }
    }
}
