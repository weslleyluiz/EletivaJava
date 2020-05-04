package br.com.fatec;

import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;

/**
 *
 * @author wesll
 */
public class SistemaAcademico {
//    private Aluno[] alunos;
//    private Professor[] professores;
//    private LinkedList alunosLinkedList = new LinkedList();
//    private LinkedList professoresLinkedList = new LinkedList();

    private ArrayList<Aluno> alunos;
    private ArrayList<Professor> professores;

    
    
    
    
    private HashMap<String,Aluno> hashAlunos;
    
    public SistemaAcademico() {
        alunos = new ArrayList();
        professores = new ArrayList();
        hashAlunos = new HashMap<>();
    }

   
    public boolean cadastrarAluno(Aluno a) {
//        Aluno[] alunoCopia;
//        for (int i = 0; i < alunos.length; i++) {
//            if(alunos[i] == null){
//                alunos[i] = a;
//                return true;
//            }else{
//                alunoCopia = alunos;
//                alunos = new Aluno[alunoCopia.length * 2];
//                alunos = alunoCopia;
//                alunos[i+1] = a;
//                return true;
//            }
//        }
//        return false; 
        return alunos.add(a);
    }

    public boolean cadastrarProfessor(Professor p) {
//        for (int i = 0; i < professores.length;i++){
//            if(professores[i] == null){
//                professores[i] = p;
//                return true;
//            }
//        }
//        return false;
        
        return professores.add(p);
    }

    public boolean excluirAluno(Aluno a) {
//        for (int i = 0; i < alunos.length; i++) {
//            if(alunos[i].equals(a)){
//                alunos[i] = null;
//                return true;
//            }
//        }
        for (Object aluno : alunos) {
            if (((Aluno) aluno).equals(a)) {
                return alunos.remove(aluno);
            }
        }
        return false;
    }

    public boolean excluirProfessor(Professor p) {
//        for (int i = 0; i < professores.length; i++) {
//            if(professores[i].equals(p)){
//                professores[i] = null;
//                return true;
//            }
//        }
//        return false;
        for (Object prof : professores) {
            if (((Professor) prof).equals(p)) {
                return professores.remove(prof);
            }
        }
        return false;
    }

    public boolean alterarAluno(Aluno a) {
        for (Object aluno : alunos) {
            if (((Aluno) aluno).equals(a)) {
                int index = alunos.indexOf(aluno);
                Aluno novo = new Aluno();
                novo.setNome(JOptionPane.showInputDialog("Digite o nome do aluno"));
                novo.setCurso(JOptionPane.showInputDialog("Digite o Curso do aluno"));
                novo.setEndereco(JOptionPane.showInputDialog("Digite o Endereço do aluno"));
                novo.setTelefone(JOptionPane.showInputDialog("Digite o Telefone do aluno"));
                novo.setSexo(JOptionPane.showInputDialog("Digite o sexo do aluno"));
                alunos.set(index, novo);
                return true;
            }
        }
        return false;
    }

    public Aluno pesquisarAluno(String ra) {
//        for (Aluno aluno : alunos) {
//            if (aluno.getRa().equals(ra)) {
//                return aluno;
//            }
//        }
//        return null;
        for (Object x : alunos) {
            if (((Aluno) x).getRa().equals(ra)) {
                return (Aluno) x;
            }
        }
        return null;
    }

    private Professor pesquisarProfessor(String registro) {
        for (Professor prof : professores) {
            if(prof.getRegistro().equals(registro)){
                return prof;
            }
        }
        return null;
    }
}
