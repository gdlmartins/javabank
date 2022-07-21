public class TestCasa {

    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente(2020, 321);


        conta.deposita(100.0);

        try {
            conta.saca(200);
            
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println(e);
        }

        // conta.saca(190);

        System.out.println(conta.getSaldo());
    }
}