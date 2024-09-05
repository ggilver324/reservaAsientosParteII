package PruebaTecnicaAnfiteatroIIController;


import PruebaTecnicaAnfiteatroIILogica.Ticket;
import java.util.List;

public class Funtion {

    public static void sumaTicket(List<PruebaTecnicaAnfiteatroIILogica.Ticket> listaTicket){
        double suma = 0.0;

        for(Ticket tick : listaTicket){
             suma = suma + tick.getPrecio();
        }
        System.out.println("Este es el total de precios es: " + suma);

    }
}
