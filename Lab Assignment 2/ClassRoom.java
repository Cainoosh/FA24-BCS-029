public class ClassRoom{
	private String className;
	private String classCode;
	private Teacher teacher;
	Student students[] = new Student[5];
	private int count = 0;
	
	
	ClassRoom(String className, String classCode, Teacher teacher){
		this.className = className;
		this.classCode = classCode;
		this.teacher = teacher;
	}


	public boolean addStudent(Student student) {
		if(count < 5) {
			students[count++] = student;
			return true;
		}
		else {
 			System.out.println("Class is full. Cannot add student");
			return false;
		}
	}


	public void setClassName(String className){
		this.className = className;
	}

	public void setClassCode(String classCode){
		this.classCode = classCode;
	}

	public void setTeacher(Teacher teacher){
		this.teacher = teacher;
	}


	public String getClassName(){
		return className;
	}

	public String getClassCode(){
		return classCode;
	}

	public Teacher getTeacher(){
		return teacher;
	}

	public void displayClass(){
		System.out.println("Class Name: " + className);
		System.out.println("Class Code: " + classCode + "\n");
		System.out.println("Teacher: " + teacher.toString() + "\n");
		for(int i=0; i<count; i++){
			System.out.println("Student " + (i + 1) + ":");
                	System.out.println(students[i].toString());
		}


	}


}