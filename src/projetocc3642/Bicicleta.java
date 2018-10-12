package projetocc3642;

/**
 *
 * @author Kayke Bonafé de Luca
 *         R.A.: 22.217.003-7
 * 
 */
public class Bicicleta extends Veiculo {
    
    Veiculo v = new Veiculo();
    
    /**
     * Construtor da clase Bicicleta que usa a função super para cahamr o construtor da Superclasse Veiculo
     *
     * @param x
     * @param y
     * @param velocidade
     * @param cor
     * @param fabrica
     */
    public Bicicleta(int x, int y, int velocidade, String cor, boolean fabrica){
        super(x, y, velocidade, cor, fabrica);
    }
    
}
