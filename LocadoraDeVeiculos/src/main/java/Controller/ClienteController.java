package Controller;

import DAO.ExceptionDAO;
import Model.Cliente;

public class ClienteController {
    
    public boolean cadastrarCliente(String nome, String cnh) throws ExceptionDAO{
        if(nome != null && cnh != null){
            Cliente cliente = new Cliente(nome, cnh);
            cliente.cadastrarCliente(cliente);
            return true;
        }else{
            return false;
        }
}
}

