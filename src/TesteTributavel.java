public class TesteTributavel {
    public static void main(String[] args) {
        

        Seguro seg = new Seguro();
        ContaCorrente cc = new ContaCorrente(2221, 0012);
        cc.saldo= 1000; 

        CalculandoImposto calculando = new CalculandoImposto();
        System.out.println(cc.saldo);
        calculando.registra(cc);
        calculando.registra(seg);

 
        System.out.println(calculando.getTotal());

        
    }
    
}
