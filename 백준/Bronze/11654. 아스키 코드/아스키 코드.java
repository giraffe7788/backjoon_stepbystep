import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			
			System.out.println((int)br.readLine().charAt(0));
			
		} catch(Exception e) {
			e.printStackTrace();
		} 
	}
}