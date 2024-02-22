package socursos;

public class Aluno {
    public String nomeAluno;

    public String emailAluno;
    public String telefone;

    public String cursosMatriculados;


    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public String getEmailAluno() {
        return emailAluno;
    }

    public void setEmailAluno(String emailAluno) {
        this.emailAluno = emailAluno;
    }


    public String getCursosMatriculados() {
        return cursosMatriculados;
    }

    public void setCursosMatriculados(String cursosMatriculados) {
        this.cursosMatriculados = cursosMatriculados;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
