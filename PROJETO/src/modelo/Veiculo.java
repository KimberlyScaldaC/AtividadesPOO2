public class Veiculo {

    private int ano;
    private String marca;
    private String cor;
    private String placa;

    private Modelo modelo;

    // get é pegar
    public int getAno() {
        return ano;
    }

    // Set é colocar
    public void setAno(int newAno) {
        this.ano = newAno;
    }

    // get é pegar
    public String getMarca() {
        return marca;
    }

    // Set é colocar
    public void setMarca(String newMarca) {
        this.marca = newMarca;
    }
    // get é pegar
    public String getCor() {
        return cor;
    }

    // Set é colocar
    public void setCor(String newCor) {
        this.cor = newCor;
    }

    // get é pegar
    public String getPlaca() {
        return placa;
    }

    // Set é colocar
    public void setPlaca(String newPlaca) {
        this.placa = newPlaca;
    }
}
