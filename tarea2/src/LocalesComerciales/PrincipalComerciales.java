package LocalesComerciales;

import LocalesComerciales.modelo.Local;
import LocalesComerciales.repositorio.LocalRepository;
import LocalesComerciales.repositorio.LocalRepositoryImpl;

import java.util.List;
import java.util.Scanner;

public class PrincipalComerciales {
    public static void main (String[] args){
        String opc = "1";
        LocalRepository repo = new LocalRepositoryImpl();
        do {
            Scanner s = new Scanner(System.in);
            System.out.println("Menu De La Cámara De Comercio \n 1. Agregar  \n 2. Listar \n 3. Editar " +
                    "\n 4. Eliminar  \n 5. Salir \n =>");
            opc = s.next();
            switch (opc) {
                case "1":{
                    System.out.println("Id Del Local: ");
                    Integer id = s.nextInt();
                    System.out.println("Nombre Del Local: ");
                    String nom = s.next();
                    System.out.println("Ubicación Del Local: ");
                    String ubi = s.next();
                    System.out.println("Telefono Del local: ");
                    Integer tel = s.nextInt();
                    repo.save(new Local(id, nom, ubi, tel));
                    break;
                }
                case "2":{
                    List<Local> locales = repo.findAll();
                    locales.forEach(System.out::println);
                    break;
                }
                case "3": {
                    System.out.println("===== Editar ====");
                    System.out.print("Id Del Local: ");
                    Integer idl = s.nextInt();
                    System.out.print("Ingrese El Nombre Del Local: ");
                    String nom = s.next();
                    System.out.print("Ingrese La Ubicación Del Local: ");
                    String ubi = s.next();
                    System.out.print("Ingrese El Telefono Del Local: ");
                    double tel = s.nextDouble();
                    Local beaActualizar = new Local(idl, nom, ubi, tel);
                    repo.update(beaActualizar);
                    break;
                }
                case "4": {
                    System.out.println("===== Eliminar ======");
                    System.out.print("Ingrese Id Del Producto: ");
                    Integer id = s.nextInt();
                    repo.delete(repo.findById(id));
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
