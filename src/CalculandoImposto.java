/**
 * @author Gabriel Martins
 * @version 1.0
 */


public class CalculandoImposto {

    private double totalImposto; 

    public void registra(Tributavel t){
        double valor = t.getValorImposto();
        this.totalImposto += valor;
    }

    public double getTotal(){
        return this.totalImposto;
    }
    
}
