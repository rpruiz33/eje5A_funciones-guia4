package modelo;

import java.time.LocalDate;

import java.time.LocalTime;

public class Funciones {
	public static boolean biciesto(int anio) {
		return ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0));
	}
	// esFechaValida (LocalDate fecha) : boolean
	// En el caso de ser bisiesto es válido el día 29/02

	public static boolean esFechaValida(LocalDate date) {

		int anio = 2020;
//		boolean bisi=true;
//		System.out.println( bisi=biciesto(anio));
		if (biciesto(anio) == true) {
//			
			System.out.println(date);
			return true;
		} else {
			return false;
		}

	}
	// + traerFechaCorta (LocalDate fecha) : String

	public static String traerFechaCorta(LocalDate date) {
		return date.getDayOfMonth() + "/" + date.getMonthValue() + "/" + date.getYear();
	}

	// traerHoraCorta (LocalTime hora) : String
	// Retorna “hh:mm”
	public static String traerHoraCorta(LocalTime hora) {
		return hora.getHour() + ":" + hora.getMinute();
	}
	public static boolean esDiaHabil(LocalDate fecha){
		int d= fecha.getDayOfWeek().getValue();
		/*Help:
		LocalDate fecha=LocalDate.of (2019,9,30);
		int nroDiaSem=fecha.getDayOfWeek().getValue(); //nroDiaSem=1,from 1 (Monday) to 7
		(Sunday)*/
		return ((d>=1) &&( d<=5));
		}


}
