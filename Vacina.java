public class Vacina{
    private String descricao;
    private int lote;
    private String fabricante;

    public Vacina(){

    }

    public Vacina(String descricao, int lote, String fabricante){
        setDescricao(descricao);
        setLote(lote);
        setFabricante(fabricante);
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setLote(int lote) {
        this.lote = lote;
    }

    public int getLote() {
        return lote;
    }
}