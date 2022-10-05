package hospital;

public class Datos {
    
    //Diferentes pacientes
    public String dato1() {
        Paciente p = new Paciente();
        //LLena los atributos del Paciente
        p.setNombres("Felipe");
        p.setApellidos("Valcarcel");
        p.setSexo("Masculino");
        p.setCodigo(1000);
        p.setDireccion("Cra 22 #3-15");
        p.setFecha("1/10/2022");
        p.setMedico("Fernando");
        p.setMotivo("Dolor Abdominal Grave");
        p.setLugarAtencion("Hospital Guachafita");
        //Devuelve los datos del paciente en un solo String
        return p.getDatos();
    }

    //Lo mismo con los 5 Datos faltantes
    public String dato2() {
        Paciente p = new Paciente();
        p.setNombres("Maria Fernanda");
        p.setApellidos("valcarcel");
        p.setSexo("Femenino");
        p.setCodigo(1001);
        p.setDireccion("Cra 22 #3-15");
        p.setFecha("1/10/2022");
        p.setMedico("Fernando");
        p.setMotivo("Optometria");
        p.setLugarAtencion("Hospital Guachafita");
        return p.getDatos();
    }

    public String dato3() {
        Paciente p = new Paciente();
        p.setNombres("Camilo");
        p.setApellidos("Muñoz");
        p.setSexo("Masculino");
        p.setCodigo(1002);
        p.setDireccion("Calle 29B #2-36");
        p.setFecha("2/10/2022");
        p.setMedico("Laura");
        p.setMotivo("Cansancio Extremo");
        p.setLugarAtencion("Hospital Dolce");
        return p.getDatos();
    }

    public String dato4() {
        Paciente p = new Paciente();
        p.setNombres("Camila");
        p.setApellidos("Casallas Buitrago");
        p.setSexo("Indefinido");
        p.setCodigo(1003);
        p.setDireccion("Cra 22 #3-18");
        p.setFecha("1/12/2023");
        p.setMedico("Laura");
        p.setMotivo("Dolor Grave");
        p.setLugarAtencion("Hospital Guachafita");
        return p.getDatos();
    }

    public String dato5() {
        Paciente p = new Paciente();
        p.setNombres("Fabian");
        p.setApellidos("Quiroga");
        p.setSexo("Masculino");
        p.setCodigo(1004);
        p.setDireccion("Cra 28 #3-25");
        p.setFecha("1/10/2022");
        p.setMedico("Fernando");
        p.setMotivo("Calvicie Grave");
        p.setLugarAtencion("Hospital Guachafita");
        return p.getDatos();
    }

    public String dato6() {
        Paciente p = new Paciente();
        p.setNombres("Yessica");
        p.setApellidos("Yuyeimy");
        p.setSexo("Trans");
        p.setCodigo(1005);
        p.setDireccion("Calle 13");
        p.setFecha("2/23/2022");
        p.setMedico("Laura");
        p.setMotivo("Dolor Abdominal Grave");
        p.setLugarAtencion("Hospital Dolce");
        return p.getDatos();
    }
}
