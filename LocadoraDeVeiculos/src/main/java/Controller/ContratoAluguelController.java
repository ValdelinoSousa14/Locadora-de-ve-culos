
package Controller;

import DAO.ExceptionDAO;
import Model.ContratoAluguel;
import javax.swing.JOptionPane;

public class ContratoAluguelController {
        public boolean criarContrato(String cnh,String tipo,int dia, int mes) throws ExceptionDAO{
            String diaa = Integer.toString(dia);
            String mess = Integer.toString(mes);
            
            if (diaa != null && mess != null && cnh != null && tipo != null){
                
                
            ContratoAluguel ca = new ContratoAluguel(diaa , mess , cnh , tipo);
            
            ca.criarContrato(ca);
            
            return true;
            }else{
                
                JOptionPane.showMessageDialog(null, "informações erradas");
                return false;  
            }
        }
}
