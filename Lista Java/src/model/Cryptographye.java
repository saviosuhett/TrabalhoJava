package model;

public class Cryptographye {
	
	 public static String  encryp(String original, int x) {

	        String alfabeto = "abcdefghijklmnopqrstuvwxyz";
	        
	        String deslocado = alfabeto.substring(x) + alfabeto.substring(0, x);

	        StringBuilder cifra = new StringBuilder();
	        for (int i = 0; i < original.length(); i++) {
	            cifra.append(deslocado.charAt(original.charAt(i) - 'a'));
	        }

	        return cifra.toString();

	    }
	 
	 public static String decrypt(String nomeAlterado) {
	        StringBuilder temp = new StringBuilder();
	        for(int i=0; i<nomeAlterado.length(); i++) {
	                char  c = (char)((nomeAlterado.charAt(i) - 3 - 97) %26 +97);
	                if(c < 'a') {
	                    c = (char) (nomeAlterado.charAt(i) - 3 - 'a' + 'z' + 1);
	                }
	            temp.append(c);
	        }

	        return temp.toString();
	    }
}