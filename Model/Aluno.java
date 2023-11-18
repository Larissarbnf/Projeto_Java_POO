package BackEnd;

public class Aluno extends Usuario {
	private String matricula;
	private double creAtual;
	private double mediaDisciplina;
	
	public Aluno (String nome, String email, String senha, String matricula) {
		super(nome, email, senha);
		this.matricula=matricula;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public double getCreAtual() {
		return creAtual;
	}
	public void setCreAtual(double creAtual) {
		this.creAtual = creAtual;
	}
	public double getMediaDisciplina() {
		return mediaDisciplina;
	}
	public void setMediaDisciplina(double mediaDisciplina) {
		this.mediaDisciplina = mediaDisciplina;
	}
	
	//Métodos que o aluno pode fazer 
	
	public void inscrever() {
	}
	public void desistir() {	
	}
	public void visualizarResultado() {
	
	}
}
