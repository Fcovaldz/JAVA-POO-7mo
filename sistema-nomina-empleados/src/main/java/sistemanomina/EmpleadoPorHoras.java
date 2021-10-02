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
public final class EmpleadoPorHoras extends Empleado{
    private double sueldo;
    private double horas;
    
    public EmpleadoPorHoras(String primerNombre, String apellidoPaterno, String nss, double sueldo, double horas){
        super(primerNombre, apellidoPaterno, nss);
        this.sueldo = sueldo;
        this.horas = horas;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }
    @Override
    public double ingresos(){
        if(horas <= 40.0)
            return horas * sueldo;
        else
            return 40.0 * sueldo + (horas - 40.0) * sueldo * 1.5;
    }
    @Override
    public String toString(){
          return String.format(
        "empleado por horas: %s\n"
                + "salario semanal: $%.2f",
        super.toString(), sueldo * horas);
    }
}
