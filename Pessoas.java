import java.util.Date;
import java.util.ArrayList;

public class Pessoas{
  private String nome;
  private String email;
  private Date dataNascimento;
  private String telefone;
  private String cidade;
  private String password;
  private int id;
  private ArrayList<Restaurante> restaurantes;
  private ArrayList<Pedidos> pedidos;

  public void definirNome(String nome) {
    this.nome = nome;
  }

  public String retornarNome() {
    return this.nome;
  }

  public void definirEmail(String email) {
    this.email = email;
  }

  public String retornarEmail() {
    return this.email;
  }

  public void definirDataNascimento(Date dataNascimento) {
    this.dataNascimento = dataNascimento;
  }

  public Date retornarDataNascimento() {
    return this.dataNascimento;
  }

  public void definirTelefone(String telefone) {
    this.telefone = telefone;
  }

  public String retornarTelefone() {
    return this.telefone;
  }

  public void definirCidade(String cidade) {
    this.cidade = cidade;
  }

  public String retornarCidade() {
    return this.cidade;
  }

  public void definirPassword(String password) {
    this.password = password;
  }

  public String retornarPassword() {
    return this.password;
  }

  public void definirId(int id) {
    this.id = id;
  }

  public int retornarId() {
    return this.id;
  }


}