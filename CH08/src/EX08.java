import java.io.File;

public class EX08 {

	public static void listDirectory(File dir) {
		System.out.println("-----" + dir.getPath() + "�� ���긮��Ʈ �Դϴ�.=====");
		File[] subFiles = dir.listFiles();
		for(int i=0; i<subFiles.length; i++){
			File f = subFiles[i];
			long t = f.lastModified();
			System.out.println(f.getName());
			System.out.println("\t ����ũ��" + f.length());
			System.out.println("\t ������ �ð�: %tb % ");
			
		}
			
	public static void main(String[] args) {
		File f1 = new File("c:\\windows\\system.ini");
		System.out.println(f1.getPath() + ", " + f1.getParent() + ", " + f1.compareTo(getName()));
		String res = "";
		if(f1.isFile()) res = "����";
		else if(f1.isDirectory())res = "���丮";
		System.out.println(f1.getPath() + "�� " + res + "�Դϴ�.");
		
		File f2 = new file(c="\\Temp\\jave_sample");
			if( !f2.exists()) {
				f2.mkdir();
				
			}
			
		listDirectory(new File("c:\\Temp"));
		f2.renameTo(new File("c:\\Temp\\javasample"));
		
	
	}
	}
	

}
