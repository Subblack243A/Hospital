package hospital;

import java.util.ArrayList;

public class Medico implements IBuscar{

    private Paciente p = new Paciente();
    private ArrayList<Paciente> list = new ArrayList();
    @Override
    public String buscar(String s) {
        String bus = "";
        
        for (int i = 0; i < list.size(); i++) {
            if (s.equals(list.get(i).getMedico())) {
                bus += list.get(i).getDatos()+"\n";
            } else {
                bus = "No se encontro Medico";
            }
        }
        return bus;
    }
    public void dato1(){
        p.setNombres("Felipe");
        p.setApellidos("Valcarcel");
        p.setSexo("Masculino");
        p.setCodigo(1000);
        p.setDireccion("Cra 22 #3-15");
        p.setFecha("1/10/2022");
        p.setMedico("Fernando");
        p.setMotivo("Dolor Abdominal Grave");
        p.setLugarAtencion("Hospital Guachafita");
        list.add(p);
    }
    public void dato2(){
        p.setNombres("Maria Fernanda");
        p.setApellidos("Valcarcel");
        p.setSexo("Femenino");
        p.setCodigo(1001);
        p.setDireccion("Cra 22 #3-15");
        p.setFecha("1/10/2022");
        p.setMedico("Fernando");
        p.setMotivo("Optometria");
        p.setLugarAtencion("Hospital Guachafita");
        list.add(p);
    }
    public void dato3(){
        p.setNombres("Camilo");
        p.setApellidos("Muñoz");
        p.setSexo("Masculino");
        p.setCodigo(1002);
        p.setDireccion("Calle 29B #2-36");
        p.setFecha("2/10/2022");
        p.setMedico("Laura");
        p.setMotivo("Cansancio Extremo");
        p.setLugarAtencion("Hospital Dolce");
        list.add(p);
    }
    public void dato4(){
        p.setNombres("Camila Fernanda");
        p.setApellidos("Casallas Buitrago");
        p.setSexo("Indefinido");
        p.setCodigo(1003);
        p.setDireccion("Cra 22 #3-18");
        p.setFecha("1/12/2023");
        p.setMedico("Laura");
        p.setMotivo("Dolor Grave");
        p.setLugarAtencion("Hospital Guachafita");
        list.add(p);
    }
    public void dato5(){
        p.setNombres("Fabian");
        p.setApellidos("Quiroga");
        p.setSexo("Masculino");
        p.setCodigo(1004);
        p.setDireccion("Cra 28 #3-25");
        p.setFecha("1/10/2022");
        p.setMedico("Fernando");
        p.setMotivo("Calvicie Grave");
        p.setLugarAtencion("Hospital Guachafita");
        list.add(p);
    }
    public void dato6(){
        p.setNombres("Yessica");
        p.setApellidos("Yuyeimy");
        p.setSexo("Trans");
        p.setCodigo(1005);
        p.setDireccion("Calle 13");
        p.setFecha("2/23/2022");
        p.setMedico("Laura");
        p.setMotivo("Dolor Abdominal Grave");
        p.setLugarAtencion("Hospital Dolce");
        list.add(p);
    }

    public ArrayList<Paciente> getList() {
        return list;
    }
}

