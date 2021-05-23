package application;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		Date y1 = sdf1.parse("25/06/2018");
		Date y2 = sdf2.parse("25/06/2018 15:42:07");

		Date horaAtual = new Date();
		Date horaAtual2 = new Date(System.currentTimeMillis());

		System.out.println(y1);
		System.out.println(y2);
		System.out.println(sdf1.format(y1));
		System.out.println(sdf2.format(y2));

//		System.out.println("Hora atual: " + sdf2.format(horaAtual));
//		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
//		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
//		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
//		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
//		Date x1 = new Date();
//		Date x2 = new Date(System.currentTimeMillis());
//		Date x3 = new Date(0L);
//		Date x4 = new Date(1000L * 60L * 60L * 5L);
//		Date y1 = sdf1.parse("25/06/2018");
//		Date y2 = sdf2.parse("25/06/2018 15:42:07");
//		Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
//		System.out.println("x1: " + x1);
//		System.out.println("x2: " + x2);
//		System.out.println("x3: " + x3);
//		System.out.println("x4: " + x4);
//		System.out.println("y1: " + y1);
//		System.out.println("y2: " + y2);
//		System.out.println("y3: " + y3);
//		System.out.println("-------------");
//		System.out.println("x1: " + sdf2.format(x1));
//		System.out.println("x2: " + sdf2.format(x2));
//		System.out.println("x3: " + sdf2.format(x3));
//		System.out.println("x4: " + sdf2.format(x4));
//		System.out.println("y1: " + sdf2.format(y1));
//		System.out.println("y2: " + sdf2.format(y2));
//		System.out.println("y3: " + sdf2.format(y3));
//		System.out.println("-------------");
//		System.out.println("x1: " + sdf3.format(x1));
//		System.out.println("x2: " + sdf3.format(x2));
//		System.out.println("x3: " + sdf3.format(x3));
//		System.out.println("x4: " + sdf3.format(x4));
//		System.out.println("y1: " + sdf3.format(y1));
//		System.out.println("y2: " + sdf3.format(y2));
//		System.out.println("y3: " + sdf3.format(y3));
		
		
//		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
//		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
//		System.out.println(sdf.format(d));
//		Calendar cal = Calendar.getInstance();
//		cal.setTime(d);
//		cal.add(Calendar.HOUR_OF_DAY, 4);
//		d = cal.getTime();
//		System.out.println(sdf.format(d));
		
//		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
//		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
//		System.out.println(sdf.format(d));
//		Calendar cal = Calendar.getInstance();
//		cal.setTime(d);
//		int minutes = cal.get(Calendar.MINUTE);
//		int month = 1 + cal.get(Calendar.MONTH);
//		System.out.println("Minutes: " + minutes);
//		System.out.println("Month: " + month);
	}

}
