package Model;

public class InscricaoDeMonitoria {
    private EditalMonitoria edital;
    private Aluno aluno;
    private Disciplina disciplina;
    private double creAtual;
    private double mediaDisciplina;

    public InscricaoDeMonitoria(EditalMonitoria edital, Aluno aluno, Disciplina disciplina, double creAtual, double mediaDisciplina) {
        this.edital = edital;
        this.aluno = aluno;
        this.disciplina = disciplina;
        this.creAtual = creAtual;
        this.mediaDisciplina = mediaDisciplina;
    }

    // Métodos Getter
    public EditalMonitoria getEdital() {
        return edital;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public double getCreAtual() {
        return creAtual;
    }

    public double getMediaDisciplina() {
        return mediaDisciplina;
    }

    // Métodos Setter
    public void setEdital(EditalMonitoria edital) {
        this.edital = edital;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public void setCreAtual(double creAtual) {
        this.creAtual = creAtual;
    }

    public void setMediaDisciplina(double mediaDisciplina) {
        this.mediaDisciplina = mediaDisciplina;
    }
}