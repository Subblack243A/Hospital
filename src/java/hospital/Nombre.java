package hospital;

public class Nombre implements IBuscar{
    //Atributos
    private String[] a = {"Felipe", "Maria Fernanda", "Camilo", "Camila", "Fabian", "Yessica"};
    private String s="";

    //Constructor
    public Nombre() {
    }
    
    //Constructor Sobrecargado
    public  Nombre(String s){
        this.s=s;
    }

    //Sobreescritura de Metodo abstracto buscar() 
    @Override
    public String buscar(String s) {
        //Traemos los datos
        Datos d = new Datos();
        String bus = "";
        int b=6;
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
                bus=d.dato1();
                break;
            
            case 1: 
                bus=d.dato2();
                break;
                
            case 2:
                bus=d.dato3();
                break;
                
            case 3:
                bus=d.dato4();
                break;
                
            case 4: 
                bus=d.dato5();
                break;
                
            case 5: 
                bus=d.dato6();
                break;
            default:
                bus="No existe";
                break;
        }
        return bus;
    }
}
