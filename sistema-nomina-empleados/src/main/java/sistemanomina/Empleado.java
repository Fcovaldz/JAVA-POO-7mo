/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemanomina;

/**
 *
 * @author iampa
 */
public abstract class Empleado {
    protected final String primerNombre;
    protected final String apellidoPaterno;
    protected final String nss;
    
    public Empleado(String primerNombre, String apellidoPaterno, String nss){
        this.primerNombre = primerNombre;
        this.apellidoPaterno = apellidoPaterno;
        this.nss = nss;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public String getNss() {
        return nss;
    }
    
    public abstract double ingresos();
    
    @Override
    public String toString(){
        return String.format(
            "%s %s\n"
            + "numero social de seguro social: %s",
            primerNombre, apellidoPaterno, nss);
            };
    
}
