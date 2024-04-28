public class Gato {

    private String raca;
    private String cor;

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void miar () {
        System.out.println("Miau!");
    }

    public void ronronar () {
        System.out.println("O gato está ronronando");
    }

    public boolean arranhar (boolean bravo) {
        boolean arranhar = false;
        if (bravo == true) {
            boolean a = true;
        }
        if (bravo == false) {
            boolean a = false;
        }
        return arranhar;
    }
}
