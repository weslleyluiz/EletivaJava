/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aluno;

/**
 *
 * @author wesll
 */
public class AlunoPosGraduacao extends Aluno{

    private String temaTese;
    public AlunoPosGraduacao() {
    }
    public AlunoPosGraduacao(String nome, String matricula, int idade, double mensalidade, String temaTese){
        super(nome,matricula,idade,mensalidade);
        this.temaTese = temaTese;
    }
    
    @Override
    public void descontaMensalidade() {
        this.setMensalidade(this.getMensalidade()*0.5);
    }

    /**
     * @return the temaTese
     */
    public String getTemaTese() {
        return temaTese;
    }

    /**
     * @param temaTese the temaTese to set
     */
    public void setTemaTese(String temaTese) {
        this.temaTese = temaTese;
    }

    @Override
    public void mostrar() {
        super.mostrar(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("temaTese => "+this.temaTese);
    }
    
}
