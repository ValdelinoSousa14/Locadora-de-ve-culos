
package DAO;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class ConexaoDAO {
    
    public Connection getConnection() throws ExceptionDAO{
        Connection conn = null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost/locadoradecarros";
            String usuario = "root";
            String senha = "";
            conn = DriverManager.getConnection(url, usuario, senha);
            
        }catch(ClassNotFoundException | SQLException e){
            throw new ExceptionDAO("Erro: " + e);
        }
        
        return conn;
    }
    
    public static void fecharPreparedStatement(PreparedStatement preparedStatement) throws ExceptionDAO{
        if(preparedStatement != null){
            try{
                preparedStatement.close();
            }catch(SQLException e){
                throw new ExceptionDAO("Erro ao fechar preparedStatement: " + e);
            }
        }
    }
    
    public static void fecharConexao(Connection connection) throws ExceptionDAO{
        if(connection != null){
            try{
                connection.close();
            }catch(SQLException e){
                throw new ExceptionDAO("Erro ao fechar a conexão: " + e);
            }
        }
    }
}

