package modelo;
import java.time.LocalDate;
import java.time.LocalTime;
public class Funciones {
	public static boolean biciesto(int anio) {
		return   ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) ;
	}

}
