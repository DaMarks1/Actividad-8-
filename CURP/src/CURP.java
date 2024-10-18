public class CURP {
    String nombre;
    String apellidoPaterno;
    String apellidoMaterno;
    String fechaNacimiento;
    String sexo;
    String claveEntidad;
    String homoclave;

    public CURP(String nombre, String apellidoPaterno, String apellidoMaterno, String fechaNacimiento, String sexo, String claveEntidad, String homoclave) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
        this.claveEntidad = claveEntidad;
        this.homoclave = homoclave;
    }

    public String getCurp() {
        String curp = "";
        curp += apellidoPaterno.substring(0, 1);
        curp += getPrimeraVocalApellido();
        curp += apellidoMaterno.substring(0, 1);
        curp += nombre.substring(0, 1);
        curp += fechaNacimiento.substring(8, 10);  // año
        curp += fechaNacimiento.substring(3, 5);  // mes
        curp += fechaNacimiento.substring(0, 2);  // día
        curp += sexo.toUpperCase();
        curp += claveEntidad;
        curp += getPrimerConsonanteApellido(apellidoPaterno);
        curp += getPrimerConsonanteApellido(apellidoMaterno);
        curp += getPrimerConsonanteApellido(nombre);
        curp += homoclave;
        return curp.toUpperCase();
    }

    public String getPrimeraVocalApellido() {
        for (int i = 1; i < apellidoPaterno.length(); i++) {
            char letra = apellidoPaterno.charAt(i);
            if (esVocal(letra)) {
                return String.valueOf(letra);
            }
        }
        return "";
    }

    public String getPrimerConsonanteApellido(String palabra) {
        for (int i = 1; i < palabra.length(); i++) {
            char letra = palabra.charAt(i);
            if (!esVocal(letra)) {
                return String.valueOf(letra);
            }
        }
        return "";
    }

    private boolean esVocal(char letra) {
        return "AEIOUaeiou".indexOf(letra) != -1;
    }
}