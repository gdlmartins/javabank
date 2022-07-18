public class ContaPoupanca extends Conta {

    ContaPoupanca(int agencia, int numero){
        super(agencia, numero);
    }

    @Override
    public void deposita(double valor) {
        // TODO Auto-generated method stub
        super.saldo += valor; 

    }
}
