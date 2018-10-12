package projetocc3642;
import java.util.ArrayList;

/**
 *
 * @author Kayke Bonafé de Luca
 *         R.A.: 22.217.003-7
 * 
 */
public class Mundo {
    
    ///Instanciando a superclasse Veiculo
    Veiculo v = new Veiculo();
    
    ///Criação dos ArrayLists
    ArrayList <Carro> c = new ArrayList<>();///ArrayList de Carros
    ArrayList <Caminhao> ca = new ArrayList<>();///ArrayList de Caminhões
    ArrayList <Bicicleta> b = new ArrayList<>();///ArrayList de Bicicletas
    ArrayList <Moto> m = new ArrayList<>();///ArrayList de Motos
    
    ///Mapa do mundo
    public int mapa[][] = {
        {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,6,6,6,6,6,6,6,6,6,6,6,6,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,6,6,6,6,6,6,6,6,6,6,6,6,0,0,0,0,1},
        {1,0,0,0,0,6,6,6,6,6,6,6,6,6,6,6,6,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,6,6,6,6,6,6,6,6,6,6,6,6,0,0,0,0,1},
        {1,0,0,0,0,6,6,6,6,6,6,6,6,6,6,6,6,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,6,6,6,6,6,6,6,6,6,6,6,6,0,0,0,0,1},
        {1,0,0,0,0,6,6,6,6,6,6,6,6,6,6,6,6,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,6,6,6,6,6,6,6,6,6,6,6,6,0,0,0,0,1},
        {1,0,0,0,0,6,6,6,6,6,6,6,6,6,6,6,6,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,6,6,6,6,6,6,6,6,6,6,6,6,0,0,0,0,1},
        {1,0,0,0,0,6,6,6,6,6,6,6,6,6,6,6,6,0,0,0,0,0,0,0,6,6,6,6,6,6,6,6,6,6,6,6,0,0,0,0,0,0,0,6,6,6,6,6,6,6,6,6,6,6,6,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,6,6,6,6,6,6,6,6,6,6,6,6,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,6,6,6,6,6,6,6,6,6,6,6,6,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,6,6,6,6,6,6,6,6,6,6,6,6,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,6,6,6,6,6,6,6,6,6,6,6,6,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,6,6,6,6,6,6,6,6,6,6,6,6,0,0,0,0,0,0,0,6,6,6,6,6,6,6,6,6,6,6,6,0,0,0,0,0,0,0,6,6,6,6,6,6,6,6,6,6,6,6,0,0,0,0,1},
        {1,0,0,0,0,6,6,6,6,6,6,6,6,6,6,6,6,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,6,6,6,6,6,6,6,6,6,6,6,6,0,0,0,0,1},
        {1,0,0,0,0,6,6,6,6,6,6,6,6,6,6,6,6,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,6,6,6,6,6,6,6,6,6,6,6,6,0,0,0,0,1},
        {1,0,0,0,0,6,6,6,6,6,6,6,6,6,6,6,6,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,6,6,6,6,6,6,6,6,6,6,6,6,0,0,0,0,1},
        {1,0,0,0,0,6,6,6,6,6,6,6,6,6,6,6,6,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,6,6,6,6,6,6,6,6,6,6,6,6,0,0,0,0,1},
        {1,0,0,0,0,6,6,6,6,6,6,6,6,6,6,6,6,0,0,0,0,0,0,0,6,6,6,6,6,6,6,6,6,6,6,6,0,0,0,0,0,0,0,6,6,6,6,6,6,6,6,6,6,6,6,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,6,6,6,6,6,6,6,6,6,6,6,6,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,6,6,6,6,6,6,6,6,6,6,6,6,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,6,6,6,6,6,6,6,6,6,6,6,6,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,6,6,6,6,6,6,6,6,6,6,6,6,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,6,6,6,6,6,6,6,6,6,6,6,6,0,0,0,0,0,0,0,6,6,6,6,6,6,6,6,6,6,6,6,0,0,0,0,0,0,0,6,6,6,6,6,6,6,6,6,6,6,6,0,0,0,0,1},
        {1,0,0,0,0,6,6,6,6,6,6,6,6,6,6,6,6,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,6,6,6,6,6,6,6,6,6,6,6,6,0,0,0,0,1},
        {1,0,0,0,0,6,6,6,6,6,6,6,6,6,6,6,6,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,6,6,6,6,6,6,6,6,6,6,6,6,0,0,0,0,1},
        {1,0,0,0,0,6,6,6,6,6,6,6,6,6,6,6,6,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,6,6,6,6,6,6,6,6,6,6,6,6,0,0,0,0,1},
        {1,0,0,0,0,6,6,6,6,6,6,6,6,6,6,6,6,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,6,6,6,6,6,6,6,6,6,6,6,6,0,0,0,0,1},
        {1,0,0,0,0,6,6,6,6,6,6,6,6,6,6,6,6,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,6,6,6,6,6,6,6,6,6,6,6,6,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
    };
    
    ///Função que desenha o mundo
    public void desenhaMundo() {
        
        ///Variáveis que contém as cores dos itens no mapa
        String bicicletaColorida = "\u001B[34m";///Código ANSI refetente a cor Azul
        String caminhaoColorido = "\u001B[32m";///Código ANSI referente a cor Verde
        String carroColorido = "\u001B[35m";///Código ANSI referente a cor Roxa
        String fabrica = "\u001B[33m";///Código ANSI referente a cor Amarela
        String fimDoMapa = "\u001B[30m";///Código ANSI referente a cor Preta
        String fundoDoMapa = "\u001B[37m";///Código ANSI referente a cor Branca
        String motoColorida = "\u001B[31m";///Código ANSI referente a cor Vermelha   
	
        ///Contadores do número de veículos presentes na simulação
        int bicicletas = 0;
        int caminhoes = 0;
	int carros = 0;
	int motos = 0;
		
        ///Iterações que geram o mapa
	for(int i = 0; i<30; i++) {
            for(int j = 0; j < 60; j++) {
		
                if(mapa[i][j] == 0) {
                    System.out.print(fundoDoMapa + "█");
		}			
                else if(mapa[i][j] == 1) {
                    System.out.print(fimDoMapa + "█");
		}		
                else if(mapa[i][j] == 3){
                    System.out.print(carroColorido + "█");
		}
		else if(mapa[i][j] == 4){
                    System.out.print(caminhaoColorido + "█");
		}
		else if(mapa[i][j] == 5){
                    System.out.print(motoColorida + "█");
		}
		else if(mapa[i][j] == 6) {
                    System.out.print(fabrica + "█");
		}
                else if(mapa[i][j] == 20) {
                    System.out.print(bicicletaColorida + "█");
                }			
            }		
            System.out.println("");
	}	
			
        ///Print das legendas
        System.out.print(bicicletaColorida + "█");
        System.out.print(" Bicicletas   ");
	System.out.print(carroColorido + "█");
	System.out.print(" Carros   ");
	System.out.print(caminhaoColorido + "█");
	System.out.print(" Caminhão   ");
	System.out.print(motoColorida + "█");
	System.out.println(" Motos   ");
			
        ///Contadores	
        for(int a = 0; a < b.size(); a++){
            bicicletas++;
        }
	for(int a = 0; a < c.size(); a++) {
            carros++;
	}
	for(int a = 0; a < ca.size(); a++) {
            caminhoes++;
	}
	for(int a = 0; a < m.size(); a++) {
            motos++;
	}
	System.out.println("Bicicletas: " + bicicletas);		
	System.out.println("Carros: " + carros);
	System.out.println("Caminhoes: " + caminhoes);
	System.out.println("Motos: " + motos);
        
    }
       
    ///Função que limpa o rastro dos veículos
    public void zeraMapa() {
        
        for(int i = 0; i<30; i++) {
            for(int j = 0; j < 60; j++) {
                if(mapa[i][j] != 1 && mapa[i][j] != 6) {
                    mapa[i][j] = 0;
                }
            }
        }
        ///Adição de novos veículos ao mapa
        for (int a = 0; a < c.size(); a++) {
            ///Coordenadas no plano cartesiano
            int xc = c.get(a).getX();                        
            int yc = c.get(a).getY();
			
            for(int i = 0; i<30; i++) {
		for(int j = 0; j < 60; j++) {
                    if(i == xc && j == yc) {
                        if(mapa[i][j] == 6) {
                            mapa[i][j] = 6; 				
			}
			else {
			mapa[i][j] = 3;
			}
                    }
		}
            }
	}
        
        ///Adição de novos veículos ao mapa
        for(int a  = 0; a < ca.size(); a++) {
            ///Coordenadas no plano cartesiano
            int xca = ca.get(a).getX();
            int yca = ca.get(a).getY();
			
            for(int i = 0; i<30; i++) {
                for(int j = 0; j < 60; j++) {
                    if(i == xca && j == yca) {
                        if(mapa[i][j] == 6) {
                            mapa[i][j] = 6;
							
                        }
                        else {
                            mapa[i][j] = 4;
                        }
                    }
                }
            }
        }
	///Adição de novos veículos ao mapa	
        for(int a = 0; a < m.size(); a ++) {
            ///Coordenadas no plano cartesiano
            int xm = m.get(a).getX();
            int ym = m.get(a).getY();
			
            for(int i = 0; i<30; i++) {
                for(int j = 0; j < 60; j++) {
                    if(i == xm && j == ym) {
                        if(mapa[i][j] == 6) {
                            mapa[i][j] = 6;
							
                        }
                        else {
                            mapa[i][j] = 5;
                        }
                    }
                }
            }	
        }
        ///Adição de novos veículos ao mapa	
        for(int a = 0; a < b.size(); a ++) {
            ///Coordenadas no plano cartesiano
            int xb = b.get(a).getX();
            int yb = b.get(a).getY();
			
            for(int i = 0; i<30; i++) {
                for(int j = 0; j < 60; j++) {
                    if(i == xb && j == yb) {
                        if(mapa[i][j] == 6) {
                            mapa[i][j] = 6;
							
                        }
                        else {
                            mapa[i][j] = 20;
                        }
                    }
                }
            }	
        }
    }
    
   ///Função que gera os veículos randomicamente
   public void geraVeiculos() {
	for(int i = 0; i < 10; i++) {
            
            b.add(new Bicicleta((v.setX()+1), (v.setY()+1), 1, "azul", false));
            ///Esse while verifica se a localização do veículo gerado é igual a localização da fábrica, se sim, troca ele de lugar, se repete para os outros
            while (mapa[b.get(i).getX()][b.get(i).getY()] == 6) {
                b.get(i).setX();
                b.get(i).setY();
                            
            }
            
            ca.add(new Caminhao((v.setX()+1), (v.setY()+1), 1, "verde", false));
            
            while (mapa[ca.get(i).getX()][ca.get(i).getY()] == 6) {
                ca.get(i).setX();
                ca.get(i).setY();
                            
            }
            
            c.add(new Carro((v.setX()+1), (v.setY()+1), 2, "roxo", false));
            
            while (mapa[c.get(i).getX()][c.get(i).getY()] == 6) {
                c.get(i).setX();
                c.get(i).setY();
                        
            }

            m.add(new Moto((v.setX()+1), (v.setY()+1), 3, "vermelho", false));
            
            while (mapa[m.get(i).getX()][m.get(i).getY()] == 6) {
                m.get(i).setX();
                m.get(i).setY();
                            
            }
	}		
    }
    
    ///Função de detecção de colisão
    public void detectaColisao() {
        
        /// Colisão de bicicleta com bicicleta	
	for (int i = 0; i < b.size(); i ++) {
            for (int j = 0; j < b.size(); j++) {
		if(b.get(j).getX() == b.get(i).getX() && b.get(j).getY() == b.get(i).getY()) {
                    if(i == j) {
						
                    }
                    else {
			b.remove(b.get(i));
                    }	
		}
            }
        }
        
        /// Colisão de caminhão com caminhão	
	for (int i = 0; i < ca.size(); i ++) {
            for (int j = 0; j < ca.size(); j++) {
		if(ca.get(j).getX() == ca.get(i).getX() && ca.get(j).getY() == ca.get(i).getY()) {
                    if(i == j) {
						
                    }
                    else {
			ca.remove(ca.get(i));
                    }	
		}
            }
        }
        
        /// Colisão de carro com carro
	for (int i = 0; i < c.size(); i ++) {
            for (int j = 0; j < c.size(); j++) {
		if(c.get(j).getX() == c.get(i).getX() && c.get(j).getY() == c.get(i).getY()) {
                    if (i == j) { 
						
                    }
                    else {
			c.remove(c.get(i));
                    }	
		}
            }
	}
		
	/// Colisão de moto com moto
	for (int i = 0; i < m.size(); i ++) {
            for (int j = 0; j < m.size(); j++) {
		if(m.get(j).getX() == m.get(i).getX() && m.get(j).getY() == m.get(i).getY()) {
                    if(i == j) {
						
                    }
                    else {
			m.remove(m.get(i));
                    }	
		}
            }
	}
		
        /// Colisão entre caminhão e bicicleta
	for(int i = 0; i < ca.size(); i++) {
            for (int j = 0; j < b.size(); j++) {
                if(b.get(j).getX() == ca.get(i).getX() && b.get(j).getY() == ca.get(i).getY()) {
                    if(ca.size() > b.size()) {
						
                    }
                    else {
        		b.remove(b.get(j));
                    }
		}
            }
	}
        
	/// Colisão entre caminhão e carro
	for(int i = 0; i < ca.size(); i++) {
            for (int j = 0; j < c.size(); j++) {
                if(c.get(j).getX() == ca.get(i).getX() && c.get(j).getY() == ca.get(i).getY()) {
                    if(ca.size() > c.size()) {
						
                    }
                    else {
        		c.remove(c.get(j));
                    }
		}
            }
	}
		
	/// Colisão entre caminhão e moto
	for(int i = 0; i < ca.size(); i++) {
            for (int j = 0; j < m.size(); j++) {
		if(m.get(j).getX() == ca.get(i).getX() && m.get(j).getY() == ca.get(i).getY()) {
                    if(ca.size() > m.size()) {
						
                    }
                    else {
			m.remove(m.get(j));
                    }
		}
            }
	}
		
        /// Colisão entre carro e bicicleta
	for(int i = 0; i < c.size(); i++) {
            for (int j = 0; j < b.size(); j++) {
		if(b.get(j).getX() == c.get(i).getX() && b.get(j).getY() == c.get(i).getY()) {
                    if(c.size()>b.size()) {
						
                    }
                    else {
			b.remove(b.get(i));
                    }			
		}
            }
	}
        
	/// Colisão entre carro e moto
	for(int i = 0; i < c.size(); i++) {
            for (int j = 0; j < m.size(); j++) {
		if(m.get(j).getX() == c.get(i).getX() && m.get(j).getY() == c.get(i).getY()) {
                    if(c.size()>m.size()) {
						
                    }
                    else {
			m.remove(m.get(i));
                    }			
		}
            }
	}
        
        /// Colisão de moto com bicicleta
	for (int i = 0; i < m.size(); i ++) {
            for (int j = 0; j < b.size(); j++) {
		if(b.get(j).getX() == m.get(i).getX() && b.get(j).getY() == m.get(i).getY()) {
                    if(m.size() > b.size()) {
						
                    }
                    else {
			b.remove(b.get(i));
                    }	
		}
            }
	}
        
    }
	
    ///Função que gera um veículo novo assim que o mesmo passa por uma fábrica
    public void geraVeiculo() {
        
        ///Bicicleta
        for(int a = 0; a < b.size(); a++) {
            int x = b.get(a).getX();
            int y = b.get(a).getY();
           
            for(int i = 0; i < 30; i ++) {
                for(int j = 0; j < 60; j++) {
                    if(i == x && j == y) {
                        if(mapa[i][j] == 6 && b.get(a).isFabrica() == false) {
                            b.get(a).setFabrica(true);
                            b.add(new Bicicleta((v.setX()+1), (v.setY()+1), 1, "azul", false));
                        }
                    }
                }
            }
	}
        
        ///Carro
	for(int a = 0; a < c.size(); a++) {
            int x = c.get(a).getX();
            int y = c.get(a).getY();
            
            for(int i = 0; i < 30; i ++) {
		for(int j = 0; j < 60; j++) {
                    if(i == x && j == y) {
			if(mapa[i][j] == 6 && c.get(a).isFabrica() == false) {
                            c.get(a).setFabrica(true);///O veículo não gera mais um outro veículo se ele ja foi gerado antes 
                            c.add(new Carro((v.setX()+1), (v.setY()+1), 2, "roxo", false));
			}
                    }
		}
            }
        }
	///Caminhão	
	for(int a = 0; a < ca.size(); a++) {
            int x = ca.get(a).getX();
            int y = ca.get(a).getY();
           
            for(int i = 0; i < 30; i ++) {
		for(int j = 0; j < 60; j++) {
                    if(i == x && j == y) {
			if(mapa[i][j] == 6 && ca.get(a).isFabrica() == false) {
                            ca.get(a).setFabrica(true);
                            ca.add(new Caminhao((v.setX()+1), (v.setY()+1), 1, "verde", false));
			}
                    }
		}
            }
	}
        
	///Moto	
	for(int a = 0; a < m.size(); a++) {
            int x = m.get(a).getX();
            int y = m.get(a).getY();
            
            for(int i = 0; i < 30; i ++) {
                for(int j = 0; j < 60; j++) {
                    if(i == x && j == y) {
                        if(mapa[i][j] == 6 && m.get(a).isFabrica() == false) {
                            m.get(a).setFabrica(true);
                            m.add(new Moto((v.setX()+1), (v.setY()+1), 3, "vermelho", false));
                        }
                    }
                }
            }
	}
    }
    	
    ///Função que "movimenta" os veículos
    public void atualizaMundo() {
	for(int i = 0; i < c.size(); i++) {
            c.get(i).moveCarro(c.get(i));
	}
		
	for (int i = 0; i < ca.size(); i ++) {
            ca.get(i).moveCaminhao(ca.get(i));
        }
		
	for (int i = 0; i < m.size(); i ++) {
            m.get(i).moveMoto(m.get(i));
	}
        
        for (int i = 0; i < b.size(); i++) {
            b.get(i).moveBicicleta(b.get(i));
        }
		
	geraVeiculo();
	detectaColisao();
	zeraMapa();
	desenhaMundo();
    }

}
    
    
