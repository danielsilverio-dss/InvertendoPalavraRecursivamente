
public class InvertePalavraRecursivamente {

	public static void main(String[] args) {
		
		System.out.println(invertePalavra("Palavra a ser invertida"));
		
	}
	
	public static String invertePalavraImprimindo(String palavra){		
		if(palavra.length() == 1){
			System.out.print(palavra);
			return palavra;
		}else{
			int tamanho = palavra.length();
			System.out.print( palavra.substring(tamanho - 1,tamanho) );
			return invertePalavra(palavra.substring(0, tamanho - 1));
		}
	}
	
	public static String invertePalavra(String palavra){
		if(palavra.length() == 1){
			return palavra;
		}else{
			int tamanho = palavra.length();
			String ultimaLetra = palavra.substring(tamanho - 1, tamanho);
			return ultimaLetra + invertePalavra(palavra.substring(0, tamanho - 1));
		}
	}
	
}


