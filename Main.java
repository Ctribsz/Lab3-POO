import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main { 
    public static void main(String[] args) throws Exception {

        Gestor g = new Gestor();
        List<String[]> campos = g.leerArchivo("prod.csv");
        List<Pantalones> pt = new ArrayList<>();
        List<Collares> cl = new ArrayList<>();
        List<Camisab> cb = new ArrayList<>();

        for (String[] campo : campos) {
                String valor = campo[5];
                        if(valor.equals("Pantalon")){
                            int id = (Integer.parseInt(campo[0]));
                            int cantd = (Integer.parseInt(campo[1]));
                            int cantv = (Integer.parseInt(campo[2]));
                            String estado = (campo[3]);
                            double precio = (Double.parseDouble(campo[4]));
                            String categoria = (campo[5]);
                            int talla = (Integer.parseInt(campo[6]));
                            String tipo = (campo[7]);

                            Pantalones pantalones = new Pantalones(id, cantd, cantv, estado, precio, categoria, talla, tipo);
                            pt.add(pantalones);
                        } else if (valor.equals("Collar")){
                            int id = (Integer.parseInt(campo[0]));
                            int cantd = (Integer.parseInt(campo[1]));
                            int cantv = (Integer.parseInt(campo[2]));
                            String estado = (campo[3]);
                            double precio = (Double.parseDouble(campo[4]));
                            String categoria = (campo[5]);
                            String talla = (campo[6]);
                            String material = (campo[9]);

                            Collares collares = new Collares(id, cantd, cantv, estado, precio, categoria, talla, material);
                            cl.add(collares);
                        }else if(valor.equals("Camisa")){
                            int id = (Integer.parseInt(campo[0]));
                            int cantd = (Integer.parseInt(campo[1]));
                            int cantv = (Integer.parseInt(campo[2]));
                            String estado = (campo[3]);
                            double precio = (Double.parseDouble(campo[4]));
                            String categoria = (campo[5]);
                            String talla = (campo[6]);
                            String color = (campo[8]);

                            Camisab camisa = new Camisab(id, cantd, cantv, estado, precio, categoria, talla, color);
                            cb.add(camisa);
                        }else if(valor.equals("Blusa")){
                            int id = (Integer.parseInt(campo[0]));
                            int cantd = (Integer.parseInt(campo[1]));
                            int cantv = (Integer.parseInt(campo[2]));
                            String estado = (campo[3]);
                            double precio = (Double.parseDouble(campo[4]));
                            String categoria = (campo[5]);
                            String talla = (campo[6]);
                            String color = (campo[8]);

                            Camisab blusa = new Camisab(id, cantd, cantv, estado, precio, categoria, talla, color);
                            cb.add(blusa);
                        }
                    }
        

        while(true){
            System.out.println("______________MENU____________");
            System.out.println("1. Imprimir productos disponibles");
            System.out.println("2. Conseguir reporte de inventario");
            System.out.println("3. Buscar por ID");
            System.out.println("5. Salir");
            Scanner sc = new Scanner(System.in);  
            System.out.println("Elige la accion que quieras realizar: ");
            int op = sc.nextInt();
            sc.nextLine();

            switch(op){
                case 1:
                    g.imprimir(campos);
                    break;
                
                case 2:
                    double totalpantalones = 0;
                    double totalcollares = 0;
                    double totalcamisas = 0;

                    int cantpan = 0;
                    int cantcoll = 0;
                    int cantcamis = 0;


                    for (Pantalones pantalon : pt) {
                        totalpantalones += pantalon.getCantv() * pantalon.getPrecio();
                    }

                    for (Collares collar : cl) {
                        totalcollares += collar.getCantv() * collar.getPrecio();
                    }


                    for (Camisab camisa : cb) {
                        totalcamisas += camisa.getCantv() * camisa.getPrecio();
                    }

                    for (Pantalones pantalon : pt) {
                        cantpan += pantalon.getCantv();
                    }

                    for (Collares collar : cl) {
                        cantcoll += collar.getCantv();
                    }

                    for (Camisab camisa : cb) {
                        cantcamis += camisa.getCantv();
                    }

                    System.out.println("Listado de categorias con el total de productos: \n");
                    System.out.println("a. Pantalones - " + cantpan + "\n");
                    System.out.println("b. Blusas/Camisas - " + cantcamis + "\n");
                    System.out.println("c. Collares - " + cantcoll + "\n");
                    

                    System.out.println("Total, de ventas por categoría: \n");
                    System.out.println("a. Pantalones - " + totalpantalones + "\n");
                    System.out.println("b. Blusas/Camisas - " + totalcamisas + "\n");
                    System.out.println("c. Collares - " + totalcollares + "\n");

                    break;

                case 3:
                    System.out.println("Ingresa el ID que deseas buscar: ");
                    int index = sc.nextInt();
                    pt.stream()
                    .filter(p -> p.getId() == index)
                    .findAny();

                    Pantalones pantalon = pt.stream()
                        .filter(p -> p.getId() == index)
                        .findAny()
                        .orElse(null);

                    if (pantalon != null) {
                        System.out.println("El elemento encontrado tiene el ID " + pantalon.getId() + ", talla " + pantalon.getTalla() + " y tipo " + pantalon.getTipo());
                    }

                    Camisab camisab = cb.stream()
                        .filter(p -> p.getId() == index)
                        .findAny()
                        .orElse(null);

                    if (camisab != null) {
                        System.out.println("El elemento encontrado tiene el ID " + camisab.getId() + ", talla " + camisab.getTalla() + " y color " + camisab.getColor());
                    }

                    Collares collares = cl.stream()
                        .filter(p -> p.getId() == index)
                        .findAny()
                        .orElse(null);

                    if (collares != null) {
                        System.out.println("El elemento encontrado tiene el ID " + collares.getId() + ", talla " + collares.getTalla() + " y material " + collares.getMaterial());
                    }
                    break;
                
                case 4:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Ingrese una opcion valida");
            }
        }
    }
}
