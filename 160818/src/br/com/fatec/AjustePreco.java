/*
 * ler preço e aplicar um desconto de acordo com a tabela:
 * a => 5 %
 * b => 8 %
 * c => 15 %
 * d => 25%
 * e => 40%
 */
package br.com.fatec;
import java.util.Scanner;
/** 
 * @author Weslley Luiz
 */
public class AjustePreco {
    static String produto = "";
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Insira o preço do produto a seguir:");
        if (reader.hasNextLine()) produto = reader.nextLine(); 
        System.out.println("Selecione o desconto a seguir: ");
        System.out.println("a => 5 %");
        System.out.println("b => 8 %");
        System.out.println("c => 15 %");
        System.out.println("d => 25%");
        System.out.println("e => 40%");
        String opcao1 = " ";
        if (reader.hasNext()) opcao1 = reader.nextLine();
            System.out.println("");
    }
    
    protected static void ConsoleMediaFatec() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        try{
        System.out.println("Média da aula de eletiva 1: \nNotas de:\n\t Prova 1 e 2\n\tTrabalho 1 e 2");
        System.out.println("Digite a nota da prova 1 : \n");
        if(sc.hasNextLine()){
            p1 = Float.parseFloat(sc.nextLine());
            if(p1 > 10.0){
                System.out.println("Nota maior que permitido! recomece toda a operação!");
                System.out.flush();
            }
        }
        System.out.println("Digite a nota da prova 2 : \n");
        if(sc.hasNextLine()){
            p2 = Float.parseFloat(sc.nextLine());
            if(p2 > 10.0){
                System.out.println("Nota maior do que o válido. Insira nota de 0 ~ 10!");
                ConsoleMediaFatec();
            }
        }
        System.out.println("Digite a nota do trabalho 1 : \n");
        if(sc.hasNextLine()){
            t1 = Float.parseFloat(sc.nextLine());
            if(t1 > 10.0){
                
            }
        }
        System.out.println("Digite a nota do trabalho 2 : \n");
        if(sc.hasNextLine()){
            t2 = Float.parseFloat(sc.nextLine());
            if(t2 > 10.0){
                
            }
        }
        }
        catch(Exception e){
            System.out.println("Erro. Comece novamente!!");
        }
    }

    private static void ResetVars() {
         p1 = 0; p2 = 0; t1 = 0; t2 = 0; media = 0; mediafinal = 0;
    }
}
