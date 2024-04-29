package hotel.java;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDateTime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



public class HotelTester {
    private Hotel hotel;

    @BeforeEach
    public void setup() {
        hotel = new Hotel();

    }
@Test
public void ReservaFeliz(){
    LocalDateTime inicioReserva = LocalDateTime.of(2024, 06, 20, 16, 0);
    LocalDateTime fimReserva = LocalDateTime.of(2024, 06, 21, 16, 0);
    Reserva reserva = new Reserva(1L, 303, inicioReserva, fimReserva);  

    assertTrue(hotel.adicionarReserva(reserva));
    assertTrue(hotel.getReservas().contains(reserva));
   }

   @Test
   public void ReservaTriste(){
    LocalDateTime inicioReserva1 = LocalDateTime.of(2024, 06, 20, 16, 0);
    LocalDateTime fimReserva1 = LocalDateTime.of(2024, 06, 21, 16, 0);
    Reserva reserva = new Reserva(1L, 303, inicioReserva1, fimReserva1); 

    assertTrue(hotel.adicionarReserva(reserva));

    LocalDateTime inicioReserva2 = LocalDateTime.of(2024, 06, 20, 16, 0);
    LocalDateTime fimReserva2 = LocalDateTime.of(2024, 06, 21, 18, 0);
    Reserva reserva1 = new Reserva(1L, 303, inicioReserva2, fimReserva2); 

    // assertFalse(hotel.adicionarReserva(reserva1));
    assertFalse(hotel.getReservas().contains(reserva1));

   }

   @Test
   public void CancelarReserva(){
    LocalDateTime inicioReserva1 = LocalDateTime.of(2024, 06, 20, 16, 0);
    LocalDateTime fimReserva1 = LocalDateTime.of(2024, 06, 21, 16, 0);
    Reserva reserva = new Reserva(1L, 303, inicioReserva1, fimReserva1); 

    hotel.adicionarReserva(reserva);

    // hotel.cancelarReserva(1L);

    assertTrue(hotel.cancelarReserva(1L));
   }

}


