import java.util.ArrayList;

public class Aluno extends Pessoa{
    private double notas;
    private Curso curso;
    private ArrayList<Disciplina> disciplinas = new ArrayList<>();

    /**
     * @return the notas
     */
    public double getNotas() {
        return notas;
    }

    /**
     * @param notas the notas to set
     */
    public void setNotas(double notas) {
        this.notas = notas;
    }

    /**
     * @return the curso
     */
    public Curso getCurso() {
        return curso;
    }

    /**
     * @param curso the curso to set
     */
    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    
    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }
    
    public void addDisciplina(Disciplina disciplina) { // for adding one disciplina
        disciplina.addAluno(this);
        disciplinas.add(disciplina);
    }
    
    public void addDisciplinas(ArrayList<Disciplina> disciplinas) { // for adding a array of disciplinas
        for(int i = 0; i<disciplinas.size(); i++) {
            this.addDisciplina(disciplinas.get(i));
        }
    }
    
    public void imprimir() {
        System.out.println("nome: "+getNome());
        System.out.println("cpf "+getCpf());
        System.out.println("email: "+getEmail());
        System.out.println("Endereco: "+getEndereco().getRua()+","+getEndereco().getCidade()+","+getEndereco().getEstado());
        System.out.println("Curso: "+getCurso().getNome());
        System.out.println("notas: "+getNotas());
        System.out.println("telefones");
        for(int i=0;i<getTelefones().size();i++) {
            System.out.println(" "+getTelefones().get(i).getTipo());
            System.out.print("   "+getTelefones().get(i).getDdd());
            System.out.println(" "+getTelefones().get(i).getNumero());
        }
        System.out.println("Disciplinas");
        for(int i=0;i<disciplinas.size();i++) {
            System.out.println(" "+getDisciplinas().get(i).getNome());
        }
    }
    
    public Aluno(String nome, String cpf, String email, double notas, Endereco endereco, ArrayList<Telefone> telefones) {
        super(nome,cpf,email,endereco,telefones);
        this.notas = notas;
    }
    public Aluno(String nome, String cpf, String email, double notas, Endereco endereco) { // if willing to add telefones manually
        super(nome,cpf,email,endereco);
        this.notas = notas;
    }
}

// definitely not made with GPT chat (❍ᴥ❍)