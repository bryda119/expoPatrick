/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Expo;
import javax.swing.JOptionPane;

/**
 *
 * @author braya
 */

public class  Atributos{
      
    private String propietario;
    private double valorcomercial;
    private String color;
    private String placa;
    private String matriculado;
    private int aniofabricacion;

    public Atributos() {
    }

    

    

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public double getValorcomercial() {
        return valorcomercial;
    }

    public void setValorcomercial(double valorcomercial) {
        this.valorcomercial = valorcomercial;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMatriculado() {
        return matriculado;
    }

    public void setMatriculado(String matriculado) {
        this.matriculado = matriculado;
    }

    public int getAniofabricacion() {
        return aniofabricacion;
    }

    public void setAniofabricacion(int aniofabricacion) {
        this.aniofabricacion = aniofabricacion;
    }
    
    
   
    public Atributos(String propietario){
        this.propietario = propietario;
        JOptionPane.showInternalMessageDialog(null, "Bienvenido, Los datos del vehiculo son: ");
        
    }
    public String calcularAnio(){
        double anioActual = 2021-aniofabricacion;
        if (anioActual >=2) {
            
            return "no debe presentarse a la revision";
        }else{
            return "si debe presentarse a la revision"; 
        }
        
    }
    
    public String datos(){
        String informacion = "Informacion del vehiculo\n "
                +"Propietario: "+ propietario +"\n"
                +"Valor: "+ valorcomercial + "\n"
                +"Color: "+ color + "\n"
                +"Placa: "+ placa + "\n"
                +"Matriculado: "+ matriculado + "\n"
                +"Anio Fabrincante: "+ aniofabricacion + "\n";
        
        return informacion;
        
    }
}

    

