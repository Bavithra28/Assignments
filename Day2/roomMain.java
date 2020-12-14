package main;

import service.Room;

public class roomMain {

	public static void main(String[] args) {
		Room room= new Room();
		room.setRoomno(10);
		room.setRoomArea("Second Floor");
		room.setRoomType("Five members per room");
		room.setACmachine("yes");
		System.out.println(room.getRoomArea());
		System.out.println(room.getRoomno());
		System.out.println(room.getRoomType());
		System.out.println(room.isACmachine());
		
		
		
		

	}

}
