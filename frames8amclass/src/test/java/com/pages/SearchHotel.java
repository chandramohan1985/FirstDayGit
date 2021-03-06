package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel extends LibGlobal{
	public SearchHotel() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="location")
	private WebElement txtLocation;
	
	@FindBy(id="hotels")
	private WebElement txtHotels;
	public WebElement getTxtLocation() {
		return txtLocation;
	}
	public WebElement getTxtHotels() {
		return txtHotels;
	}
	public WebElement getTxtRoomType() {
		return txtRoomType;
	}
	public WebElement getTxtRoomNos() {
		return txtRoomNos;
	}
	public WebElement getTxtCheckIn() {
		return txtCheckIn;
	}
	public WebElement getTxtCheckOut() {
		return txtCheckOut;
	}
	public WebElement getTxtAdultRoom() {
		return txtAdultRoom;
	}
	public WebElement getTxtChildRoom() {
		return txtChildRoom;
	}
	public WebElement getTxtSubmit() {
		return txtSubmit;
	}
	@FindBy(id="room_type")
	private WebElement txtRoomType;
	@FindBy(id="room_nos")
	private WebElement txtRoomNos;
	@FindBy(id="datepick_in")
	private WebElement txtCheckIn;
	@FindBy(id="datepick_out")
	private WebElement txtCheckOut;
	@FindBy(id="adult_room")
	private WebElement txtAdultRoom;
	@FindBy(id="child_room")
	private WebElement txtChildRoom;
	@FindBy(id="Submit")
	private WebElement txtSubmit;
	
	
	public void Search(String location,String hotels, String room_type,String room_nos,String datepick_in, String datepick_out,String adult_room,String child_room) {
		// TODO Auto-generated method stub
		LibGlobal l = new LibGlobal ();
				l.selectValue(getTxtLocation(), location);
				l.selectValue(getTxtHotels(), hotels);
				l.selectValue(getTxtRoomType(), room_type);
				l.selectValue(getTxtRoomNos(), room_nos);
				l.selectValue(getTxtCheckIn(), datepick_in);
				l.selectValue(getTxtCheckOut(), datepick_out);
				l.selectValue(getTxtAdultRoom(), adult_room);
				l.click(getTxtSubmit());
	}
		
		
	}
	
	
	
	
	

