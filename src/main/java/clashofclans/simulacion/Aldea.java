package clashofclans.simulacion;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aldea  {

    Recursos recursos = new Recursos();
    List<Edificios> Edificios = new ArrayList<Edificios>();

    int Nivel = 1;

    public static void main(String[] args) {
        Aldea aldea = new Aldea();
        System.out.println("CLASH OF CLANS");
        System.out.println("======================");
        System.out.println("Nivel: "+aldea.Nivel);
        System.out.println("Oro: "+aldea.recursos.getOro());
        System.out.println("Elixir: "+aldea.recursos.getElixir());
        System.out.println("Gemas: "+aldea.recursos.getGemas());
        aldea.Edificios.add(ConstruirChoza());
        aldea.Edificios.add(ConstruirMina(aldea.Nivel));
        aldea.Edificios.add(ConstruirRecolectorElixir(aldea.Nivel));
        int opcion = 0;
        Scanner lectura = new Scanner (System.in);
        do{
            System.out.println("");
            System.out.println("SELECCIONE UNA OPCION");
            System.out.println("1. Ver Edificios: ");
            System.out.println("2. Construir Edificios: ");
            System.out.println("3. Subir de Nivel: ");

            String in = lectura.next();
            try {
                opcion = Integer.parseInt(in);
            }
            catch (NumberFormatException ex){
                ex.printStackTrace();
            }
            switch (opcion){
                case 1:
                    aldea.VerEdificios(aldea);
                    break;
                case 2:
                    aldea.Costruir(aldea);
                    break;
                case 3:
                    aldea.Nivel++;
            }

        }while (opcion != 0);
    }

    public static void Costruir(Aldea aldea){
        System.out.println("");
        System.out.println("NIVEL " + aldea.Nivel);

        System.out.println("SELECCIONE UNA OPCION");
        System.out.println("1. Construir Mina Oro: ");
        System.out.println("2. Construir Recolector Elixir: ");
        System.out.println("3. Construir Almacen Oro: ");
        System.out.println("4. Construir Almacen Elixir: ");
        Scanner lectura = new Scanner (System.in);
        String in = lectura.next();
        int opcion = 0;
        try {
            opcion = Integer.parseInt(in);
        }
        catch (NumberFormatException ex){
            ex.printStackTrace();
        }
        Edificios edificio = new Edificios();
        switch (opcion){
            case 1:
                edificio = ConstruirMina(aldea.Nivel);
                aldea.Edificios.add(edificio);
                System.out.println("Costo Oro: "+edificio.getOro()+" Elixir: "+edificio.getElixir()+" Gemas: "+ edificio.getGemas());

                break;
            case 2:
                edificio = ConstruirRecolectorElixir(aldea.Nivel);
                aldea.Edificios.add(edificio);
                System.out.println("Costo Oro: "+edificio.getOro()+" Elixir: "+edificio.getElixir()+" Gemas: "+ edificio.getGemas());

                break;
            case 3:
                edificio = ConstruirAlmacenOro(aldea.Nivel);
                aldea.Edificios.add(edificio);
                System.out.println("Costo Oro: "+edificio.getOro()+" Elixir: "+edificio.getElixir()+" Gemas: "+ edificio.getGemas());

                break;
            case 4:
                edificio = ConstruirAlmacenElixir(aldea.Nivel);
                aldea.Edificios.add(edificio);
                System.out.println("Costo Oro: "+edificio.getOro()+" Elixir: "+edificio.getElixir()+" Gemas: "+ edificio.getGemas());

                break;
        }

        Boolean isActualice = aldea.recursos.ActualizarRecursos(-edificio.getOro(),-edificio.getElixir(),-edificio.getGemas());
        if(!isActualice)
            System.out.println("No hay suficientes recursos disponibles");

            System.out.println("Recursos Disponibles Oro: "+aldea.recursos.getOro()+" Elixir: "+aldea.recursos.getElixir()+" Gemas: "+ aldea.recursos.getGemas());

    }
    public static void VerEdificios(Aldea aldea){

        for (int i=0;i<aldea.Edificios.size();i++) {
            System.out.println("Edificio "+i+" Nombre: "+aldea.Edificios.get(i).getNombre());
        }
    }
    public static Edificios ConstruirChoza(){
        String name = "Choza";
        Edificios edificio = new Edificios(name,0,0,0,0,0,0);
        return edificio;
    }
    public static Edificios ConstruirMina(int nivel){
        String name = "Mina Oro";
        Edificios edificio = new Edificios(name,0,150*nivel,0,1000*nivel,0,0);
        return edificio;
    }
    public static Edificios ConstruirRecolectorElixir(int nivel){
        String name = "Extractor Elixir";
        Edificios edificio = new Edificios(name,150*nivel,0,0,0,0,1000*nivel);
        return edificio;
    }
    public static Edificios ConstruirAlmacenOro(int nivel){
        String name = "Almacen de Oro";
        Edificios edificio = new Edificios(name,0,300*nivel,0,1500*nivel,0,0);
        return edificio;
    }
    public static Edificios ConstruirAlmacenElixir(int nivel){
        String name = "Almacen de Elixir";
        Edificios edificio = new Edificios(name,300*nivel,0,0,0,0,1500*nivel);
        return edificio;
    }

}