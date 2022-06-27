
public class Cardapio {
  private String produto;
  private String descricao;
  private Double valor;
  private String imagem;
  private int id;

  public void definirDescricao(String descricao) {
    this.descricao = descricao;
  }

  public String retornarDescricao() {
    return this.descricao;
  }

  public void definirId(int id) {
    this.id = id;
  }

  public int retornarId() {
    return this.id;
  }

  public void definirImagem(String imagem) {
    this.imagem = imagem;
  }

  public String retornarImagem() {
    return this.imagem;
  }

  public void definirProduto(String produto) {
    this.produto = produto;
  }

  public String retornarProduto() {
    return this.produto;
  }

  public void definirValor(Double valor) {
    this.valor = valor;
  }

  public Double retornarValor() {
    return this.valor;
  }
}
