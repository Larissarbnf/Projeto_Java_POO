package BackEnd;
import java.util.Date;
import java.util.List;

public class EditalMonitoria {
    private Date dataInicioInscricoes;
    private Date dataLimiteInscricoes;
    private List<Disciplina> disciplinas;
    private int quantidadeMaximaInscricoesPorAluno;
    private double pesoCRE;
    private double pesoMediaDisciplina;

    public EditalMonitoria(Date dataInicioInscricoes, Date dataLimiteInscricoes, List<Disciplina> disciplinas, int quantidadeMaximaInscricoesPorAluno, double pesoCRE, double pesoMediaDisciplina) {
        this.dataInicioInscricoes = dataInicioInscricoes;
        this.dataLimiteInscricoes = dataLimiteInscricoes;
        this.disciplinas = disciplinas;
        this.quantidadeMaximaInscricoesPorAluno = quantidadeMaximaInscricoesPorAluno;
        this.pesoCRE = pesoCRE;
        this.pesoMediaDisciplina = pesoMediaDisciplina;
    }

    // Métodos para outras funcionalidades do EditalMonitoria
}
