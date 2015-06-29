import java.io.*;
import java.util.*;
public class W27 {
	public static void main(String [] args){
		Student[] studentArray=new Student[20];
		Student student;
		String namn;
		int vilkenStudent=1;
		for (int i=0;i<20;i++) {
			student=new Student();
			namn="Namn"+vilkenStudent;
			student.setNamn(namn);
			student.setId((int)((Math.abs(Math.random()*1000-100))+100));
			//		student.setStatus((int)(Math.random()*4+1));
			student.setStatus(3);
			student.setFödelseår(1950+(int)(Math.random()*32));
			studentArray[i]=student;
			vilkenStudent++;
		}
		for (int j=0;j<20;j++) 
			if (studentArray[j].getStatus()==3)
				System.out.println(studentArray[j].print());

	}
}
