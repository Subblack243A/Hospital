package hospital;

public class Hospital {
     //Atributos que heredara la clase
    protected String luagarAtencion="", medico="", fecha="", motivo="";

    //Cosntructor
    public Hospital() {
    }
    
    //Setters
    public void setLugarAtencion(String luagarAtencion) {
        this.luagarAtencion = luagarAtencion;
    }

    public void setMedico(String medico) {
        this.medico = medico;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
    
    // Getters
    public String getLuagarAtencion() {
        return luagarAtencion;
    }

    public String getMedico() {
        return medico;
    }

    public String getFecha() {
        return fecha;
    }

    public String getMotivo() {
        return motivo;
    }
}
