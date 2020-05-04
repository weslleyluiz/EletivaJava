package aluno;
public class Aluno {
    private String nome;
    private String matricula;
    private int idade;
    private double mensalidade;

    public Aluno() {
    }

    public Aluno(String nome, String matricula,int idade, double mensalidade) {
        this.nome = nome;
        this.matricula = matricula;
        this.idade = idade;
        this.mensalidade = mensalidade;
    }
 
    public void mostrar(){
        System.out.println("nome => "+this.nome);
        System.out.println("matricula => "+this.matricula);
        System.out.println("idade => "+this.idade);
        System.out.println("mensalidade => "+this.mensalidade);
    }
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the matricula
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * @return the mensalidade
     */
    public double getMensalidade() {
        return mensalidade;
    }

    /**
     * @param mensalidade the mensalidade to set
     */
    public void setMensalidade(double mensalidade) {
        this.mensalidade = mensalidade;
    }
    
    public void descontaMensalidade(){
        this.mensalidade *= this.mensalidade >= 1000 ? 0.8 : 0.85;
    }
    
}
