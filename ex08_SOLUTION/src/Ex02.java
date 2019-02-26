import java.io.*;

public class Ex02 {

	public static void main(String[] args) 
	{
		BufferedReader br;
		File f;
		FileReader fr;
		try {
			f = new File("c:\\temp\\phone.txt");
			fr = new FileReader(f);
			br = new BufferedReader(new FileReader(f));
			
			System.out.println(f.getPath() + "를 출력합니다.");
			while(true) {
				String line = br.readLine();
				if(line == null) // end of file
					break;
				System.out.print(line+"\n");
			}
			fr.close();
		} 
		catch (IOException e) { // 파일을 저장할 수 없는 경우 예외
			e.printStackTrace();
		}
	}

}
