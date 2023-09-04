package test;

import java.time.LocalDate;
import java.time.LocalTime;
public class Test {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		LocalDate date = LocalDate.of(2023, 9, 4);
//		System.out.println(date);//01-03-2019
//		System.out.println(date.getYear()); //2019
//		System.out.println(date.getMonthValue()); //03
//		System.out.println(date.getDayOfMonth()); //01
//		
//		LocalDate dateFuturo = LocalDate.of(2024, 5, 9);
//		System.out.println(dateFuturo);
////		System.out.println(dateFuturo.getYear()); //2019
////		System.out.println(dateFuturo.getMonthValue()); //03
////		System.out.println(dateFuturo.getDayOfMonth()); //01
//		System.out.println("COMPARANDO FECHAS-->ANTES");
//		System.out.println("DATE Y DATEFUTURO --> "+ date.isBefore(dateFuturo));
//		System.out.println("COMPARANDO FECHAS-->DESPUES");
//		System.out.println("DATE Y DATEFUTURO --> "+ date.isAfter(dateFuturo));
//		System.out.println("AGREGANDO MESES a date");
//		System.out.println(date.plusMonths(4));
//		System.out.println(date.plusDays(10));
//		System.out.println(date.minusWeeks(8));
		System.out.println("ALGORTIMO BICIESTO");
		int anio=2022;
		LocalDate date = LocalDate.of(2020, 2, 29);
		System.out.println(biciesto(anio));
		System.out.println("fecha valida");
		System.out.println(esFechaValida(date));
		System.out.println("fecha corta");
		System.out.println(traerFechaCorta(date).toString());

	}
	
	public static boolean biciesto(int anio) {
		return   ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) ;
	}
	//esFechaValida (LocalDate fecha) : boolean
	//En el caso de ser bisiesto es válido el día 29/02


	public static boolean esFechaValida(LocalDate date) {
		
		int anio=2020;
		boolean bisi=true;
		System.out.println( bisi=biciesto(anio));
		if (bisi==true) {
//			
			System.out.println(date);
			return true;
		}
		else {
			return false;
		}

	}
	//+ traerFechaCorta (LocalDate fecha) : String

	public static String traerFechaCorta(LocalDate date) {
		return date.getDayOfMonth()+"/"+date.getMonthValue()+"/"+date.getYear();
		
	}
	



	
}