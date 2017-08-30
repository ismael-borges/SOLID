/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unifacs;

/**
 *
 * @author 020121222
 */
public enum PlacaMaeEnum {
    
    GIGABYTE("x850","Gigabyte", 01),
    ASUS("a720","Asus", 02);
    
    private String modelo;
    private String marca;
    private int codigo;

    PlacaMaeEnum(String modelo, String marca, int codigo){
        this.modelo = modelo;
        this.marca = marca;
        this.codigo= codigo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public static PlacaMaeEnum obterPlacaMaePorCodigo(int codigo){
        PlacaMaeEnum retorno = null;
        
        switch(codigo){
            case 01:
                retorno = GIGABYTE;
            break;
            case 02:
                retorno = ASUS;
            break;
        }
        
        return retorno;
    }

    @Override
    public String toString() {
        return "PlacaMaeEnum{" + "modelo=" + modelo + ", marca=" + marca + ", codigo=" + codigo + '}';
    }
    
    

}
