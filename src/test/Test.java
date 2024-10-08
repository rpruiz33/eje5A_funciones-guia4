package test;
import modelo.Funciones;
import java.time.LocalDate;
import java.time.LocalTime;
public class Test {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
		LocalDate date = LocalDate.of(2023, 9, 4);
	System.out.println(date);//01-03-2019
		System.out.println(date.getYear()); //2019
		System.out.println(date.getMonthValue()); //03
		System.out.println(date.getDayOfMonth()); //01
		
		LocalDate dateFuturo = LocalDate.of(2024, 5, 9);
		System.out.println(dateFuturo);
		System.out.println(dateFuturo.getYear()); //2019
		System.out.println(dateFuturo.getMonthValue()); //03
		System.out.println(dateFuturo.getDayOfMonth()); //01
		System.out.println("COMPARANDO FECHAS-->ANTES");
		System.out.println("DATE Y DATEFUTURO --> "+ date.isBefore(dateFuturo));
		System.out.println("COMPARANDO FECHAS-->DESPUES");
		System.out.println("DATE Y DATEFUTURO --> "+ date.isAfter(dateFuturo));
		System.out.println("AGREGANDO MESES a date");
		System.out.println(date.plusMonths(4));
		System.out.println(date.plusDays(10));
		System.out.println(date.minusWeeks(8));
		System.out.println("ALGORTIMO BICIESTO");
		int anio=2022;
		LocalDate date12 = LocalDate.of(2020, 2, 29);
		LocalTime ahora = LocalTime.now();
		

		System.out.println(Funciones.biciesto(anio));
		System.out.println("FECHA VALIDA");
		System.out.println(Funciones.esFechaValida(date));
		System.out.println("FECHA CORTA");
		System.out.println(Funciones.traerFechaCorta(date).toString());
		System.out.println("HORA CORTA");
		System.out.println(Funciones.traerHoraCorta(ahora));
		System.out.println("TRAER DIA DE LA SEMANA");
		System.out.println(Funciones.traerDiaDeLaSemana(date));
		System.out.println("TRAER MES EN LETRAS");
		System.out.println(Funciones.traerMesEnLetras(date));
		System.out.println("TRAER FECHA LARGA");
		System.out.println(Funciones.traerFechaLarga(date));
		System.out.println("TRAER CANTIDAD DE DIAS DEL MES");
		System.out.println(Funciones.traerCantDiasDeUnMes(2021, 2));
		System.out.println("APROXIMACION DE 2 DECIMAL");
		System.out.println(Funciones.aproximar2Decimal(2.335));
		System.out.println("ES NUMERO");
		System.out.println(Funciones.esNumero('1'));
		System.out.println("ES LETRA");
		System.out.println(Funciones.esLetra('1'));
		System.out.println("ES CADENA DE NUMEROS");
		System.out.println(Funciones.esCadenaNros("9999"));
		System.out.println("ES CADENA DE LETRAS");
		System.out.println(Funciones.esCadenaLetras("asds"));
		System.out.println(Funciones.aproximar2Decimal(12.322));
		LocalDate f1= LocalDate.of(2023, 3, 20);
		LocalDate f2= LocalDate.of(2024, 5, 15);
		LocalDate f3=LocalDate.of(2024, 5, 15);
		System.out.println(Funciones. traerFechasEntre(f1 , f2, f3));
	}
	




	
}