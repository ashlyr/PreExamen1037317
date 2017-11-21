package preExamen;

public class primerProblema {
	
	private String frase;
	private int distancia;
	public String Salida1 = "";
	public String Salida2 = "";
	
	
	public primerProblema(String nFrase, int nDistancia) {
		// TODO Auto-generated constructor stub
		frase= nFrase;
		distancia=nDistancia;
		
	}
	
	
	public String cifrarCesar(String frase, int distancia) 
	{
		
		StringBuilder codigoCesar = new StringBuilder();
        distancia = distancia % 26;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) >= 'a' && frase.charAt(i) <= 'z') {
                if ((frase.charAt(i) + distancia) > 'z') {
                	codigoCesar.append((char) (frase.charAt(i) + distancia - 26));
                } else {
                	codigoCesar.append((char) (frase.charAt(i) + distancia));
                }
            } else if (frase.charAt(i) >= 'A' && frase.charAt(i) <= 'Z') {
                if ((frase.charAt(i) + distancia) > 'Z') {
                	codigoCesar.append((char) (frase.charAt(i) + distancia - 26));
                } else {
                	codigoCesar.append((char) (frase.charAt(i) + distancia));
                }
            }
        }
			
		
		return Salida1; 
	}
	
	
	public String cifrarCesar(String frase, String alfabeto, int distancia)
	{
		return Salida2;
	}
	
	
	    
	

}

