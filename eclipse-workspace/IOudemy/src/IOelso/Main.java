package IOelso;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("most k;rem");
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("most itt vagyok");
		
		
		
	/*	while(scanner.hasNextLine()) {
			System.out.println("alredy rennun");
			String line = scanner.nextLine();
			System.out.println(line);
		}*/
		
		try {
			String s = null;
			int len = s.length();
		}
		catch(NullPointerException e){
			System.out.println("nullpointre");
		}
		
		System.out.println("continue program");
		
		File file = new File("test.txt");
		File file2 = new File("test2.txt");
		String content = "";
		
		String[] content2 = new String[10];
		int[] out2 = new int[10];
		for (int i = 0; i < 10; i++){
			out2[i] = (int) (Math.random() * 100);
			content2[i] = out2[i] + "";
		}
		
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(new File("nums.txt")))){
			for(int i=0;i<10;i++) {
				writer.write((content2[i]) +" \n");
			} 
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter("test2.txt"));
			for(int i=0;i<100;i++) {
				content = content + "\n" +i;
				
			}
			out.write(content);
			out.close();
		}
		catch(FileNotFoundException e){
			
		}
		catch(IOException e) {
			
		}
		
		System.out.println(readFromFile("test.txt"));
		
	}
		
		public static String readFromFile(String fileName) {
			String out="";
			
			try(BufferedReader reader = new BufferedReader(new FileReader(new File(fileName)))) {
				
				String line = "";
				while((line = reader.readLine()) != null) {
					out += "\n" + line;
				}
			}
			catch(FileNotFoundException e){
				e.printStackTrace();
				System.out.println("FileNotFound");
			}
			catch(IOException e) {
				e.printStackTrace();
				System.out.println("IOEX");
			}
			
			return out;
		}
}

