public class Banco {

    private int agencia;
    private String endereco;
    private String empresa;

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public boolean realizarEmprestimo(boolean clienteNegativado) {
        if (clienteNegativado == true)
            return false;
        else
            return true
    }

    public boolean guardarDinheiro(boolean clienteDepositou) {
        if (clienteDepositou == true)
            return true;
        else
            return false;
    }

    public boolean fornecerCartaoDeCredito(boolean scoreAlto) {
        if (scoreAlto == true)
            return true;
        else
            return false;
    }
}
