package clashofclans.simulacion;

public class Recursos {
    private int Oro;
    private int Elixir;
    private int Gemas;
    public Recursos() {
        this.Oro = 750;
        this.Elixir = 750;
        this.Gemas = 500;
    }

    public Boolean ActualizarRecursos(int oro, int elixir, int gemas) {
        if(this.Oro+oro<0){
            return  false;
        }
        if(this.Elixir+elixir<0){
            return  false;
        }
        if(this.Gemas+gemas<0){
            return  false;
        }
        this.Oro = this.Oro+oro;
        this.Elixir = this.Elixir+elixir;
        this.Gemas = this.Gemas+gemas;
        return true;
    }

    public int getOro() {
        return Oro;
    }

    public Recursos setOro(int oro) {
        Oro = oro;
        return this;
    }

    public int getElixir() {
        return Elixir;
    }

    public Recursos setElixir(int elixir) {
        Elixir = elixir;
        return this;
    }

    public int getGemas() {
        return Gemas;
    }

    public Recursos setGemas(int gemas) {
        Gemas = gemas;
        return this;
    }


}
