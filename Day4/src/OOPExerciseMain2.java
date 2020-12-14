

import service.OOPExercise2;
import service.OOPExercise22;

public class OOPExerciseMain2 {

	public static void main(String[] args) {
	OOPExercise2 objA = new OOPExercise2(); 
	OOPExercise22 objB = new OOPExercise22(); 
	System.out.println("in main(): "); 
	System.out.println("objA.a = "+objA.getOOPExercise2()); 
	System.out.println("objB.b = "+objB.getOOPExercise22()); 
	objA.setOOPEexercise2 (222); 
	objB.setOOPExercise22(333.33); 
	System.out.println("objA.a = "+objA.getOOPExercise2());
	System.out.println("objB.b = "+objB.getOOPExercise22()); 
	} 
}
