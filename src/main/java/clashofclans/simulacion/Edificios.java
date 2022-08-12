package clashofclans.simulacion;

public class Edificios extends Thread{
    private String Nombre;
    //COSTO
    private int Oro;
    private int Elixir;
    private int Gemas;
    //PRODUCCION
    private int ProduccionOro;
    private int ProduccionGemas;
    private int ProduccionElixir;

    public Edificios(String  nombre, int oro, int elixir, int gemas,int produccionOro, int produccionGemas, int produccionElixir) {
        this.Nombre = nombre;
        this.Oro = oro;
        this.Elixir = elixir;
        this.Gemas = gemas;
        this.ProduccionOro = produccionOro;
        this.ProduccionGemas = produccionGemas;
        this.ProduccionElixir = produccionElixir;
    }
    public Edificios() {
        this.Nombre = null;
        this.Oro = 0;
        this.Elixir = 0;
        this.Gemas = 0;
        this.ProduccionOro = 0;
        this.ProduccionGemas = 0;
        this.ProduccionElixir = 0;
    }

    public int getProduccionOro() {
        return ProduccionOro;
    }

    public Edificios setProduccionOro(int produccionOro) {
        ProduccionOro = produccionOro;
        return this;
    }

    public int getProduccionGemas() {
        return ProduccionGemas;
    }

    public Edificios setProduccionGemas(int produccionGemas) {
        ProduccionGemas = produccionGemas;
        return this;
    }

    public int getProduccionElixir() {
        return ProduccionElixir;
    }

    public Edificios setProduccionElixir(int produccionElixir) {
        ProduccionElixir = produccionElixir;
        return this;
    }

    public String getNombre() {
        return Nombre;
    }

    public Edificios setNombre(String nombre) {
        Nombre = nombre;
        return this;
    }

    public int getOro() {
        return Oro;
    }

    public Edificios setOro(int oro) {
        Oro = oro;
        return this;
    }

    public int getElixir() {
        return Elixir;
    }

    public Edificios setElixir(int elixir) {
        Elixir = elixir;
        return this;
    }

    public int getGemas() {
        return Gemas;
    }

    public Edificios setGemas(int gemas) {
        Gemas = gemas;
        return this;
    }

}
