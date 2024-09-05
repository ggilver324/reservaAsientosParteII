package PruebaTecnicaAnfiteatroII;

import PruebaTecnicaAnfiteatroIIController.Funtion;
import PruebaTecnicaAnfiteatroIILogica.Cliente;
import PruebaTecnicaAnfiteatroIILogica.Ticket;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class PurebaTecnicaAnfiteatroII {

    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        List<Ticket> listaTicket = new ArrayList<Ticket>();
        Ticket ticket1 = new Ticket(12, 2, 3, 1500, new Date(), new Date());
        Ticket ticket2 = new Ticket(13, 2, 4, 1500, new Date(), new Date());

        Ticket ticket3 = new Ticket();
        ticket3.setNumero(20);
        ticket3.setFila(5);
        ticket3.setAsiento(1);
        ticket3.setPrecio(2300);
        ticket3.setFechaCompra(new Date());
        ticket3.setFechaValidez(new Date());

        listaTicket.add(ticket1);
        listaTicket.add(ticket2);
        listaTicket.add(ticket3);

        //suma de precios;
        double suma = 0.0;
        for(Ticket tick: listaTicket){
            suma = suma + tick.getPrecio();
        }
        System.out.println("Este es el total de precios es: " + suma);

        //Funtion.sumaTicket(listaTicket);

        //pedir fila al usuario

        System.out.println("Ingrese la fila de la que desea ver tickets");
        int fila = teclado.nextInt();

        boolean bandera = false;
        for(Ticket tick: listaTicket){
            if(tick.getFila() == fila){
                System.out.println(tick.toString());
                bandera = true;
            }
        }

        if(bandera == false){
            System.out.println("No se encontraron datos de la fila en cuestión");
        }

        //Prueba de cliente

        Cliente cli = new Cliente();
        cli.setId(1);
        cli.setDni("12345678");
        cli.setNombre("Suscribite");
        cli.setApellido("A TodoCode");
        cli.getListaTickets().add(ticket1);

        Ticket ticket4 = new Ticket(12, 4, 6, 1500, new Date(2023-10-12), new Date());

        cli.getListaTickets().add(ticket4);



    }

}
