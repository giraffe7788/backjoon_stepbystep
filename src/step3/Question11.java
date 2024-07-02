package step3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Question11 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
			StringTokenizer st = null;
			
			while(true){
				st = new StringTokenizer(br.readLine());
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				if(a == 0 && b == 0) break;
				bw.write(a + b + "");
				bw.newLine();
			}
			bw.flush();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}