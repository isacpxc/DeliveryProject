import java.util.ArrayList;

public class Restaurante{
  private String endereco;
  private String nome;
  private String descricao;
  private int id;
  private ArrayList<Cardapio> cardapios;
  private ArrayList<Pessoas> pessoas;

  public void definirEndereco(String endereco){
    this.endereco = endereco;
  }

  public String retornarEndereco(){
    return this.endereco;
  } 

  public void definirNome(String nome){
    this.nome = nome;
  }

  public String retornarNome(){
    return this.nome;
  }

  public void definirDescricao(String descricao){
    this.descricao = descricao;
  }

  public String retornarDescricao(){
    return this.descricao;
  }

  public void definirId(int id){
    this.id = id;
  }

  public int retornarId(){
    return this.id;
  }
  

}