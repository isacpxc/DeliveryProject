import java.util.Date;

public class Fisica extends Pessoas{
  private String cpf;

  public void definirCpf(String cpf) {
    this.cpf = cpf;
  }

  public String retornarCpf(String cpf) {
    return this.cpf;
  }

  public int calculaIdade(Date dataNascimento){
    return 0;
  }

}
