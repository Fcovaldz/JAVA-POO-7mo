package sistemanomina;

public class SistemaNomina {

    public static void main(String[] args) {
        EmpleadoAsalariado empleadoAsalariado =
                new EmpleadoAsalariado("John", "Smith", "111-11-1111", 800.0);
        
        EmpleadoPorHoras empleadoPorHoras =
                new EmpleadoPorHoras("Karen", "Price", "222-22-2222", 16.75, 40);
        
        EmpleadoPorComision empleadoPorComision =
                new EmpleadoPorComision(
                "Sue", "Jones", "333-33-3333", 10000, 0.06);
        
        EmpleadoBaseMasComision empleadoBaseMasComision =
                new EmpleadoBaseMasComision(
                "Bob", "Lewis", "444-44-4444", 5000, 0.04, 300);
        
        System.out.println("Empleados procesados por separado:");
        System.out.printf(
                "%s\n"
                + "Ingresos: $%.2f\n\n",
                empleadoAsalariado,
                empleadoAsalariado.ingresos());
        System.out.printf(
                "%s\n"
                + "Ingresos: $%.2f\n\n",
                empleadoPorHoras,
                empleadoPorHoras.ingresos());
        System.out.printf(
                "%s\n"
                + "Ingresos: $%.2f\n\n",
                empleadoPorComision,
                empleadoPorComision.ingresos());
        System.out.printf(
                "%s\n"
                + "Ingresos: $%.2f\n\n",
                empleadoBaseMasComision,
                empleadoBaseMasComision.ingresos());
        
        Empleado[] empleados = new Empleado[4];
        
        empleados[0] = empleadoAsalariado;
        empleados[1] = empleadoPorHoras;
        empleados[2] = empleadoPorComision;
        empleados[3] = empleadoBaseMasComision;
        
        System.out.println("Empleados procesados en forma polimorfica:");
        for (Empleado empleado : empleados) {
            System.out.printf("%s\n\n", empleado);
            
            if (empleado instanceof EmpleadoBaseMasComision) {
                EmpleadoBaseMasComision ebmc =
                        (EmpleadoBaseMasComision) empleado;
                ebmc.setSalarioBase(1.1 * ebmc.getSalarioBase());
                
                System.out.println("Empleado base mas comision aumento de "
                        + "salario del 10%");
                
                System.out.printf(
                "%s\n"
                + "Ingresos: $%.2f\n\n",
                empleado,
                empleado.ingresos());
            }
        }
        
        for (int i = 0; i < empleados.length; i++) {
            System.out.printf("El empleado %d es un %s\n", i,
                    empleados[i].getClass().getName());
        }
    }

}
