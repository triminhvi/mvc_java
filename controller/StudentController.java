public class StudentController{
	public Student model;
	public StudentView view;

	public StudentController(Student model, StudentView view){
		this.model = model;
		this.view = view;
	}

	public void setStudentName(name){
		this.model.setName(name);
	}

	public String getStudentName(){
		return this.model.getName();
	}

	public void setStudentRollNo(rollNo){
		this.model.setRollNo(rollNo);
	}

	public String getStudentRollNo(){
		return this.model.getRollNo();
	}

	public void updateView(){
		view.printStudentDetail(model.getName(), model.getRollNo());
	}
}