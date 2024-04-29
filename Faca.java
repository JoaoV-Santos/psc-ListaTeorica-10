public class Faca {

    private String cor;
    private String materialDaLamina;
    private String materialDoCabo;
    private String marca;
    private int tamanho;


    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMaterialDaLamina() {
        return materialDaLamina;
    }

    public void setMaterialDaLamina(String materialDaLamina) {
        this.materialDaLamina = materialDaLamina;
    }

    public String getMaterialDoCabo() {
        return materialDoCabo;
    }

    public void setMaterialDoCabo(String materialDoCabo) {
        this.materialDoCabo = materialDoCabo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public boolean cortar(boolean afiada) {
        if (afiada = true)
            return true;
        else
            return false;
    }
}
