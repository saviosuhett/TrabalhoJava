package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Data {
	


	 public static  long  calcularData(String date1, String date2) {
		try {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");	
		Date dtEntrada1 = sdf.parse(date1);
		Date dataFinal = sdf.parse(date2);
		
		long diferencaDias = (dataFinal.getTime() - dtEntrada1.getTime()) / (24*60*60*1000);
		
		return diferencaDias;
		}
		
		catch (ParseException e) {
			return 0;
		}
	 
	 }
	

	 public static long tempoAdotado(String date2, Cao caoAdotado) {
		 try {
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");	
				Date now = new Date();
				Date dataAdotado = sdf.parse(date2);
				
				long diferencaDias = (now.getTime() - dataAdotado.getTime()) / (24*60*60*1000);
				
				return diferencaDias;
				}
				
				catch (ParseException e) {
					return 0;
				}
		 
	 }
	 
	 

	
	
}
