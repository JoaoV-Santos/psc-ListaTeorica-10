public class Abajur {

    private String cor;
    private String marca;
    private String material;
    private int tamanho;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public boolean iluminar(boolean abajurLigado) {
        if (abajurLigado == true)
            return true;
        else
            return false;
    }

    public boolean decorar(boolean combinaComOAmbiente) {
        if (combinaComOAmbiente == true)
            return true;
        else
            return false;
    }
}
