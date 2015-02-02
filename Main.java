package pack;

import java.io.*;
public class Main {
public static void main(String[] args) {
	Time clock = new Time();
	clock.start();
	
	while(!clock.isFinished())
	{
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			String command = br.readLine();
			if (command.equals("stop"))
				clock.finish();
		} catch (IOException e) { }
	}
}
}
