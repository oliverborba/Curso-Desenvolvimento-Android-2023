package devandroid.borba.appgaseta.model;

public class Curso {

    private String NomeDoCursoDesejado;

    public Curso(String nomeDoCursoDesejado) {
        this.NomeDoCursoDesejado = nomeDoCursoDesejado;
    }

    public String getNomeDoCursoDesejado() {
        return NomeDoCursoDesejado;
    }

    public void setNomeDoCursoDesejado(String nomeDoCursoDesejado) {
        NomeDoCursoDesejado = nomeDoCursoDesejado;
    }
}
