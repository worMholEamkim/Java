import java.io.File;

public class EX08 {

	public static void listDirectory(File dir) {
		System.out.println("-----" + dir.getPath() + "의 서브리스트 입니다.=====");
		File[] subFiles = dir.listFiles();
		for(int i=0; i<subFiles.length; i++){
			File f = subFiles[i];
			long t = f.lastModified();
			System.out.println(f.getName());
			System.out.println("\t 파일크기" + f.length());
			System.out.println("\t 수정한 시간: %tb % ");
			
		}
			
	public static void main(String[] args) {
		File f1 = new File("c:\\windows\\system.ini");
		System.out.println(f1.getPath() + ", " + f1.getParent() + ", " + f1.compareTo(getName()));
		String res = "";
		if(f1.isFile()) res = "파일";
		else if(f1.isDirectory())res = "디렉토리";
		System.out.println(f1.getPath() + "은 " + res + "입니다.");
		
		File f2 = new file(c="\\Temp\\jave_sample");
			if( !f2.exists()) {
				f2.mkdir();
				
			}
			
		listDirectory(new File("c:\\Temp"));
		f2.renameTo(new File("c:\\Temp\\javasample"));
		
	
	}
	}
	

}
