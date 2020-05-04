/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatec;

/**
 *
 * @author FATEC
 */
public class AulaCompletaMenu {
    protected static String EscolhaMenu = "9";
     static float p1 = 0, p2 = 0, t1 = 0, t2 = 0, media = 0, mediafinal = 0;
    public static void main(String[] args) {
        System.out.println("Aula 16/0818 - JAVA SE - TARDE");
        MainMenu();
    }

    private static void GUIMenu(){
        javax.swing.JOptionPane.showInputDialog("Digite o exercicio Desejado \n")
    }
    
    private static void Menu(char c) {
        switch(c){
            case '1':
                System.out.println("\n\nExercício média #################");
                
                break;
            case '2': 
                System.out.println("\n\nExercício Ajuste #################");
                break;
            case '0':
                System.out.flush();
                System.out.println("Encerrando....");
                break;
            default:
                System.out.println("Escolha inválida!!!");
                System.out.flush();
                MainMenu();
                break;
        }
    }

    private static void MainMenu() {
        char c = ' ';
        do{
        System.out.println("Escolha o exercicio: \n1 - Media Fatec\n2 - Ajuste de Preço\n0 - Sair\n:");
        java.util.Scanner reader = new java.util.Scanner(System.in);
        if(reader.hasNext())EscolhaMenu = reader.nextLine();
        c = EscolhaMenu.trim().charAt(0);
        Menu(c);
        }while(c != '0');
    }
}
