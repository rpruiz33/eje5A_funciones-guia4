package test;
import modelo.Funciones;
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
		LocalTime ahora = LocalTime.now();
		

		System.out.println(Funciones.biciesto(anio));
		System.out.println("fecha valida");
		System.out.println(Funciones.esFechaValida(date));
		System.out.println("fecha corta");
		System.out.println(Funciones.traerFechaCorta(date).toString());
		System.out.println("hora corta");
		System.out.println(Funciones.traerHoraCorta(ahora));
	}
	
	



	
}