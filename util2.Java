public class Util {
    
/**
 *
 *       Declaração de Atributos 
 */
private String texto ;
    
public Util()
{
    System.out.println("Construtor executado..");
    
}



/**
 * 
 *    Metodo:Set's' e Get's  (encapsulamento)
 * 
 */


/** 
 * @return o texto 
 */
public String getTexto()
        {
       return texto;     
        }
/**
 *  o metodo:exibir o texto 
 */

public void exibir Texto()
{
    JOptionPane.showMessageDialog(null,OBA,seu primeiro programa ""+"\n" + this.getTexto ())");
}
/**
 *  metodo:digitaro texto
 */
public  void digitarTexto()
{
    this.setTexto(JOptionpane.showInputDialog("Digite o seu nome"));
}
}