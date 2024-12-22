
package estruturaDados;

import modelo.Docente;

/**
 *
 * @author Luís Fernando
 */
public interface ILista {
  
   public int getTamanho();
   public void incluirInicio(Docente docente) throws Exception; 
   public void retirarInicio() throws Exception;
   public Docente acessarInicio() throws Exception;
   public No acessarPrimeiroNo() throws Exception;  
   public void incluirFim(Docente docente) throws Exception;  
   public void retirarNoFim() throws Exception;
   public Docente acessarNoFim() throws Exception;  
   public boolean estaVazia();
  
   public String obterLista() throws Exception;
   
}
