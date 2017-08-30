package br.unifacs;

/**
 *
 * @author 020121222
 */
public enum CPUEnum {
    
    I3("I3", 2.50, 01),
    I5("I5", 2.70, 02),
    I7("I7", 3.50, 03);
    
    private String nome;
    private double velocidade;
    private int codigo;

    CPUEnum(String nome, double velocidade, int codigo){
        this.nome = nome;
        this.velocidade = velocidade;
        this.codigo = codigo;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }
    
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    
    public int getCodigo(){
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getVelocidade() {
        return velocidade;
    }
    
    public static CPUEnum obterCPUPorCodigo(int codigo){
        CPUEnum retorno = null;
        
        switch(codigo){
            case 01:
                retorno = I3;
            break;
            case 02:
                retorno = I5;
            break;
            case 03:
                retorno = I7;
            break;
            default:
                System.out.println("Error....");
            break;
        }
        
        return retorno;
                
    }

    @Override
    public String toString() {
        return "CPUEnum{" + "nome=" + nome + ", velocidade=" + velocidade + ", codigo=" + codigo + '}';
    }
    
}
    

