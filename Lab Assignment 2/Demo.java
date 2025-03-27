public class Demo {
	public static void main(String[] args) {
        
		Principal principal = new Principal("Maryam", 40, 10);
        	Teacher teacher1 = new Teacher("Momina", 57, "Chemistry");
        	Teacher teacher2 = new Teacher("Naveera", 26, "Literature");
		School school = new School("Hallows High", "56 street", principal, 3);
		ClassRoom class1 = new ClassRoom("Grade 10", "G10", teacher1);
		ClassRoom class2 = new ClassRoom("Grade 09", "G09", teacher2);

		class1.addStudent(new Student("Fatima", 19, 033));
		class1.addStudent(new Student("Ibrahim", 20, 071));
		class1.addStudent(new Student("Wassam", 20, 131));
		class1.addStudent(new Student("Saad", 18, 117));
		class1.addStudent(new Student("Amna", 19, 017));

		school.addClassRoom(class1, 1);
		school.addClassRoom(class2, 2);

		school.displaySchool();
    }
}
