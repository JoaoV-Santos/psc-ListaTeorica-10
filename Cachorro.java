
public class Cachorro {

    private String raca;
    private String cor;
    private char porte;

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

    public char getPorte() {
        return porte;
    }

    public void setPorte(char porte) {
        this.porte = porte;
    }

    public void latir() {
        System.out.println("AU AU");
    }

    public void farejar(String cheiro) {
        System.out.println("O cachorro está farejando por " + cheiro);
    }

    public boolean rosnar (boolean bravo) {
        boolean rosnar = false;
        if (bravo == true) {
            boolean a = true;
        }
        if (bravo == false) {
            boolean a = false;
        }
        return rosnar;
    }

    public boolean morder (boolean bravo) {
        boolean rosnar = false;
        if (bravo == true) {
            boolean a = true;
        }
        if (bravo == false) {
            boolean a = false;
        }
        return rosnar;
    }

}
