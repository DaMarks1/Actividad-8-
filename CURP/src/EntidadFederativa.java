public class EntidadFederativa {
    private String nombre;

    public EntidadFederativa() {
        this.nombre = "";
    }

    public static void mostrarCatalogo(){
        System.out.println("1. Aguascalientes");
        System.out.println("2. Baja California");
        System.out.println("3. Baja California Sur");
        System.out.println("4. Campeche");
        System.out.println("5. Coahuila");
        System.out.println("6. Colima");
        System.out.println("7. Chiapas");
        System.out.println("8. Chihuahua");
        System.out.println("9. Ciudad de México");
        System.out.println("10. Durango");
        System.out.println("11. Guanajuato");
        System.out.println("12. Guerrero");
        System.out.println("13. Hidalgo");
        System.out.println("14. Jalisco");
        System.out.println("15. México");
        System.out.println("16. Michoacán");
        System.out.println("17. Morelos");
        System.out.println("18. Nayarit");
        System.out.println("19. Nuevo León");
        System.out.println("20. Oaxaca");
        System.out.println("21. Puebla");
        System.out.println("22. Querétaro");
        System.out.println("23. Quintana Roo");
        System.out.println("24. San Luis Potosí");
        System.out.println("25. Sinaloa");
        System.out.println("26. Sonora");
        System.out.println("27. Tabasco");
        System.out.println("28. Tamaulipas");
        System.out.println("29. Tlaxcala");
        System.out.println("30. Veracruz");
        System.out.println("31. Yucatán");
        System.out.println("32. Zacatecas");
        System.out.println("33.Extranjero");
    }

    public String[] getClaveEntidad(int seleccionEntidadFederativa) {
        String codigoEntidad= "";
        String nomEntidadF = "";
        switch (seleccionEntidadFederativa) {
            case 1:
                codigoEntidad = "AS";
                nomEntidadF = "Aguascalientes";
                break;
            case 2:
                codigoEntidad = "BC";
                nomEntidadF = "Baja California";
                break;
            case 3:
                codigoEntidad = "BS";
                nomEntidadF = "Baja California Sur";
                break;
            case 4:
                codigoEntidad = "CC";
                nomEntidadF = "Campeche";
                break;
            case 5:
                codigoEntidad = "CL";
                nomEntidadF = "Coahuila";
                break;
            case 6:
                codigoEntidad = "CM";
                nomEntidadF = "Colima";
                break;
            case 7:
                codigoEntidad = "CS";
                nomEntidadF = "Chiapas";
                break;
            case 8:
                codigoEntidad = "CH";
                nomEntidadF = "Chihuahua";
                break;
            case 9:
                codigoEntidad = "DF";
                nomEntidadF = "Distrito Federal";
                break;
            case 10:
                codigoEntidad = "DG";
                nomEntidadF = "Durango";
                break;
            case 11:
                codigoEntidad = "GT";
                nomEntidadF = "Guanajuato";
                break;
            case 12:
                codigoEntidad = "GR";
                nomEntidadF = "Guerrero";
                break;
            case 13:
                codigoEntidad = "HG";
                nomEntidadF = "Hidalgo";
                break;
            case 14:
                codigoEntidad = "JC";
                nomEntidadF = "Jalisco";
                break;
            case 15:
                codigoEntidad = "MC";
                nomEntidadF = "México";
                break;
            case 16:
                codigoEntidad = "MN";
                nomEntidadF = "Michoacán";
                break;
            case 17:
                codigoEntidad = "MS";
                nomEntidadF = "Morelos";
                break;
            case 18:
                codigoEntidad = "NT";
                nomEntidadF = "Nayarit";
                break;
            case 19:
                codigoEntidad = "NL";
                nomEntidadF = "Nuevo León";
                break;
            case 20:
                codigoEntidad = "OC";
                nomEntidadF = "Oaxaca";
                break;
            case 21:
                codigoEntidad = "PL";
                nomEntidadF = "Puebla";
                break;
            case 22:
                codigoEntidad = "QT";
                nomEntidadF = "Querétaro";
                break;
            case 23:
                codigoEntidad = "QR";
                nomEntidadF = "Quintana Roo";
                break;
            case 24:
                codigoEntidad = "SP";
                nomEntidadF = "San Luis Potosí";
                break;
            case 25:
                codigoEntidad = "SL";
                nomEntidadF = "Sinaloa";
                break;
            case 26:
                codigoEntidad = "SR";
                nomEntidadF = "Sonora";
                break;
            case 27:
                codigoEntidad = "TC";
                nomEntidadF = "Tabasco";
                break;
            case 28:
                codigoEntidad = "TS";
                nomEntidadF = "Tamaulipas";
                break;
            case 29:
                codigoEntidad = "TL";
                nomEntidadF = "Tlaxcala";
                break;
            case 30:
                codigoEntidad = "VZ";
                nomEntidadF = "Veracruz";
                break;
            case 31:
                codigoEntidad = "YN";
                nomEntidadF = "Yucatán";
                break;
            case 32:
                codigoEntidad = "ZS";
                nomEntidadF = "Zacatecas";
                break;
            default:
                codigoEntidad = "NE";
                nomEntidadF = "Extranjero";
                break;

        }

        return new String[]{codigoEntidad, nomEntidadF};
    }
}