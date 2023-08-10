public class Seguro {

    private float valor;
    private boolean vigencia;

    private Veiculo veiculo;
    private Cliente proprietario;
    private Cliente[] assegurados;

    // get é pegar
    public float getValor() {
        return valor;
    }

    // Set é colocar
    public void setValor(float newValor) {
        this.valor = newValor;
    }

    // get é pegar
    public boolean getVigencia() {
        return vigencia;
    }

    // Set é colocar
    public void setVigencia(boolean newVigencia) {
        this.vigencia = newVigencia;
    }
}
