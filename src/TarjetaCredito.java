import java.time.LocalDate;

public class TarjetaCredito {
    private String emisor;

    private long cupo;

    private String numeroTarjeta;

    private int cvv;

    private LocalDate fechaVencimiento;

    public TarjetaCredito() {

    }

    public TarjetaCredito(String emisor, long cupo, String numeroTarjeta, int cvv, LocalDate fechaVencimiento) {
        this.emisor = emisor;
        this.cupo = cupo;
        this.numeroTarjeta = numeroTarjeta;
        this.cvv = cvv;
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getEmisor() {
        return this.emisor;
    }

    public void setEmisor(String emisor) {
        this.emisor = emisor;
    }

    public long getCupo() {
        return this.cupo;
    }

    public void setCupo(long cupo) {
        this.cupo = cupo;
    }

    public String getNumeroTarjeta() {
        return this.numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public int getCvv() {
        return this.cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public LocalDate getFechaVencimiento() {
        return this.fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public void imprimir(){
        System.out.println("** DATOS **");
        System.out.println("\nEmisor: "+this.emisor+"\n Cupo: "+this.cupo+"\n Numéro de la tarjeta: "+this.numeroTarjeta+"\n cvv: "+this.cvv+" \n Fecha de vencimiento: "+this.fechaVencimiento+"\n\n");
    }
}
