/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatec;

import javax.swing.JOptionPane;

/**
 *
 * @author wesll
 */
public class Main {
    public static void main(String[] args) {
        SistemaAcademico sistema = new SistemaAcademico();
        Aluno a = new Aluno();
        boolean menu = true;
        String opcao = "";
        while (menu) {
            opcao = JOptionPane.showInputDialog("A - cadastrar alunos\n"
                    + "P - cadastrar professor\nE - excluir aluno\n"
                    + "D - excluir professor\nC - alterar aluno\n"
                    + "X - alterar professor\nP - pesquisar aluno\n"
                    + "S - pesquisar professor\nQ - sair");
            switch (opcao) {
                case "A": case "a":
                    
                    a.setNome(JOptionPane.showInputDialog("Digite o nome do aluno"));
                    a.setRa(JOptionPane.showInputDialog("Digite o RA do aluno"));
                    a.setCurso(JOptionPane.showInputDialog("Digite o Curso do aluno"));
                    a.setEndereco(JOptionPane.showInputDialog("Digite o Endereço do aluno"));
                    a.setTelefone(JOptionPane.showInputDialog("Digite o Telefone do aluno"));
                    a.setSexo(JOptionPane.showInputDialog("Digite o sexo do aluno"));

                    if (sistema.cadastrarAluno(a)) {
                        JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Erro ao cadastrar");
                    }
                    break;
                case "P":case "p":
                    Professor p = new Professor();
                    p.setNome(JOptionPane.showInputDialog("Digite o nome do professor"));
                    p.setMateria(JOptionPane.showInputDialog("Digite a materia do professor"));
                    p.setRegistro(JOptionPane.showInputDialog("Digite o registro do professor"));
                    p.setTelefone(JOptionPane.showInputDialog("Digite o telefone do professor"));
                    p.setSexo(JOptionPane.showInputDialog("Digite o sexo do (a) professor (a)"));
                    p.setEndereco(JOptionPane.showInputDialog("Digite o endereço do professor"));
                    if (sistema.cadastrarProfessor(p)) {
                        JOptionPane.showMessageDialog(null, "Cadastrado com sucesso");
                    } else {
                        JOptionPane.showMessageDialog(null, "Erro ao cadastrar");
                    }
                    break;
                case "E": case "e":
                    String ra = JOptionPane.showInputDialog("Digite o ra do aluno a alterar");
                    Aluno procura = sistema.pesquisarAluno(ra);
                    if(sistema.alterarAluno(procura)){
                        JOptionPane.showMessageDialog(null, "Aluno alterado com sucesso");
                    }else{
                        JOptionPane.showMessageDialog(null, "Erro ao alterar");
                    }
                    break;
                case "D": case "d":
                    String registro = JOptionPane.showInputDialog("Digite o registro do professor a alterar");
                    Professor procura = sistema.pesquisarProfessor(registro);
                    break;
                case "S": case "s":
                    
                    break;
                case "Q" : case "q":
                    return ;
            }
        }
    }

}
