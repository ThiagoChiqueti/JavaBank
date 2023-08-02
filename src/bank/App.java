package bank;

public class App {
    public static void main(String[] args) throws Exception {
        

        //Criar uma conta (agência, conta, nome)
        //Limitar o nome a 12 caracteres
        Account account = new Account("0001","0001", "Thiago");

        System.out.println(account.getName());

        account.deposit(100.0);

        account.withDraw(20.0);

        account.deposit(100.0);
        
        account.deposit(100.0);

        
        
        //Sacar valores respeitando condições (sacar mais do que tem)
        //Informar ao usuário as alterações

    }
}
