package hospital;

public class Paciente extends Hospital{
     // Atributos de clase Paciente
    private int codigo;
    private String apellidos, nombres, sexo, direccion;
    
    //Constructor
    public Paciente() {    
    }
    
    //Metodo para organizar los datos en un solo String para poder pedir mas facil todos los datos
    public String getDatos(){
        String s;
        s="Nombres: "+getNombres()+"\nApellidos: "+getApellidos()+"\nSexo: "+getSexo()+"\nDireccion de residencia: "+getDireccion()+"\nMotivo: "+getMotivo()+"\nMédico: "+getMedico()+"\nLugar de Atencion: "+getLuagarAtencion()+"\nFecha: "+getFecha();
        return s;
    }
    
    

    //Setters
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    //Getters
    public int getCodigo() {
        return codigo;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public String getSexo() {
        return sexo;
    }

    public String getDireccion() {
        return direccion;
    }
}
