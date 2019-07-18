package DLianxi;
import java.io.File;
import java.io.RandomAccessFile;
import java.lang.reflect.Constructor;
import java.util.Random;
import java.util.Scanner;
public class Main {
 public static void main(String[] args) throws Exception {
  Scanner scan = new Scanner(System.in);
  System.out.print("输入学生姓名：");
  String name = scan.nextLine();
  System.out.print("输入学生年龄：");
  int age = scan.nextInt();
  System.out.print("输入学生成绩：");
  double score = scan.nextDouble();
 }

 public Main() throws ClassNotFoundException {
	super();


Class<?> c = Class.forName("DLianxi.Student");
 
 }
 
}
