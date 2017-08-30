package br.unifacs;

/**
 *
 * @author 020121222
 */
public class Maquina {
    
    private PlacaMaeEnum placaMae;
    private CPUEnum cpu;
    private String nome;

    public PlacaMaeEnum getPlacaMae() {
        return placaMae;
    }

    public void setPlacaMae(PlacaMaeEnum placaMae) {
        this.placaMae = placaMae;
    }

    public CPUEnum getCpu() {
        return cpu;
    }

    public void setCpu(CPUEnum cpu) {
        this.cpu = cpu;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Maquina{" + "placaMae=" + placaMae.toString() + ", cpu=" + cpu.toString() + ", nome=" + nome + '}';
    }
        
}
