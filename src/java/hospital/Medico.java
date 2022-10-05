package hospital;

public class Medico implements IBuscar{
    //Atributos
    private String[] a = {"Fernando", "Laura"};

    //Constructor
    public Medico() {
    }

    //Sobreescritura de Metodo abstracto buscar() 
    @Override
    public String buscar(String s) {
        //Traemos los datos
        Datos d = new Datos();
        String bus = "";
        int b=2;
        //Busca la coincidencia con el nombre
        for (int i = 0; i < a.length; i++) {
            if (s.equals(a[i])) {
                //Guarda posicion de coincidencia
                b = i;
            }
        }
        //Segun la coincidencia llama uno de los datos
        switch (b) {
            case 0:
                bus=d.dato1()+"----------"+d.dato2()+"----------"+d.dato5();
                break;
            
            case 1: 
                bus=d.dato3()+"----------"+d.dato4()+"----------"+d.dato6();
                break;
                
            default:
                bus="No existe";
                break;
        }
        return bus;
    }
}
