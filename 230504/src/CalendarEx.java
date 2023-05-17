import java.util.Calendar;
public class CalendarEx {
	public static void printCalendar(String msg, Calendar cal) {
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1; // get()은 0~30까지의 정수 리턴
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK); // return 타입 int
		int hour = cal.get(Calendar.HOUR);
		int hourOfDay = cal.get(Calendar.HOUR_OF_DAY);
		int ampm = cal.get(Calendar.AM_PM);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		int millisecond = cal.get(Calendar.MILLISECOND);
		
		System.out.print(msg + year + "/" + month + "/" + day + "/ ");
		switch(dayOfWeek) { // return이 int 타입이므로 문자로 변환 필요
		case Calendar.SUNDAY : System.out.print("일요일"); break;
		case Calendar.MONDAY : System.out.print("월요일"); break;
		case Calendar.TUESDAY : System.out.print("화요일"); break;
		case Calendar.WEDNESDAY : System.out.print("수요일"); break;
		case Calendar.THURSDAY : System.out.print("목요일"); break;
		case Calendar.FRIDAY : System.out.print("금요일"); break;
		case Calendar.SATURDAY : System.out.print("토요일"); break;
		}
		
		System.out.print("(" + hourOfDay + "시) ");
		if(ampm == Calendar.AM) // return int 타입이므로 문자로 변환
			System.out.print("오전 ");
		else
			System.out.print("오후 ");
		
		System.out.println(hour + "시 " + minute + "분 " + second + "초 " + millisecond + "밀리초");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar now = Calendar.getInstance();
		printCalendar("현재 ", now);
		
		Calendar firstDate = Calendar.getInstance();
		firstDate.clear(); // firstDate 초기화
		
		// 2014년 5월 8일. 5월을 표현하기 위해 month에 4로 설정
		firstDate.set(2014, 4, 8);
		firstDate.set(Calendar.HOUR_OF_DAY, 20); // 저녁 8시
		firstDate.set(Calendar.MINUTE, 30); // 30분
		printCalendar("처음 만난 날은 ", firstDate);
		
		// 처음 만난 날부터 오늘까지의 기간 계산하기
		long period = now.getTimeInMillis() - firstDate.getTimeInMillis(); // 기간 넣을 변수 생성 및 초기화
		
		long years = (period / (365 * 24 * 60 * 60 * 1000L));
		long days = (period / (24 * 60 * 60 * 1000L)) % 365;
		long hours = (period / (60 * 60 * 1000L)) % 24;
		long minutes = (period / (60 * 1000L)) % 60;
		long seconds = (period / 1000) % 60;
		long result = (long) Math.ceil(period /(60*1000*60*24));
		
		System.out.println("만난 지 " + years + "년 " + days + "일 " + hours + "시간 " + minutes + "분 " + seconds + "초 이고,");
		System.out.println("총 " + result + "일 입니다.");
	}

}
