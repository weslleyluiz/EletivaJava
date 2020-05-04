package exerc_java;
import javax.swing.JOptionPane;
//import java.util.Scanner;


    public class Exerc_java
    {
    /*{
            public static void main(String[] args) {
            double valor1, valor2, resul;
            BigDecimal bd1, bd2, bdr;
            bd1= new BigDecimal("0.1");
            bd2 = new BigDecimal("1.2");
            bdr=bd1.add(bd2);
            System.out.println(bdr.toString());
        }*/
      public static void main(String[] args) 
        {      
            String escolha;
            boolean condicao = true;
            while(condicao)
            {
                escolha = (JOptionPane.showInputDialog(null,"Digite um numero correspondente ao que deseja calcular\n\n 1- Media Fatec\n 2- Ajuste de Preco\n 3- Fibonaci (do/while)\n 4- Fibonaci(while)\n 5- Fibonaci(for)\n 6- Fatorial(do/while)\n 7- Fatorial(while)\n 8-Fatorial(for)\n 9- P.A\n 10- P.G\n 11-Fibonaci(recursivo)\n 12-Fatorial(recursivo)\n 13-Sair\n\n"));
                switch(escolha)
                { 
                case "1":
                    media Alunomedia = new media(); // media = nome da classe, Alunomedia objeto
                    Alunomedia.mediaAluno(); // media aluno método
                    break;

                case "2":
                    desconto desc = new desconto();
                    desc.descontaoAluno();
                    break;

                case "3":
                    fibonacci.fiboDoWhile();
                    break;

                case "4":              
                    fibonacci.fiboWhile();
                    break;  

                case "5":       
                    fibonacci.fiboFor();
                    break;

                case "6":
                    fatorial.fatorialDo();
                    break; 

                case "7":
                    fatorial.fatorialWhile();
                    break;

                case "8":
                   fatorial.fatorialFor();
                   break;

                case "9":
                    pa calculopa = new pa();
                    calculopa.pA();
                    break;

                case "10":
                    pg calculopg = new pg();
                    calculopg.pg();
                    break;

                case "11":
                    int numero = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um numero para o calculo do Fatorial!!!")); 
                    JOptionPane.showMessageDialog(null, fibonacci.f_rec(numero));
                    break;

                case "12":
                    int fat = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um numero para o calculo do Fatorial!!!")); 
                    JOptionPane.showMessageDialog(null, fatorial.fat_rec(fat));
                    break;

                case "13":
                    condicao = false;
                    break;

                default: JOptionPane.showMessageDialog(null, "Opção inválida!");
                }
            }
        }
    }


    
 
