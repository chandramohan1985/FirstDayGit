package org.libglobal;

import java.io.IOException;
public class BookingAdactin extends AdactinHotel {
	
public static void main(String[] args) throws IOException, InterruptedException {
	LibGlobal l = new LibGlobal();
	AdactinHotel a=new AdactinHotel();
	l.getDriver();
	l.loadUrl("https://adactinhotelapp.com");
	a.login(l.testDataRead(1, 0), l.testDataRead(1, 1));
	a.searchHotel(l.testDataRead(1, 2), l.testDataRead(1, 3), l.testDataRead(1, 4), l.testDataRead(1, 5), l.testDataRead(1, 6), l.testDataRead(1, 7), l.testDataRead(1, 8), l.testDataRead(1, 9));
	a.selectHotel();
	a.bookAHotel(l.testDataRead(1, 10), l.testDataRead(1, 11), l.testDataRead(1, 12), l.testDataRead(1, 13), l.testDataRead(1, 14), l.testDataRead(1, 15), l.testDataRead(1, 16), l.testDataRead(1, 17));
	a.BookingConfirm(1, 18);
	
	
	
	
	

	
	
	
	
	
	
	
}
}
