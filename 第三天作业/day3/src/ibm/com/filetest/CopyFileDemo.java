package ibm.com.filetest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileDemo {
	public static void copyFile(String src,String dest) throws IOException {
		FileInputStream in=new FileInputStream(src);
		File file=new File(dest);
		if(!file.exists()) 
		{
			file.createNewFile();
			FileOutputStream out=new FileOutputStream(file);
			int c;
			byte buffer[]=new byte[1024];
			while((c=in.read(buffer))!=-1) 
			{
				for(int i=0;i<c;i++)
					out.write(buffer[i]); 
			}
			in.close();
			out.close();
		}
	}
	public static void main(String[] args) throws IOException {
		File f = new File("d:/File");
		f.mkdirs();
		File ff = new File(f,"myfile.txt");
		ff.createNewFile();
		File f1 = new File("d:/File/Copy");
		f1.mkdirs();
		String fileSrc="D:/File/myfile.txt";
		String fileDes="D:/File/Copy/myfile_cp.txt";
		copyFile(fileSrc,fileDes);
		System.out.println("D:/File/Copy文件夹文件复制成功");
	}
}
