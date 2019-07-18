package DLianxi;

public class Student {
    private String name;
    private int age;
    private double grade;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", grade=" + grade + "]";
	}
	
	public void information() {
		System.out.println("此学生姓名为:"+name+"年龄:"+age+"成绩："+grade);
		
	}
	
	
	
	
	
}
