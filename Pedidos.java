import java.util.ArrayList;


public class Pedidos {
  private int id;
  private ArrayList<Pessoas> pessoas;

  public void definirId(int id) {
    this.id = id;
  }

  public int retornarId() {
    return this.id;
  }
}
