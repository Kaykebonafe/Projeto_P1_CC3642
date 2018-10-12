package projetocc3642;

import java.util.Random;

/**
 *
 * @author Kayke Bonafé de Luca
 *         R.A.: 22.217.003-7
 * 
 */
public class Veiculo {
        
    ///Inicialização das variáveis    
    public Veiculo() {
        x = 0; 
        y = 0; 
        velocidade = 0; 
        fabrica = false; 
        cor = null; 
        
	}
    
    /**
     * Construtor da superclasse Veículo
     * Cria os veículos com variáveis que são recebidas na chamada das funções de cada veículo específico
     * 
     * @param x 
     * @param y
     * @param velocidade
     * @param cor
     * @param fabrica
     */
    
    public Veiculo(int x, int y, int velocidade, String cor, boolean fabrica) {   
        this.x = x;
        this.y = y;
        this.velocidade = velocidade;
        this.cor = cor;
        this.fabrica = fabrica;
                
    }
    
    ///Função que garante a posição randomica dos objetos
    Random r = new Random();
    
    /**
     * Seta um valor aleatório para o parâmetro x do veículo
     * 
     * @return O valor gerado para x
     */
    public int setX() {
        x =  r.nextInt(28);
        return x;
        
    }
    /**
     * Seta um valor aleatório para o parâmetro y do veículo
     * 
     * @return O valor gerado para y
     */
    public int setY() {
	y = r.nextInt(58);
	return y;
        
    }
    /**
     * @return O valor de x do veículo
     */
    public int getX() {
        return x;
        
    }

    /**
     * @return O valor de y do veículo
     */

    public int getY() {
        return y;
        
    }
    /**
     * Troca o valor de x de acordo com o que for passado pela função dos veiculos
     * 
     * @param x
     */

    public void MoveX(int x) {
        this.x = x;
        
    }
    /**
     * Troca o valor de x de acordo com o que for passado pela função dos veiculos 
     * 
     * @param y
     */
    
    public void MoveY(int y) {
	this.y = y;
        
    }
    

    /**
     * @return Se a posição do veículo é igual a da fábrica
     */

    public boolean isFabrica() {
        return fabrica;
    }
    /**
     * Define se o veículo está ou não dentro da fábrica, pois se estiver, um novo será gerado
     * 
     * @param fabrica 
     */

    public void setFabrica(boolean fabrica) {
        this.fabrica = fabrica;
    }

    
    /**
     * @return A cor do veículo
     */

    public String getCor() {
        return cor;
    }

    
    /**
     * @return A velocidade do veículo
     */

    public int getVelocidade() {
        return velocidade;
    }
    /**
     * Função random dos carros, para garantir a aleatoriedade dos movimentos dos carros
     */
    Random c = new Random();
    
    /**
     * Função que movimenta o carro, recebendo um objeto da classe carro como parâmetro
     * 
     * Como dito na função abaixo, a estrutura presente na função move carro é a mesma para as outras 3
     * 
     * @param carro
     */
    
    public void moveCarro(Carro carro){
        int mov;///Variável que recebe o número aleatório gerado pela função random
        
        mov = c.nextInt(4); ///Gerando um número aleatório para movimentação do veículo para cima, para baixo, para esquerda ou para a direita
  
        /**
         * Switch que verifica o resultado do random e o movimenta 
         */
        switch(mov) {
            case 0:
                int x1 = carro.getX(); ///Obtenção do valor atual da posição x
                x1 = x1 + 2;///Somando a velocidade do carro no valor atual do x 
                carro.MoveX(verificaX(x1));///Chamada da função moveX da classe Veículo para realizar a movimentação 
                                           ///Essa estrutura se repete nos próximos cases e nos próximos 2 veículos
            case 1:
                int x2 = carro.getX();
                x2 = x2 - 2;
                carro.MoveX(verificaX(x2));
                
            case 2:
                int y1 = carro.getY();
                y1 = y1 + 2;
                carro.MoveY(verificaY(y1));
            
            case 3:    
                int y2 = carro.getY();
                y2 = y2 - 2;
                carro.MoveY(verificaY(y2));
	          
        }
    }
    
    /**
     * Função random dos caminhões, para garantir a aleatoriedade dos movimentos dos mesmos
     */
    Random cam = new Random();
    
    /**
     * Função que movimenta o caminhão, recebendo um objeto da classe caminhão como parâmetro
     * @param caminhao
     */
    
    public void moveCaminhao(Caminhao caminhao){
         
        int mov;
        
        mov = cam.nextInt(4);
	
        switch (mov){
            case 0:
                int x1 = caminhao.getX(); 
                x1 = x1 + 1;
                caminhao.MoveX(verificaX(x1));
            
            case 1:
                int x2 = caminhao.getX();
                x2 = x2 - 1;
                caminhao.MoveX(verificaX(x2));
	
            case 2:
                int y1 = caminhao.getY();
                y1 = y1 + 1;
                caminhao.MoveY(verificaY(y1));
  
            case 3:
                int y2 = caminhao.getY();
                y2 = y2 - 1;
                caminhao.MoveY(verificaY(y2));
	}        
        
    }
    
   /**
     * Função random das motos, para garantir a aleatoriedade dos movimentos das mesmas
     */
    Random motoca = new Random();
     
    /**
     * Função que movimenta a motoca, recebendo um objeto da classe motoca como parâmetro
     * @param moto
     */
    public void moveMoto(Moto moto){
          
        int mov;
        
        mov = motoca.nextInt(4);
	
	switch(mov) {
            case 0:
                int x1 = moto.getX(); 
                x1 = x1 + 3;
                moto.MoveX(verificaX(x1)); 
	
            case 1:
                int x2 = moto.getX();
                x2 = x2 - 3;
                moto.MoveX(verificaX(x2));
            
            case 2:
                
                int y1 = moto.getY();
                y1 = y1 + 3;
                moto.MoveY(verificaY(y1));
		
            case 3:	
                int y2 = moto.getY();
                y2 = y2 - 3;
                moto.MoveY(verificaY(y2));
	}        
    }
    
    Random bici = new Random();
    
    public void moveBicicleta(Bicicleta bicicleta){
        
        int mov;
        
        mov = bici.nextInt(4);
        
        switch(mov) {
            case 0:
                int x1 = bicicleta.getX(); 
                x1 = x1 + 1;
                bicicleta.MoveX(verificaX(x1)); 
	
            case 1:
                int x2 = bicicleta.getX();
                x2 = x2 - 1;
                bicicleta.MoveX(verificaX(x2));
            
            case 2:
                
                int y1 = bicicleta.getY();
                y1 = y1 + 1;
                bicicleta.MoveY(verificaY(y1));
		
            case 3:	
                int y2 = bicicleta.getY();
                y2 = y2 - 1;
                bicicleta.MoveY(verificaY(y2));
	}        
        
    }
    
      /**
       * Função que verifica se o veículo chegou ao fim do mundo em x e reseta a coordenada
       * @param x
       * @return a coordenada resetada
       */
    public int verificaX(int x) {
       if (x >= 29) {
           x = 1;
       }
       if(x <= 0) {
          x = 28;
           
       }
        return x;
        
    }
      
    /**
     * Função que verifica se o veículo chegou ao fim do mundo em y e reseta a coordenada
     * @param y
     * @return a coordenada resetada
     */
    public int verificaY(int y) {
        if (y >= 59) {
            y = 1;
        }
        if(y <= 0) {
           y = 58;
        }
        return y;
    }  
    
    
    
    
    
        
    private int x; ///Coordenada x do veículo
    private int y; ///Coordenada x do veículo
    private int velocidade; ///Velocidade do veículo
    private boolean fabrica; ///Informa se o veículo está ou não em uma fábrica
    private String cor; ///Cor dos veículos
    
}
