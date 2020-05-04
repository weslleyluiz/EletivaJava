package br.com.fatec;

import javax.swing.JOptionPane;

/*
 * java.lang == biblioteca padrão do java
 */
/**
 * github.com/wesgl
 *
 * @author Weslley Luiz
 */
public class MediaFatec {
    static float p1 = 0, p2 = 0, t1 = 0, t2 = 0, media = 0, mediafinal = 0;
    /**
     * Operadores aritméticos: + - * / % (% = resto) Operadores unarios ++ -- +=
     * -= /= *= %= Operadores Relacionais : == > != < =< => ** Operadores
     * Lógicos : && || !
     *
     * @param: String array with arguments
     */
//    public static void main(String[] args) { 
////        System.out.println(MediaFatec());
//        ConsoleMediaFatec();
//    }

    protected static String MediaFatec() {
       
        try {
            p1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota da prova 1:"));
            if (p1 > 10) {
                JOptionPane.showMessageDialog(null, "Nota maior que 10. ");
                MediaFatec();
            }
            p2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota da prova 2:"));
            if (p2 > 10) {
                JOptionPane.showMessageDialog(null, "Nota maior que 10. ");
                MediaFatec();
            }
            t1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota do trabalho 1:"));
            if (t1 > 10) {
                JOptionPane.showMessageDialog(null, "Nota maior que 10. ");
                MediaFatec();
            }
            t2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota do trabalho 2:"));
            if (t2 > 10) {
                JOptionPane.showMessageDialog(null, "Nota maior que 10. ");
                MediaFatec();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "erro, faça de novo!");
            ResetVars();
            return "erro";
        }
        media = ((((p1 + p2)*.3f )+ ((t1 + t2)*.3f)) / 2);
        mediafinal = (media + Float.parseFloat(JOptionPane.showInputDialog("Digite a nota de recuperação : "))) / 2;
        JOptionPane.showMessageDialog(null, media);
        if (media >= 6.0) 
            return ("aprovado com média =>" + media);  
        return MediaFinal(mediafinal); 
    }
    protected static String MediaFinal(float mediafinal){
        System.out.println("recuperação ou exame");
        if(mediafinal >= 6.0)
            return "Aprovado";
        return "Reprovado";
    }
    protected static void testeScanner(){
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Printing the file passed in:");
        while(sc.hasNextLine()) System.out.println(sc.nextLine());
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
