package VehicleTaller.modelo1;

public class Taller {
    public Integer Pla;

    private String nombreDueño;

    public String fecha;
    private double telDueño;
    public String modelo;

    public Taller(Integer pla, String nombreDueño, String fecha, double  telDueño, String modelo){
        Pla = pla;
        this.nombreDueño = nombreDueño;
        this.fecha = fecha;
        this.telDueño = telDueño;
        this.modelo = modelo;
    }

    public Integer getPla() { return  Pla;}

    public void setPla(Integer pla) { Pla = pla;}

    public String getNombreDueño() { return nombreDueño;}

    public void setNombreDueño(String nombreDueño) {this.nombreDueño = nombreDueño;}

    public String getFecha() { return fecha;}

    public void setFecha(String fecha) { this.fecha = fecha;}

    public double getTelDueño() { return telDueño;}

    public void setTelDueño(double telDueño) { this.telDueño = telDueño;}

    @Override
    public String toString() {
        return "Taller ->" +
                "Placa= " + Pla +
                ", Nombre Del Dueño= " + nombreDueño + '\'' +
                ", Fecha= " + fecha + '\'' +
                ", Telefono Del Dueño= "+ telDueño + '\'' +
                ", Modelo Del Auto= " + modelo ;
    }
}
