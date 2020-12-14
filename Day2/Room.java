package service;

public class Room {

	private int roomno;
	private String roomType;
	private String roomArea;
	private String ACmachine;

	public int getRoomno() {
		return roomno;
	}

	public void setRoomno(int roomno) {
		this.roomno = roomno;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public String getRoomArea() {
		return roomArea;
	}

	public void setRoomArea(String roomArea) {
		this.roomArea = roomArea;
	}

	public String isACmachine() {
		return ACmachine;
	}

	public void setACmachine(String string) {
		ACmachine = string;
	}

}
