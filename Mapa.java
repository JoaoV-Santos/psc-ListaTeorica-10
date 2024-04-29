public class Mapa {
    private int tamanho;
    private String localizacao;
    private int escala;
    private String tipo;


    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public int getEscala() {
        return escala;
    }

    public void setEscala(int escala) {
        this.escala = escala;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void orientar(String destino) {
        System.out.println(destino + " fica para lá!");
    }

    public void localizar(String localizacao) {
        System.out.println("Voce esta aqui!");
    }
}
