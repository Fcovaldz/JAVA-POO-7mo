package pruebapolimorfismo;

public class PruebaPolimorfismo {

    public static void main(String[] args) {
        // Asigna la referencia a la superclase a una variable de la superclase
        EmpleadoPorComision epc = new EmpleadoPorComision(
                "Sue", "Jones", "222-22-2222", 10000, 0.06);
        
        // Asigna la referencia a la subclase a una variable de la subclase
        EmpleadoBaseMasComision ebmc = new EmpleadoBaseMasComision(
                "Bob", "Lewis", "333-33-3333", 5000, 0.04, 300);
        
        // Llamando a los metodos toString()
        System.out.println("Llamada a toString de EmpleadoPorComision");
        System.out.println(epc);
        System.out.println("Llamada a toString de EmpleadoBaseMasComision con "
                + "referencia a un objeto de la subclase");
        System.out.println(ebmc);
        
        // Invoca a toString en un objeto de la subclase, usando una variable
        // la superclase
        EmpleadoPorComision epc2 = ebmc;
        System.out.println("Llamada a toString de EmpleadoBaseMasComision con "
                + "referencia a la superclase");
        System.out.println(epc2);
    }

}

