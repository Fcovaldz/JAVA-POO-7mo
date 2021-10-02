package pruebapolimorfismo;

public class EmpleadoBaseMasComision extends EmpleadoPorComision {

    private double salarioBase;
    
    public EmpleadoBaseMasComision(String primerNombre, String apellidoPaterno,
            String numeroSeguroSocial, double ventasBrutas,
            double tarifaComision, double salarioBase) {
        
        // Llamando al constructor de la clase padre
        super(primerNombre, apellidoPaterno, numeroSeguroSocial, ventasBrutas, tarifaComision);
        
        // Si el salario base es invalido se establece en 1000
        if (salarioBase < 0.0) {
            salarioBase = 1000;
        }
        
        this.salarioBase = salarioBase;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        if (salarioBase < 0.0) {
            salarioBase = 1000;
        }
        this.salarioBase = salarioBase;
    }
    
    // Calcula los ingresos
    @Override // Esta etiqueta indica que este metodo sobrescribe el metodo de una superclase
    public double ingresos() {
        return salarioBase + tarifaComision * ventasBrutas;
    }

    // Devuelve representacion String del objeto EmpleadoPorComision
    @Override // Esta etiqueta indica que este metodo sobrescribe el metodo de una superclase
    public String toString() {
        return super.toString() + String.format(
                "Salario base: %.2f\n", salarioBase);
    }
}