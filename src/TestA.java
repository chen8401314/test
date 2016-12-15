import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class TestA {
	public static void main(String[] args) {
		try {
			//System.out.println(daysBetween("2016-09-16","2016-09-10"));
			getDateList();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static int daysBetween(String smdatestr, String bdatestr) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date smdate = sdf.parse(smdatestr);
		Date bdate = sdf.parse(bdatestr);
		Calendar cal = Calendar.getInstance();
		cal.setTime(smdate);
		long time1 = cal.getTimeInMillis();
		cal.setTime(bdate);
		long time2 = cal.getTimeInMillis();
		long between_days = (time2 - time1) / (1000 * 3600 * 24);
		return Integer.parseInt(String.valueOf(between_days));
	}
	
	public static void getDateList() {
		try {
			ArrayList list = new ArrayList();
		    Calendar ca = Calendar.getInstance();
			ca.setTime(new Date());
			for(int i=0;i<15;i++){
		    if(ca.get(Calendar.DAY_OF_MONTH)<=28){		
		      list.add(ca.get(Calendar.DAY_OF_MONTH));
		    }
		    ca.add(Calendar.DAY_OF_MONTH, -1);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

		
	}
	
}
