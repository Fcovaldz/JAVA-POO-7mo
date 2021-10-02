package sistemanomina;

public class EmpleadoPorComision extends Empleado {
    private double ventasBrutas;
    private double tarifaComision;
    
    public EmpleadoPorComision(String primerNombre, String apellidoPaterno,
            String nss, double ventasBrutas, double tarifaComision) {
        super(primerNombre, apellidoPaterno, nss);
        
        if (ventasBrutas < 0.0) {
            ventasBrutas = 0.0;
        }
        
        if (tarifaComision <= 0.0 || tarifaComision >= 1.0) {
            tarifaComision = 0.1;
        }
        
        this.ventasBrutas = ventasBrutas;
        this.tarifaComision = tarifaComision;
    }
    
    public double getVentasBrutas() {
        return ventasBrutas;
    }
    
    public void setVentasBrutas(double ventasBrutas) {
        if (ventasBrutas < 0.0) {
            ventasBrutas = 0.0;
        }
        this.ventasBrutas = ventasBrutas;
    }
    
    public double getTarifaComision() {
        return tarifaComision;
    }
    
    public void setTarifaComision(double tarifaComision) {
        if (tarifaComision <= 0.0 || tarifaComision >= 1.0) {
            tarifaComision = 0.1;
        }
        this.tarifaComision = tarifaComision;
    }
    
    @Override
    public double ingresos() {
        return tarifaComision * ventasBrutas;
    }
    
    @Override
    public String toString() {
        return String.format(
                "Empleado por comision: %s\n"
                + "Ventas brutas: $%.2f\n"
                + "Tarifa comision: %.2f",
                super.toString(),
                ventasBrutas,
                tarifaComision);
    }
}
