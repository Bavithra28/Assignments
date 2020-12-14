package main;

import java.io.IOException;

public class hrservice {
	public boolean validateage(int age) throws IOException {
		if(age>16) {
			return true;
		}else {
			throw new IOException("no");
		}
	}

}
