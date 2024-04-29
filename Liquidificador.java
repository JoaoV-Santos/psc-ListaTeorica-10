public class Liquidificador {

    private int potencia;
    private String marca;
    private String cor;
    private String material;

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void triturar() {
        System.out.println("O liquidificador está triturando!");
    }

    public void misturar() {
        System.out.println("O liquidificador está misturando!");
    }
}
