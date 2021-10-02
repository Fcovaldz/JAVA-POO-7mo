package pruebapolimorfismo;

public class EmpleadoPorComision {

    protected final String primerNombre;
    protected final String apellidoPaterno;
    protected final String numeroSeguroSocial;
    protected double ventasBrutas;
    protected double tarifaComision;
    
    public EmpleadoPorComision(String primerNombre, String apellidoPaterno,
            String numeroSeguroSocial, double ventasBrutas, double tarifaComision) {
        
        super();
        
        // Si las ventas brutas no son validas, se igualan a 0
        if (ventasBrutas < 0.0) {
            ventasBrutas = 0;
        }

        // Si la tarifa de comision no es valida, se establece en 15%
        if (tarifaComision <= 0.0 || tarifaComision >= 1.0) {
            tarifaComision = 0.15;
        }

        this.primerNombre = primerNombre;
        this.apellidoPaterno = apellidoPaterno;
        this.numeroSeguroSocial = numeroSeguroSocial;
        this.ventasBrutas = ventasBrutas;
        this.tarifaComision = tarifaComision;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public String getNumeroSeguroSocial() {
        return numeroSeguroSocial;
    }

    public double getVentasBrutas() {
        return ventasBrutas;
    }

    public void setVentasBrutas(double ventasBrutas) {
        if (ventasBrutas <= 0.0) {
            ventasBrutas = 0;
        }
        this.ventasBrutas = ventasBrutas;
    }

    public double getTarifaComision() {
        return tarifaComision;
    }

    public void setTarifaComision(double tarifaComision) {
        if (tarifaComision <= 0.0 || tarifaComision >= 1.0) {
            tarifaComision = 0.15;
        }
        this.tarifaComision = tarifaComision;
    }

    // Calcula los ingresos
    public double ingresos() {
        return tarifaComision * ventasBrutas;
    }

    // Devuelve representacion String del objeto EmpleadoPorComision
    @Override // Esta etiqueta indica que este metodo sobrescribe el metodo de una superclase
    public String toString() {
        String s;
        if (this instanceof EmpleadoBaseMasComision)
            s = "Empleado base mas comision";
        else
            s = "Empleado por comision";
        return String.format(
                "%s: %s %s\n"
                + "NSS: %s\n"
                + "Ventas brutas: %.2f\n"
                + "Tarifa de comision: %.2f\n",
                s, primerNombre, apellidoPaterno,
                numeroSeguroSocial, ventasBrutas,
                tarifaComision);
    }
    
}
