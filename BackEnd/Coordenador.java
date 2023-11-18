package BackEnd;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Coordenador extends Usuario {
	private List<EditalMonitoria> editais;

	public Coordenador(String nome, String email, String senha) {
		super(nome, email, senha);
		this.editais=new ArrayList<>();
	}
	//Métodos que o coordenador pode fazer
	public void infomarDataInicio() {
		
	}
	public void dataLimite() {
		
	}
	public void vagasDisciplina() {
		
	}
	public void alunoPorDisciplina() {
		
	}
	public void formulaCRE() {
	
	}
	public void cadastrarEditalMonitoria(Date dataInicio, Date dataLimite, List<Disciplina> disciplinas, int maxInscricoesPorAluno, double pesoCRE, double pesoMediaDisciplina) {
        EditalMonitoria edital = new EditalMonitoria(dataInicio, dataLimite, disciplinas, maxInscricoesPorAluno, pesoCRE, pesoMediaDisciplina);
        editais.add(edital);
    }
}



	