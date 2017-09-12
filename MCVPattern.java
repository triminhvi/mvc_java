public class MVCPattern {
	public static void main(String args[]){
		Student model = retrieveStudentFromDatabase();
		StudentView view = new StudentView();
		StudentController controller = new StudentController(model, view);
		controller.updateView()
	}
	public static Student retrieveStudentFromDatabase(){
		Student student_01 = new Student();
		student_01.setName("Robert");
		student_01.setRollNo("01");
		return student_01;
	}
}