import java.lang.*;
import java.math.*;
public class Random extends Thread{
	public static void main(String [] args)throws InterruptedException{
		int fint=0;
		for (int i=0;i<100;i++) {
			sleep(100);
			fint=(int)((Math.random()*1000)%100);
			System.out.println(fint);
		}

	}
}
