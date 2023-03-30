package Empleados.modelo2;

public class Empleado {
    public Integer Id;
    private String nombreEmpleado;
    private Integer telefonoEmpleado;
    public String puestoEmpleado;

    public Empleado(Integer id, String nombreEmpleado, Integer telefonoEmpleado, String puestoEmpleado){
        Id = id;
        this.nombreEmpleado = nombreEmpleado;
        this.telefonoEmpleado = telefonoEmpleado;
        this.puestoEmpleado = puestoEmpleado;
    }

    public  Integer getId(){
        return Id;
    }
    public void setId(Integer id) {Id = id;}

    public String getNombreEmpleado() {return nombreEmpleado;}
    public void setNombreEmpleado(String nombreEmpleado) {this.nombreEmpleado = nombreEmpleado;}
    public Integer getTelefonoEmpleado(){ return telefonoEmpleado;}
    public void setTelefonoEmpleado(Integer telefonoEmpleado) { this.telefonoEmpleado = telefonoEmpleado;}

    public String getPuestoEmpleado() {return puestoEmpleado;}
    public void setPuestoEmpleado(String puestoEmpleado) {this.puestoEmpleado = puestoEmpleado;}

    @Override
    public String toString() {
        return "Empleados ->" +
                "Id= " + Id +
                ", Nombre Del Empleado= " + nombreEmpleado + '\'' +
                ", Telefono Del Empleado= " + telefonoEmpleado + '\'' +
                ", Puesto Del Empleado= " + puestoEmpleado ;
    }
}
