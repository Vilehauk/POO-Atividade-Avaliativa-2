import java.util.ArrayList;

public class Curso {
    private String nome;
    private ArrayList<Professor> professores = new ArrayList<>();
    private ArrayList<Disciplina> disciplinas = new ArrayList<>();

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
     * @return the professores
     */
    public ArrayList<Professor> getProfessores() {
        return professores;
    }

    /**
     * @param professores the professores to set
     */
    public void addProfessor(Professor professor) {
        professores.add(professor);
    }
    
    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }
    
    public void addDisciplina(Disciplina disciplina) {
        disciplina.addCurso(this);
        disciplinas.add(disciplina);
    }
    
    public void addDisciplinas(ArrayList<Disciplina> disciplinas) {
        for(int i=0;i<disciplinas.size();i++) {
            this.addDisciplina(disciplinas.get(i));
        }
    }
    
    public void imprimirCurso() {
        System.out.println("nome: "+getNome());
        System.out.println("professores");
        for(int i = 0;i<professores.size();i++) {
            System.out.println(" "+getProfessores().get(i).getNome());
        }
    }
    
    public Curso(String nome) {
        this.nome = nome;
    }
    
    public Curso(String nome, ArrayList<Disciplina> disciplinas) { // this override allows to straight-forwardly add disciplinas directly into the constructor
        this.nome = nome;
        this.addDisciplinas(disciplinas);
    }
}
// definitely not made with GPT chat (¬‿¬)