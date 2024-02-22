package socursos;

public class Curso {
    public String nomeCurso;
    public String infoCurso;
    public String nomeProf;
    public double valorCurso;
    public String listAlunos;

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public String getNomeProf() {
        return nomeProf;
    }

    public String getInfoCurso() {
        return infoCurso;
    }

    public void setInfoCurso(String infoCurso) {
        this.infoCurso = infoCurso;
    }

    public void setNomeProf(String nomeProf) {
        this.nomeProf = nomeProf;
    }

    public double getValorCurso() {
        return valorCurso;
    }

    public void setValorCurso(double valorCurso) {
        this.valorCurso = valorCurso;
    }

    public String getListAlunos() {
        return listAlunos;
    }

    public void setListAlunos(String listAlunos) {
        this.listAlunos = listAlunos;
    }
}
