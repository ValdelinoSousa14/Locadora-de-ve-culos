
package Model;

import DAO.ClienteDAO;
import DAO.ExceptionDAO;


public class Cliente {
    private String nome;
    private String cnh;

    public Cliente(String nome, String cnh) {
        this.nome = nome;
        this.cnh = cnh;
    }

    public String getNome() {
        return nome;
    }

    public String getCnh() {
        return cnh;
    }
    
    public void cadastrarCliente(Cliente cliente) throws ExceptionDAO{
        new ClienteDAO().cadastrarCliente(cliente);
    }
}
