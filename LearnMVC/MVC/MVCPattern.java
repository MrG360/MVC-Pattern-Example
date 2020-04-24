class MVCPattern{
    public static void main(String[] args) {

        //Retrieve student data from the databse
        Student model = retriveStudentFromDatabase();

        //Create a student View to display user details
        StudentView view = new StudentView();

        //Create cntroller to handle th operatins.
        StudentController controller = new StudentController(model,view);

        controller.updateView();

        //updating databse
        controller.setStudentName("Gaurav");
        controller.setStudentRollNo("11");
        controller.updateView();
    }
    private static Student retriveStudentFromDatabase(){
        Student student = new Student();
        student.setName("Robert");
        student.setRollNo("10");
        return student;
    }
}