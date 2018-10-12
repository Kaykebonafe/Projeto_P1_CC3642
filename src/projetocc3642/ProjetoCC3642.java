package projetocc3642;

/**
 *
 * @author Kayke Bonafé de Luca
 *         R.A.: 22.217.003-7
 * 
 */

public class ProjetoCC3642 {
    /**
     * 
     * O main do programa
     * 
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException{
        
      
        Mundo m = new Mundo();
		
	m.geraVeiculos(); 
	m.desenhaMundo(); 
		
	while (true) {
            m.atualizaMundo(); 
            Thread.sleep(300);  
            
	}
        
    }
    
}
