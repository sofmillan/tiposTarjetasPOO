import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {

    TarjetaCredito black = new Black("Visa",10000000,"299-98-98",1234,LocalDate.of(2025,02,03));
    black.imprimir();

    TarjetaCredito dorada = new Dorada("Master Card",2000000000,"123-56-56",8999,LocalDate.of(2026,8,03));
    dorada.imprimir();

    TarjetaCredito platino = new Platinum("American Express",300000000,"124-48-98",2545,LocalDate.of(2023,12,03));
    platino.imprimir();

    TarjetaCredito clasica = new Clasica("Visa",40000000,"155-98-85",4785,LocalDate.of(2023,12,03));
    clasica.imprimir();
    }
}