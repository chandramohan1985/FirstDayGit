package com.pages;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AdactinBook extends LibGlobal {

	

	@Parameters({"username","password","location","hotels","room_type","room_nos","datepick_in","datepick_out","adult_room","child_room","first_name","last_name","address","cc_num","cc_type","cc_exp_month","cc_exp_year","cc_cvv","order_no"})
@Test
	private void bookingInfo(String s,String s1,String s2,String s3,String s4,String s5,String s6,String s7,String s8,String s9,String s10,String s11,String s12,String s13,String s14, String s15,String s16,String s17,String s18) {
		getDriver();
		getUrl("https://adactinhotelapp.com");
		
AdactinLogin al= new AdactinLogin();
al.login(s,s1);

 SearchHotel sh = new SearchHotel();
sh.Search(s2,s3,s4,s5,s6,s7,s8,s9);
SelectHotel sl = new SelectHotel();	
sl.Select();
BookHotel bh = new BookHotel();
	bh.Book(s10,s11,s12,s13,s14,s15,s16,s17);
BookingConfirm bc = new BookingConfirm();
bc.Booking();
	
	
	
	}
	
	
}
