package frames8amclass;

public class booking {
public static void main(String[] args) throws InterruptedException {
	AdactinHotel a = new AdactinHotel();
    a.login("cm123456", "chandra1985");
	a.searchHotel(5,3,3,3,17/07/2021,18/07/2021, 2,3);
	a.selectHotel();
	a.bookAHotel("Chandra","Mohan","11/19,MGR Nagar,Chennai",4357389218264923l,3,12,5, 4567);
	a.BookingConfirm();	
}
}
