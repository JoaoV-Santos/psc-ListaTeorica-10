import java.util.Date;

public class Aluno {

    private String cpf;
    private Date dataDeMatricula;
    private String curso;
    private String campus;


    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataDeMatricula() {
        return dataDeMatricula;
    }

    public void setDataDeMatricula(Date dataDeMatricula) {
        this.dataDeMatricula = dataDeMatricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }

    private boolean estudar(boolean sabeAMateria) {
        boolean vaiEstudar = false;
        if (sabeAMateria == false)
            vaiEstudar = true;

        return vaiEstudar;
    }

    private boolean reprovar(boolean estudou) {
        boolean reprovado = false;
        if (estudou == false)
            reprovado = true;

        return reprovado;
    }
}
