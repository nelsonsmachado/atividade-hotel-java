package hotel.java;



import java.time.LocalDateTime;

public class Reserva {
    private Long id;
    private int numeroQuarto;
    private LocalDateTime inicioReserva;
    private LocalDateTime fimReserva;

    public Reserva(Long id, int numeroQuarto, LocalDateTime inicioReserva, LocalDateTime fimReserva) {
        this.id = id;
        this.numeroQuarto = numeroQuarto;
        this.inicioReserva = inicioReserva;
        this.fimReserva = fimReserva;
    }

    public Long getId() {
        return id;
    }

    public int getNumeroQuarto() {

        return numeroQuarto;
    }

    public LocalDateTime getInicioReserva() {
        return inicioReserva;
    }

    public LocalDateTime getFimReserva() {
        return fimReserva;
    }

    public boolean estaOcupado(LocalDateTime verificarReserva) {
        return verificarReserva.isAfter(inicioReserva) && verificarReserva.isBefore(fimReserva);
    }
}
