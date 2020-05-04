package br.com.fatec;
import java.util.Scanner;
import java.util.StringTokenizer;
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
        Scanner s = new Scanner(System.in);
        
        int[] vetor;
        vetor = new int[10];
        vetor = new int[] {1,2,3,4,5,6,7,8,9,10};
        Numero n = new Numero();
        n.leValores();
        System.out.println("menor =>");
        System.out.println(n.achaMenor());
        System.out.println("maior =>");
        System.out.println(n.achaMaior());
        n.multiplicaValor(3);
        System.out.println("lista = >");
        n.mostraValores();
        n.ordenaValores();
        System.out.println("Lista Ordenada =>");
        n.mostraValores();
        
    }
    public void exemploToken(){
        String aux = "10 20 30 40";
        StringTokenizer stoken = new StringTokenizer(aux);
        int[] vetor = new int[stoken.countTokens()];
        for (int i = 0; i < vetor.length; i++)
            vetor[i] = Integer.parseInt(stoken.nextToken());
        
        for (int j = 0; j < vetor.length; j++)
            System.out.println(vetor[j]);
    }
    public void exExpressaoRegular(){
        String a = "10aa20aa24aaa50";
        String b = "10aab20aaab";
        String c = "10aabb20aaaa40aaab40abb30a60";
        String d = "10ababa11ababab13ababab15ababab18ababab20abab";
        String e = "10a20b11a21b30";
        String f = "1x2a3b49c";
        System.out.println(a.split("a+"));
        System.out.println(c.split("a+b*"));
        System.out.println(b.split("a+b+"));
        System.out.println(d.split("(ab)+"));
        System.out.println(e.split("a|b"));
        System.out.println(f.split("[a-z]"));
    }
    public void exFor(){
        String[] x = new String[]{ "as", "ab", "ac", "ad", "af"};
        for(String s: x){
            System.out.println(s);
        }
    }
}