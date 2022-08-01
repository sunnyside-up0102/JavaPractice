import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class SimpleDateFormatEx {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String strDate = "2022-8-1";
		
		java.util.Date d = null;
		
		try {
			d = sdf.parse(strDate);
		}catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println(d);
		
		SimpleDateFormat sf2 = new SimpleDateFormat("yyyy-MM-dd Eø‰¿œ");
		System.out.println(sf2.format(d));
	}

}
