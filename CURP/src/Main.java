import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombre;
        String apellidoPaterno;
        String apellidoMaterno;
        String sexo;
        String fechaNacimiento;
        Integer seleccionEntidad;
        String claveEntidadFederativa;
        String nombreEntidad;

        EntidadFederativa entidadFederativa = new EntidadFederativa();

        System.out.println("Calculadora de CURP");
        System.out.println("Nombre (s): ");
        nombre = scanner.nextLine();
        System.out.println("Apellido Paterno: ");
        apellidoPaterno = scanner.nextLine();
        System.out.println("Apellido Materno: ");
        apellidoMaterno = scanner.nextLine();
        System.out.println("Fecha de nacimiento (dd/mm/aaaa): ");
        fechaNacimiento = scanner.nextLine();
        System.out.println("Sexo (h/m): ");
        sexo = scanner.nextLine();


        EntidadFederativa.mostrarCatalogo();
        System.out.println("Selecciona la Entidad Federativa: ");
        seleccionEntidad = scanner.nextInt();

        String[] claveYNombreEntidad = entidadFederativa.getClaveEntidad(seleccionEntidad);
        claveEntidadFederativa = claveYNombreEntidad[0];
        nombreEntidad = claveYNombreEntidad[1];


        // Generar homoclave aleatoria
        Random random = new Random();
        String homoclave = String.format("%02d", random.nextInt(100));


        CURP curp = new CURP(nombre, apellidoPaterno, apellidoMaterno, fechaNacimiento, sexo, claveEntidadFederativa, homoclave);
        System.out.println("El CURP generado es: " + curp.getCurp());
        System.out.println("Entidad Federativa: " + nombreEntidad);



    }
}