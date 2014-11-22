package classes;

public class Especie {

    private int codEspecie;
    private String especie;
    private int codRaca;

    public Especie() {

    }

    public Especie(int codEspecie, String especie) {
        this.codEspecie = codEspecie;
        this.especie = especie;
    }

    public int getCodEspecie() {
        return codEspecie;
    }

    public void setCodEspecie(int codEspecie) {
        this.codEspecie = codEspecie;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getCodRaca() {
        return codRaca;
    }

    public void setCodRaca(int codRaca) {
        this.codRaca = codRaca;
    }

}
