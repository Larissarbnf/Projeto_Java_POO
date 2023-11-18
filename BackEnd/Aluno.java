package BackEnd;

public class Aluno extends Usuario {
	private String matricula;
	private double CRE;
	private double notaDisciplina;
	
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
	
	//Métodos que o aluno pode fazer 
	
	public void inscrever() {
	}
	public void desistir() {	
	}
	public void visualizarResultado() {
	
	}
}
