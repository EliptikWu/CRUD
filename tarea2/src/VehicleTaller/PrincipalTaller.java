package VehicleTaller;

import VehicleTaller.modelo1.Taller;
import VehicleTaller.repositorio1.TallerRepository;
import VehicleTaller.repositorio1.TallerRepositoryImpl;

import java.util.List;
import java.util.Scanner;
public class PrincipalTaller {
    public static void main(String[] args){
        String opc = "1";
        TallerRepository repo = new TallerRepositoryImpl();
        do {
            Scanner s = new Scanner(System.in);
            System.out.println("Menu Del Concesionario Mazda \n 1. Agregar  \n 2. Listar \n 3. Editar " +
                    "\n 4. Eliminar  \n 5. Salir \n =>");
            opc = s.next();
            switch (opc) {
                //Placa, dueño, fecha, teléfono del dueño, modelo
                case "1":{
                    System.out.println("Placa Del Vehiculo: ");
                    Integer pla = s.nextInt();
                    System.out.println("Nombre Del Dueño: ");
                    String due = s.next();
                    System.out.println("Fecha:");
                    String fec = s.next();
                    System.out.println("Telefono Del Dueño: ");
                    Integer tel = s.nextInt();
                    System.out.println("Modelo Del Auto: ");
                    String mod = s.next();
                    repo.save(new Taller(pla, due, fec, tel, mod));
                    break;
                }
                case "2":{
                    List<Taller> talleres = repo.findAll();
                    talleres.forEach(System.out::println);
                    break;
                }
                case "3":{
                    System.out.println("===== Editar ====");
                    System.out.println("Placa Del Vehiculo: ");
                    Integer plav = s.nextInt();
                    System.out.println("Ingrese El Nombre Del Dueño: ");
                    String due = s.next();
                    System.out.println("Ingrese La Fecha: ");
                    String fec = s.next();
                    System.out.println("Ingrese El Telefono Del Dueño: ");
                    Integer tel = s.nextInt();
                    System.out.println("Ingrese El Modelo Del Auto: ");
                    String mod = s.next();
                    Taller beaActualizar = new Taller(plav, due, fec, tel, mod);
                    repo.update(beaActualizar);
                    break;
                }
                case "4": {
                    System.out.println("===== eliminar ======");
                    System.out.print("Ingrese La Placa Del Vehiculo");
                    Integer pla = s.nextInt();
                    repo.delete(repo.findByPla(pla));
                    repo.findAll().forEach(System.out::println);
                    break;
                }
                case "5": {
                    opc = "5";
                    break;
                }
            }
        } while (opc != "5");
    }
}
