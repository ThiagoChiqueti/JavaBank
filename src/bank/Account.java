package bank;

public class Account {

  //Limitar o nome a 12 caracteres "Constante"
  private static final int MAX_LENGTH = 12;


  private String ag;
  private String cc;
  private String name;
  private Double balance = 0.00;
  private Display logger;
  
  //Construtor
  public Account(String ag, String cc, String name){
    this.ag = ag;
    this.cc = cc;
    setName(name);
    logger = new Display();
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
      logger.out("Saldo insuficiente para realizar saque.");
    } else {
      balance-=value;
      logger.out("Saque no valor de: "+ value +" efetuado com sucesso!");
      logger.out("Novo saldo: " + balance);
    }

  }

  //Depósito

  public void deposit(Double value){
    if(value<=0){
      logger.out("Impossivel realizar operação, digite um valor válido para o depósito");
    } else {
      balance+=value;
      logger.out("Novo saldo: " + balance);
    }
  }


}
