import java.io.*;
import java.nio.file.*;


public class PracticeProblem {

	public static void main(String args[]) {
		System.out.println(getName(2, "file.txt"));
		System.out.println(getAge(1, "file.txt"));
		System.out.println(getNumber(3, "file.txt"));


	}

	public static String getName(int Line, String file) {
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			String Line1;
			int count = 1;
			while ((Line1 = br.readLine()) != null) {
				if (count == Line) {
					String data[] = Line1.split(" ");
					return data[0] + " " + data[1];
				} 
				count++;
			}

		}
		catch (IOException e) {
			return ("Error reading file: " + e.getMessage());
		}
		return "";
	}
	
	public static int getAge(int Line, String file) {
		try (BufferedReader br = new BufferedReader(new FileReader(file))){
			String Line2;
			int count = 1;
			while ((Line2 = br.readLine()) != null) {
				if (count == Line) {
					String data[] = Line2.split(" ");
					return Integer.parseInt(data[2]);
				} 
				count++;
			}

		}
		catch (IOException e) {
			return -1;
		}
		return -1;

	}
	
	public static int getNumber(int Line, String file) {
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			String Line3;
			int count = 1;
			while ((Line3 = br.readLine()) != null) {
				if (count == Line) {
					String data[] = Line3.split(" ");
					return Integer.parseInt(data[3]);
				} 
				count++;
			}
		}
		catch (IOException e) {
			return -1;
		}
		return -1;
	}

	public static void fileAppend(String output, String filename) {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename, true))){
			bw.write(output);
		}
		catch (IOException e) {
			System.out.println(e);
		}
	}
}
