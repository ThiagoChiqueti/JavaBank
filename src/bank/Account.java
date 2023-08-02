package bank;

public class Account {

  private String ag;
  private String cc;
  private String name;
  private Double balance = 0.00;

  //Limitar o nome a 12 caracteres "Constante"
  private static final int MAX_LENGTH = 12;

  public Account(String ag, String cc, String name){
    this.ag = ag;
    this.cc = cc;
    setName(name);
  }

  //Verifica se o nome tem o temanho certo, caso não tenha ele corta

  public void setName(String name){
    if(name.length() > MAX_LENGTH){
      this.name = name.substring(0, MAX_LENGTH);
    }else{
      this.name = name;
    }
  }

  public String getName(){
    return this.name;
  }

  //Saque
  public void withDraw(Double value){
    if(value>balance){
      System.out.println("Valor insuficiente para efetuar saque, tente novamente.");
    } else {
      balance-=value;
      System.out.println("Saque efetuado com sucesso");
      System.out.println("Novo saldo: " + balance);
    }

  }

  //Depósito

  public void deposit(Double value){
    if(value<=0){
      System.out.println("Valor insuficiente para efetuar depósito, tente novamente.");
    } else {
      balance+=value;
      System.out.println("Depósito efetuado com sucesso");
      System.out.println("Novo saldo: " + balance);
    }
  }


}
