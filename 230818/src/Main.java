/*
 * Menu
 * 1 - Media fatec
 * 2 - Ajuste de preco
 * 3 - Fibonacci ( do/while ) 
 * 4 - Fibonacci ( while ) 
 * 5 - Fibonacci ( for )
 * 6 - Fibonacci ( Recursividade ) 
 * 7 - Fatorial (do/while)
 * 8 - Fatorial (while)
 * 9 - Fatorial (for)
 * 10 - Fatorial (Recursividade)
 * 11 - PA
 * 12 - PG
 * 13 - Sair
 */
import javax.swing.JOptionPane;
/**
 *
 * @author Fatec
 */
public class Main {

    protected static boolean enterMenu = true;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        while(enterMenu){
            Menu(); 
        }
    }
    
    protected static void Menu(){
        String escolha = "0";
        JOptionPane.showMessageDialog(null,"Aula 23-08");
        escolha = JOptionPane.showInputDialog("Menu\n"
                + "1 - Media fatec\n"
                + "2 - Ajuste de preco\n"
                + "3 - Fibonacci ( do/while ) \n"
                + "4 - Fibonacci ( while ) \n"
                + "5 - Fibonacci ( for )\n"
                + "6 - Fibonacci (Recursividade)\n"
                + "7 - Fatorial (while)\n"
                + "8 - Fatorial (do - while)"
                + "9 - Fatorial (for)"
                + "10 - Fatorial (Recursividade)\n"
                + "11 - PA\n"
                + "12 - 10 - PG\n"
                + "13 - Sair"); 
        if(null != escolha)switch (escolha) {
            case "1":case "01":
                JOptionPane.showMessageDialog(null,MediaFatec());
                break;
            case "2":case "02":
                AjustePreco();
                break;
            case "3":case "03":
                int f = Integer.parseInt(JOptionPane.showInputDialog("Digite o termo fibonacci desejado:"));
                JOptionPane.showMessageDialog(null, FibbonaciDoW(f));
                break;
            case "4":case "04":
                int h = Integer.parseInt(JOptionPane.showInputDialog("Digite qual o termo fibonacci desejado"));
                JOptionPane.showMessageDialog(null,FibbonaciWhile(h));
                break;
            case "5":case "05":
                int i = Integer.parseInt(JOptionPane.showInputDialog("Digite qual o termo fibonacci desejado"));
                FibbonaciFor(i);
                break;
            case "6":case "06":
                int j = Integer.parseInt(JOptionPane.showInputDialog("Digite qual o termo fibonacci desejado"));
                JOptionPane.showMessageDialog(null,"termo desejado: "+j+ "\n valor => "+FibbonaciRecursivo(j-1));;
                break;
            case "7":case "07":
                int l = Integer.parseInt(JOptionPane.showInputDialog("Digite o termo fatorial desejado:"));
                JOptionPane.showMessageDialog(null, "termo desejado: "+l+ "\nvalor => "+ FatorialWhile(l));
                break;
            case "8":case "08":
                int m = Integer.parseInt(JOptionPane.showInputDialog("Digite o termo fatorial desejado:"));
                JOptionPane.showMessageDialog(null, "termo desejado: "+m+"\nvalor => "+FatorialDoW(m));
                break;
            case "9":case "09":
                int n = Integer.parseInt(JOptionPane.showInputDialog("Digite o termo fatorial desejado:"));
                JOptionPane.showMessageDialog(null, "termo desejado: "+n+"\nvalor => "+FatorialFor(n));
                break;
            case "10":
                int o = Integer.parseInt(JOptionPane.showInputDialog("Digite o termo fatorial desejado:"));
                JOptionPane.showMessageDialog(null, "termo desejado: "+o+"\nvalor => "+FatorialRecursivo(o));
                break;
            case "11":break;
            case "12":break;
            case "13":
                JOptionPane.showMessageDialog(null, "Saindo!"); 
                enterMenu = false;
                return;
            default:
                break;
        }
        Menu();
    }
    //Vars to MediaFatec and MediaFinal methods
    static float p1 = 0, p2 = 0, t1 = 0, t2 = 0, media = 0, mediafinal = 0;
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
    private static void ResetVars() {
         p1 = 0; p2 = 0; t1 = 0; t2 = 0; media = 0; mediafinal = 0;
    }
    //Methods and vars to ajuste preço
    protected static void AjustePreco(){
        float preco;
        String desconto;
        try {
            preco = Float.parseFloat(JOptionPane.showInputDialog("Digite o Valor do Preco"));
            desconto = JOptionPane.showInputDialog("Escolha um dos seguintes descontos:"
                    + "a => 5 %"
                    + "b => 8 %"
                    + "c => 15 %"
                    + "d => 25%"
                    + "e => 40%");
            float calculo = 0f;
            if(null != desconto)switch(desconto){
                case "a":
                    calculo = preco * 0.05f;
                    break;
                case "b":
                    calculo = preco * 0.08f;
                    break;
                case "c":
                    calculo = preco * 0.15f;
                    break;
                case "d":
                    calculo = preco * 0.25f;
                    break;
                case "e":
                    calculo = preco * 0.4f;
                    break;
                
                default:
                    JOptionPane.showConfirmDialog(null, "Escolha não listada");
                    AjustePreco();
                    break;
            }
            
            JOptionPane.showMessageDialog(null, "Preço => " + (calculo));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro, tente novamente");
            AjustePreco();
        }
    }
      
    protected static int FibbonaciFor(int termo){
        try {
            int[] fib = new int[(termo+1)];
            for (int i = 0; i < termo; i++) 
                fib[i] = 0; 
            fib[0] = 0;
            fib[1] = 1;  
            for(int i = 2; i<=termo;i++){
                fib[i] = fib[i-1] + fib[i-2]; 
            } 
             
            JOptionPane.showMessageDialog(null,"termo "+termo+" =>"+ fib[termo-1]);
            return fib[termo];
        } catch (Exception e) {
            System.out.println(e);
            return 0;
        }
    }
    protected static int FibbonaciDoW(int termo){
        int[] fib = new int[termo+1];
        for (int i = 0; i < termo; i++) 
                fib[i] = 0; 
        fib[0] = 0;
        fib[1] = 1;
        int i = 2;
        do{
            fib[i] = fib[i-1] + fib[i-2];
            i++;
        }while(i>=termo);
        return fib[termo];
    }
    protected static int FibbonaciWhile(int termo){
        int[] fib = new int[termo+1];
        for (int i = 0; i < termo; i++) 
            fib[i] = 0; 
        fib[0] = 0;
        fib[1] = 1;
        int i = 2;
        do{
            fib[i] = fib[i-1] + fib[i-2];
            i++;
        }while(i>=termo);
        return fib[termo];
    }
    private static int FibbonaciRecursivo(int i) {
        if(i == 0 || i == 1){
            return i;
        }
        else{ 
            return (FibbonaciRecursivo(i-1)+FibbonaciRecursivo(i-2));
        }
    }
    
    private static int FatorialFor(int n){
        int fat = 1;
        for (int i = 2; i < n; i++) 
            fat *= i;
        return fat;
    }
    
    private static int FatorialRecursivo(int n){
        if(n != 0)
            return n*FatorialRecursivo(n-1);
        else
        return 1;
    }
    
    private static int FatorialWhile(int n){
        int f=1;
        int i = 2;
        while(i < n)
            f *= i;
        return f;
    }
    
    private static int FatorialDoW(int n){
        int f = 1;
        int i = 2;
        do
            f *= i;
        while (i < n);
        return f;
    }
}
