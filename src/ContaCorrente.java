public class ContaCorrente extends Conta{

    ContaCorrente(int agencia, int numero){
        super(agencia, numero);
    }
    @Override
    public boolean saca(double valor) {
        double valorASacar = valor + 0.2;
        return super.saca(valorASacar);
    }

    @Override
    public void deposita(double valor) {
        // TODO Auto-generated method stub
        super.saldo+= valor;
    }

}
