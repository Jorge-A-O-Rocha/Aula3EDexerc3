package controller;

public class modulos {
	public modulos() {
		super();
	}
	
    public double serie(int n) {
    	// Condição de parada é quando n for 1 pq nao tem com quem somar
        if (n == 1) { 
            return 1;
        } else {
        	//  n=3 1/3 + 1/2 + 1 = 1.83 vai subitraindo o n de um em um e somando os resultados
            return  1/(double) n + serie(n-1) ;
        }
    }


}
