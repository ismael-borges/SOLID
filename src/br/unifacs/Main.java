package br.unifacs;

import java.util.Scanner;

/**
 *
 * @author Ismael Borges
 */
public class Main {
    public static void main(String[] args){
        
        Maquina maquina = new Maquina();
        
        Scanner ler = new Scanner(System.in);
                
        System.out.println("Informe o nome da Maquina: ");
        maquina.setNome(ler.next());
        
        System.out.println("Informe o codigo da CPU: ");
        maquina.setCpu(CPUEnum.obterCPUPorCodigo(ler.nextInt()));
        
        System.out.println("Informe o codigo da PlacaMae: ");
        maquina.setPlacaMae(PlacaMaeEnum.obterPlacaMaePorCodigo(ler.nextInt()));
        
        System.out.println(maquina.toString());
    }
    
}
