package LocalesComerciales.modelo;

public class Local {
    public Integer Id;
    private String nombreLocal;
    private String ubicacionLocal;
    private double telefonoLocal;

    public Local(Integer id, String nombreLocal, String ubicacionLocal, double telefonoLocal) {
        Id = id;
        this.nombreLocal = nombreLocal;
        this.ubicacionLocal = ubicacionLocal;
        this.telefonoLocal = telefonoLocal;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getNombreLocal() {
        return nombreLocal;
    }

    public void setNombreLocal(String nombreLocal) {
        this.nombreLocal = nombreLocal;
    }

    public String getUbicacionLocal() {
        return ubicacionLocal;
    }

    public void setUbicacionLocal(String ubicacionLocal) {
        this.ubicacionLocal = ubicacionLocal;
    }

    public double getTelefonoLocal() {
        return telefonoLocal;
    }

    public void setTelefonoLocal(double telefonoLocal) {
        this.telefonoLocal = telefonoLocal;
    }

    @Override
    public String toString() {
        return "Local ->" +
                "Id= " + Id +
                ", Nombre Del Local= " + nombreLocal + '\'' +
                ", Ubicación Del Local= " + ubicacionLocal + '\'' +
                ", Telefono Del Local= " + telefonoLocal ;
    }

}
