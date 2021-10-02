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
public class EmpleadoAsalariado extends Empleado{
    private double salarioSemanal;
    
    public EmpleadoAsalariado(String primerNombre, String apellidoPaterno, String nss, double salarioSemanal){
    super(primerNombre, apellidoPaterno, nss);
    this.salarioSemanal = salarioSemanal;
}

    public double getSalarioSemanal() {
        return salarioSemanal;
    }

    public void setSalarioSemanal(double salarioSemanal) {
        this.salarioSemanal = salarioSemanal;
    }

    @Override
    public double ingresos() {
        return salarioSemanal;
    }
    @Override
    public String toString(){
        return String.format(
        "empleado asalariado: %s\n"
                + "salario semanal: $%.2f",
        super.toString(), salarioSemanal);
    }
}
