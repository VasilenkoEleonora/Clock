package pack;

import java.text.DateFormat;
import java.util.*;

public class Time extends Thread {

	private boolean finishClock = false;
	
	public boolean isFinished()
	{
		return finishClock;
	}
	
	void finish()
	{
		finishClock = true;
	}
	
	@Override
	public void run()
	{
		System.out.println("Clock is working");
		
		while(!finishClock)
		{
			printTime();
			try {
				Thread.sleep(10000);
			} catch (InterruptedException  e) {
			}
		}
	}
	
	public void printTime()
	{
		Date now = new Date();
		System.out.println(DateFormat.getDateTimeInstance().format(now));
	}
}
