package hotel.java;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private List<Reserva> reservas;

    public Hotel() {
        this.reservas = new ArrayList<>();
    }

    public boolean verificarDisponibilidade(int numeroQuarto, LocalDateTime inicioReserva, LocalDateTime fimReserva) {
        for (Reserva reserva : reservas) {
            if (reserva.getNumeroQuarto() == numeroQuarto) {

                if (reserva.estaOcupado(inicioReserva) || reserva.estaOcupado((fimReserva))) {

                    return false;
                }
            }
        }
        return true;

    }

    public boolean adicionarReserva(Reserva reserva) {
        int numeroQuarto = reserva.getNumeroQuarto();
        LocalDateTime inicioReserva = reserva.getInicioReserva();
        LocalDateTime fimReserva = reserva.getFimReserva();
        if (!verificarDisponibilidade(numeroQuarto, inicioReserva, fimReserva)) {
            return false;
        }
        reservas.add(reserva);
        return true;
    }

    public boolean cancelarReserva(Long id) {
        for (Reserva reserva : reservas) {
            if (reserva.getId() == id) {
                reservas.remove(reserva);
                return true;
            }

        }
        return false;
    }

    public List<Reserva> getReservas() {
        return reservas;
    }
}
