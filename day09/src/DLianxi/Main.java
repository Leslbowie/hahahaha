package DLianxi;
import java.io.File;
import java.io.RandomAccessFile;
import java.lang.reflect.Constructor;
import java.util.Random;
import java.util.Scanner;
public class Main {
 public static void main(String[] args) throws Exception {
  Scanner scan = new Scanner(System.in);
  System.out.print("����ѧ��������");
  String name = scan.nextLine();
  System.out.print("����ѧ�����䣺");
  int age = scan.nextInt();
  System.out.print("����ѧ���ɼ���");
  double score = scan.nextDouble();
 }

 public Main() throws ClassNotFoundException {
	super();


Class<?> c = Class.forName("DLianxi.Student");
 
 }
 
}
