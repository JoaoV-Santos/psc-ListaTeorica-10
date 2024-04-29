public class Celular {

    private String marca;
    private String modelo;
    private String IMEI;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getIMEI() {
        return IMEI;
    }

    public void setIMEI(String IMEI) {
        this.IMEI = IMEI;
    }

    public void filmar() {
        System.out.println("Gravando vídeo!");
    }

    public void tirarFoto() {
        System.out.println("Tirando Foto!");
    }

    public void fazerLigacao() {
        System.out.println("Chamando!");
    }

    public boolean acessarInternet(boolean conectado) {
        if (conectado == true)
            return true;
        else
            return false;
    }
}
