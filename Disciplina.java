import java.util.ArrayList;

public class Disciplina {
    private String nome;
    private ArrayList<Aluno> alunos = new ArrayList<>();
    private ArrayList<Professor> professores = new ArrayList<>();
    private ArrayList<Curso> cursos = new ArrayList<>();

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the alunos
     */
    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    /**
     * @param aluno the alunos to set
     */
    public void addAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    /**
     * @return the professores
     */
    public ArrayList<Professor> getProfessores() {
        return professores;
    }

    /**
     * @param professor the professores to set
     */
    public void addProfessor(Professor professor) {
        professores.add(professor);
    }
    
    public void addProfessores(ArrayList<Professor> professores) {
        for(int i = 0;i<professores.size();i++) {
            professores.get(i).addDisciplina(this);
        }
    }

    /**
     * @return the cursos
     */
    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    /**
     * @param curso the cursos to set
     */
    public void addCurso(Curso curso) {
        cursos.add(curso);
    }
    
    public void addCursos(ArrayList<Curso> cursos) {
        for(int i = 0;i<cursos.size();i++) {
            cursos.get(i).addDisciplina(this);
        }
    }
    
    public void imprimir() {
        System.out.println("Cursos");
        for(int i=1;i<getCursos().size();i++) {
            System.out.println(" "+getCursos().get(i).getNome());
        }
        System.out.println("Professores");
        for(int i=1;i<getProfessores().size();i++) {
            System.out.println(" "+getProfessores().get(i).getNome());
        }
        System.out.println("Alunos");
        for(int i=1;i<getAlunos().size();i++) {
            System.out.println(" "+getAlunos().get(i).getNome());
        }
    }
    
    public Disciplina(String nome) { //If willing to add cursos and professores manually
        this.nome = nome;
    }
    
    public Disciplina(String nome, ArrayList<Curso> cursos, ArrayList<Professor> professores) {
        this.nome = nome;
        this.addProfessores(professores);
        this.addCursos(cursos);
    }
}

// definitely not made with GPT chat (• ◡•)