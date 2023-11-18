import java.util.ArrayList;

public class Professor extends Pessoa {
    private String titulacao;
    private double salario;
    private ArrayList<Curso> cursos = new ArrayList<>();
    private ArrayList<Disciplina> disciplinas = new ArrayList<>();

    /**
     * @return the titulacao
     */
    public String getTitulacao() {
        return titulacao;
    }

    /**
     * @param titulacao the titulacao to set
     */
    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    /**
     * @return the salario
     */
    public double getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }

    /**
     * @return the cursos
     */
    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    /**
     * @param cursos the cursos to set
     */
    public void addCurso(Curso curso) {
        curso.addProfessor(this);
        cursos.add(curso);
    }
    
    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }
    
    public void addDisciplina(Disciplina disciplina) { // for adding one disciplina
        disciplina.addProfessor(this);
        disciplinas.add(disciplina);
    }
    
    public void addDisciplinas(ArrayList<Disciplina> disciplinas) { // for adding multiple disciplines in an array
        for(int i=0;i<disciplinas.size();i++) {
            this.addDisciplina(disciplinas.get(i));
        }
    }
    
    public void imprimir() {
        System.out.println("nome: "+getNome());
        System.out.println("cpf "+getCpf());
        System.out.println("email: "+getEmail());
        System.out.println("Endereco: "+getEndereco().getRua()+","+getEndereco().getCidade()+","+getEndereco().getEstado());
        System.out.println("titulacao: "+getTitulacao());
        System.out.println("salario: "+getSalario());
        System.out.println("telefones");
        for(int i=0;i<getTelefones().size();i++) {
            System.out.println(" "+getTelefones().get(i).getTipo());
            System.out.print("   "+getTelefones().get(i).getDdd());
            System.out.println(" "+getTelefones().get(i).getNumero());
        }
        System.out.println("Cursos");
        for(int i=0;i<cursos.size();i++) {
            System.out.println(" "+getCursos().get(i).getNome());
        }
        System.out.println("Disciplinas");
        for(int i=0;i<disciplinas.size();i++) {
            System.out.println(" "+getDisciplinas().get(i).getNome());
        }
    }
    public Professor(String nome, String cpf, String email, String titulacao, double salario, Endereco endereco, ArrayList<Telefone> telefones, ArrayList<Disciplina> disciplinas) {
        super(nome,cpf,email,endereco,telefones);
        this.titulacao = titulacao;
        this.salario = salario;
        this.addDisciplinas(disciplinas);
    }
    
    public Professor(String nome, String cpf, String email, String titulacao, double salario, Endereco endereco, ArrayList<Telefone> telefones) { // If willing to insert disciplinas manually
        super(nome,cpf,email,endereco,telefones);
        this.titulacao = titulacao;
        this.salario = salario;
    }
    
    public Professor(String nome, String cpf, String email, String titulacao, double salario, Endereco endereco) { // If willing to insert telefones and disciplinas manually
        super(nome,cpf,email,endereco);
        this.titulacao = titulacao;
        this.salario = salario;
    }
}

// definitely not made with GPT chat (ಠ╭╮ಠ)