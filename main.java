import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        // creating lists
        ArrayList<Curso> cursos = new ArrayList<>();
        ArrayList<Disciplina> disciplinas = new ArrayList<>();
        ArrayList<Professor> professores = new ArrayList<>();
        ArrayList<Aluno> alunos = new ArrayList<>();
        
        ArrayList<Endereco> enderecos = new ArrayList<>();
        ArrayList<Telefone> telefones = new ArrayList<>();
        
        // populating tables
        
        // cursos
        cursos.add(new Curso("ADS"));   // index[0]
        cursos.add(new Curso("CS"));    // index[1]
        cursos.add(new Curso("SE"));    // index[2]
        cursos.add(new Curso("Math"));  // index[3]
        cursos.add(new Curso("CE"));    // index[4]
        
        
        // disciplinas
        disciplinas.add(new Disciplina("algebra linear")); // index[0]
        disciplinas.add(new Disciplina("algoritmos"));     // index[1]
        disciplinas.add(new Disciplina("calculo I"));      // index[2]
        disciplinas.add(new Disciplina("Topologia"));      // index[3]
        disciplinas.add(new Disciplina("Automatos"));      // index[4]
        disciplinas.add(new Disciplina("Circuitos"));      // index[5]
        
        
        // enderecos
        enderecos.add(new Endereco("Alameda Andorinhas","angra dos reis","Rio de Janeiro"));        // index[0]
        enderecos.add(new Endereco("Alameda Araras","angra dos reis","Rio de Janeiro"));            // index[1]
        enderecos.add(new Endereco("Alameda Beija Flores","angra dos reis","Rio de Janeiro"));      // index[2]
        enderecos.add(new Endereco("Alameda das Fragatas","Angra dos Reis","Rio de Janeiro"));      // index[3]
        enderecos.add(new Endereco("Alameda das Gaivotas","Angra dos Reis","Rio de Janeiro"));      // index[4]
        enderecos.add(new Endereco("Alameda dos Colibris","Angra dos Reis","Rio de Janeiro"));      // index[5]
        enderecos.add(new Endereco("Alameda Luiza Angelica","Angra dos Reis","Rio de Janeiro"));    // index[6]
        enderecos.add(new Endereco("Alameda Indústria","Angra dos Reis","Rio de Janeiro"));         // index[7]
        enderecos.add(new Endereco("Alameda Gavioes","Angra dos Reis","Rio de Janeiro"));           // index[8]
        enderecos.add(new Endereco("Alameda Sabias","Angra dos Reis","Rio de Janeiro"));            // index[9]
        
        
        // telefones
        telefones.add(new Telefone("celular","24","99111-1111"));   // index[0]
        telefones.add(new Telefone("fixo","24","1111-1112"));       // index[1]
        telefones.add(new Telefone("celular","24","99111-1113"));   // index[2]
        telefones.add(new Telefone("fixo","24","1111-1114"));       // index[3]
        telefones.add(new Telefone("celular","24","99111-1115"));   // index[4]
        telefones.add(new Telefone("fixo","24","1111-1116"));       // index[5]
        telefones.add(new Telefone("celular","24","99111-1117"));   // index[6]
        telefones.add(new Telefone("fixo","24","1111-1118"));       // index[7]
        telefones.add(new Telefone("celular","24","99111-1119"));   // index[8]
        telefones.add(new Telefone("fixo","24","1111-1121"));       // index[9]
        telefones.add(new Telefone("celular","24","99111-1122"));   // index[10]
        telefones.add(new Telefone("fixo","24","1111-1123"));       // index[11]
        telefones.add(new Telefone("celular","24","99111-1124"));   // index[12]
        telefones.add(new Telefone("fixo","24","1111-1125"));       // index[13]
        telefones.add(new Telefone("celular","24","99111-1126"));   // index[14]
        telefones.add(new Telefone("fixo","24","1111-1127"));       // index[15]
        telefones.add(new Telefone("celular","24","99111-1128"));   // index[16]
        telefones.add(new Telefone("fixo","24","1111-1129"));       // index[17]
        
        
        int i = 0; // to keep the counting of enderecos
        // professores
        professores.add(new Professor("Caio","031.001.010-01","caio.castro@mail.com","especialista",7500.0f,enderecos.get(i++)));   // index[0]
        professores.add(new Professor("Lara","031.001.010-02","lara.croft@mail.com","mestre",7750.0f,enderecos.get(i++)));          // index[1]
        professores.add(new Professor("Jack","031.001.010-03","jack.trades@mail.com","especialista",8000.0f,enderecos.get(i++)));   // index[2]
        professores.add(new Professor("Leonardo","031.001.010-04","leonardo.vinte@mail.com","doutor",10000.0f,enderecos.get(i++)));
        professores.add(new Professor("Gary","031.001.010-05","gary.carvalho@mail.com","mestre",8100.0f,enderecos.get(i++)));
        
        
        // alunos
        alunos.add(new Aluno("Julia","001.001.001-06","julia.ferreira@mail.com",9.5f,enderecos.get(i++)));          // index[0]
        alunos.add(new Aluno("Ana","001.001.001-07","ana.julia@mail.com",8.8f,enderecos.get(i++)));                 // index[1]
        alunos.add(new Aluno("Cristovao","001.001.001-08","cristovao.ronaldo@mail.com",9.7f,enderecos.get(i++)));   // index[2]
        alunos.add(new Aluno("Lily","001.001.001-09","lily.valley@mail.com",9.0f,enderecos.get(i++)));              // index[3]
        
        
        // relating each element with other elements from other tables
        int j =0;   // to keep track of telephone distribution
        // professores -> telefones
        for(i=0;i<professores.size();i++) {
            professores.get(i).addTelefone(telefones.get(j++));
            professores.get(i).addTelefone(telefones.get(j++));
        }
        for(i=0;i<alunos.size();i++) {
            alunos.get(i).addTelefone(telefones.get(j++));
            alunos.get(i).addTelefone(telefones.get(j++));
        }
        
        
        // cursos <-> disciplinas
        cursos.get(0).addDisciplina(disciplinas.get(1));    // ADS has disciplina algoritmos
        cursos.get(0).addDisciplina(disciplinas.get(3));    // ADS has disciplina topologia
        
        cursos.get(1).addDisciplina(disciplinas.get(0));    // CS has disciplina algebra linear
        cursos.get(1).addDisciplina(disciplinas.get(1));    // CS has disciplina algoritmos
        cursos.get(1).addDisciplina(disciplinas.get(2));    // CS has disciplina calculo I
        cursos.get(1).addDisciplina(disciplinas.get(3));    // CS has disciplina topologia
        cursos.get(1).addDisciplina(disciplinas.get(4));    // CS has disciplina automatos
        
        cursos.get(2).addDisciplina(disciplinas.get(0));    // SE has disciplina algebra linear
        cursos.get(2).addDisciplina(disciplinas.get(1));    // SE has disciplina algoritmos
        cursos.get(2).addDisciplina(disciplinas.get(2));    // SE has disciplina calculo I
        cursos.get(2).addDisciplina(disciplinas.get(4));    // SE has disciplina automatos
        
        cursos.get(3).addDisciplina(disciplinas.get(0));    // Math has disciplina algebra linear
        cursos.get(3).addDisciplina(disciplinas.get(2));    // Math has disciplina calculo I
        cursos.get(3).addDisciplina(disciplinas.get(3));    // Math has disciplina topologia
        
        cursos.get(4).addDisciplina(disciplinas.get(0));    // CE has disciplina algebra linear
        cursos.get(4).addDisciplina(disciplinas.get(1));    // CE has disciplina algoritmos
        cursos.get(4).addDisciplina(disciplinas.get(2));    // CE has disciplina calculo I
        cursos.get(4).addDisciplina(disciplinas.get(3));    // CE has disciplina topologia
        cursos.get(4).addDisciplina(disciplinas.get(4));    // CE has disciplina automatos
        cursos.get(4).addDisciplina(disciplinas.get(5));    // CE has disciplina circuitos
        
        
        // professores <-> cursos
        professores.get(0).addCurso(cursos.get(1)); // castro is related to computer science
        professores.get(0).addCurso(cursos.get(3)); // castro is related to mathematics
        professores.get(1).addCurso(cursos.get(0)); // Lara is related to Analise e desenvolvimento de sistemas
        professores.get(1).addCurso(cursos.get(1)); // Lara is related to software engineering
        professores.get(1).addCurso(cursos.get(2)); // Lara is related to computer science
        professores.get(2).addCurso(cursos.get(1)); // Jack is related to computer science
        professores.get(2).addCurso(cursos.get(4)); // Jack is related to computer engineering
        
        
        // professores <-> disciplinas
        for(i = 0; i<professores.size();i++){   // setting all disciplinas from professores to be equal to the disciplinas in their cursos
            for(j = 0; j<professores.get(i).getCursos().size();j++) {
                professores.get(i).addDisciplinas(professores.get(i).getCursos().get(j).getDisciplinas());
            }
        }
        
        
        // alunos <-> cursos
        for(i = 0; i<alunos.size(); i++) { // relating linearly alunos and cursos with repetition structure because laziness
            alunos.get(i).setCurso(cursos.get(i));
        }
        
        
        // alunos <-> disciplinas
        for(i = 0; i<alunos.size();i++) {   // setting all disciplinas from alunos to be equal to the disciplinas in their curso
            alunos.get(i).addDisciplinas(alunos.get(i).getCurso().getDisciplinas());
        }
        
        
        // queries
        alunos.get(0).imprimir();
        professores.get(0).imprimir();
        cursos.get(0).imprimirCurso();
        disciplinas.get(0).imprimir();
    }
}

// definitely not made with GPT chat (T - T)