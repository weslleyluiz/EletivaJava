package br.com.fatec;

/*
 * Matrizes
 * soma()
 * sub()
 * multiplicação por escalar()
 * multiplicação de matrizes()
 * matriz inversa()
 * determinante()
 */
/**
 *
 * @author wesll
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Matriz m = new Matriz();
        m.setValue(Matriz2());
        m.multiply(Matriz1());
//        
        int[][] matrizIrregular = new int[10][];
        for (int i = 0; i < matrizIrregular.length; i++)
            matrizIrregular[i] = new int[i];
        
        for (int i = 0; i < matrizIrregular.length; i++) {
            for (int j = 0; j < matrizIrregular[i].length; j++) {
                matrizIrregular[i][j] = i;
            }
        }
        for ( int i = 0; i < matrizIrregular.length; i++){
            for (int j = 0; j < matrizIrregular[i].length; j++){
                System.out.print(matrizIrregular[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int[][] Matriz1(){
        int[][] retrn = new int [2][2];
        for (int i = 0; i < retrn.length; i++) {
            for(int j = 0; j < retrn[i].length; j++){
                retrn[i][j] = i;
            }
        }
        return retrn;
    }
    public static int[][] Matriz2(){
        int[][] retrn = new int[2][2];
        for (int i = 0; i < retrn.length; i++) {
            for(int j = 0; j < retrn[i].length; j++){
                retrn[i][j] = j+i;
            }
        }
        return retrn;
    }
}
