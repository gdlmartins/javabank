public class TestContas {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(111, 2020);
        ContaPoupanca cp = new ContaPoupanca(100, 0001);


        cc.deposita(200.0);
        cc.transfere(10.0, cp);

        System.out.println("cp saldo: " + cp.getSaldo());
        System.out.println("cc saldo: " + cc.getSaldo());
    }
    
}
