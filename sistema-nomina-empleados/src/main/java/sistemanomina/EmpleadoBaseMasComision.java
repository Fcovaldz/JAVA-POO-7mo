package sistemanomina;

public class EmpleadoBaseMasComision extends EmpleadoPorComision {
    private double salarioBase;
    
    public EmpleadoBaseMasComision(String primerNombre, String apellidoPaterno,
            String nss, double ventasBrutas, double tarifaComision,
            double salarioBase) {
        super(primerNombre, apellidoPaterno, nss, ventasBrutas, tarifaComision);
        
        if (salarioBase < 0.0) {
            salarioBase = 0.0;
        }
        
        this.salarioBase = salarioBase;
    }
    
    public double getSalarioBase() {
        return salarioBase;
    }
    
    public void setSalarioBase(double salarioBase) {
        if (salarioBase < 0.0) {
            salarioBase = 0.0;
        }
        this.salarioBase = salarioBase;
    }
    
    @Override
    public double ingresos() {
        return super.ingresos() + salarioBase;
    }
    
    @Override
    public String toString() {
        return String.format(
                "Con salario base %s\n"
                + "Salario base: $%.2f",
                super.toString(),
                salarioBase);
    }
}
