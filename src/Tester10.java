import java.util.Arrays;

public class Tester10 {
    public static void main(String[] args) {
        Student rakib = new Student("Rakib", 12301455, "CSE");
        Student roy = new Student("Roy", 12501345, "CS");
        System.out.println("1*************");
        Usis usisObj = new Usis();
        System.out.println("2*************");
        usisObj.login(rakib);
        System.out.println("3*************");
        usisObj.advising(rakib, "CSE110", "PHY111", "MAT110");
        System.out.println("4*************");
        rakib.email = "rakib@hotmail.com";
        rakib.password = "1234";
        System.out.println("5*************");
        usisObj.login(rakib);
        System.out.println("6*************");
        usisObj.advising(rakib);
        System.out.println("7*************");
        usisObj.advising(rakib, "CSE110", "PHY111", "MAT110", "CSE260");
        System.out.println("8*************");
        usisObj.advising(rakib, "CSE110", "PHY111", "MAT110");
        usisObj.advising(rakib, "CSE110", "PHY111", "MAT110");
        System.out.println("9*************");
        usisObj.allAdviseeInfo();
        System.out.println("10*************");
        roy.email = "roy@hotmail.com";
        roy.password = "abcd";
        usisObj.login(roy);
        System.out.println("11*************");
        usisObj.advising(roy, "CSE110", "ENG101", "PHY112");
        System.out.println("12*************");
        usisObj.allAdviseeInfo();
    }

}

class Usis{

    private static int totalAdvisee=0;
    private Student[] studentList=new Student[5];
    public Usis(){
        System.out.println("Usis is ready to use");
    }

    public void login(Student s){
        if (s.email==null || s.password ==null){
            System.out.println("Email and password need to be set.");
        }else{
            s.login="logged in";
            System.out.println("Login successful");
        }
    }
    public void advising(Student student){
        if (student.login ==null|| student.login.equals("logout")){
            System.out.println("Please login to advise courses!");
        }
    System.out.println("You haven't selected any courses.");
    }
    public void advising(Student student, String course1, String course2, String course3) {

        if (student.login ==null|| student.login.equals("logout")){
            System.out.println("Please login to advise courses!");
            return;
        }
        if (totalAdvisee>5){
            System.out.println("Cant advice more than 5 student");
            return;
        }
        student.addCourse(course1);
        student.addCourse(course2);
        student.addCourse(course3);
        studentList[totalAdvisee++]=student;
        System.out.println("Advising successful!");
    }
    public void advising(Student student, String course1, String course2, String course3,String course4) {
        if (student.login ==null|| student.login.equals("logout")){
            System.out.println("Please login to advise courses!");
        }else System.out.println("You need special approval to take more than 3 courses.");
    }

    public void allAdviseeInfo() {
        System.out.println("Total Advisee: "+totalAdvisee);
        for(int i = 0; i <totalAdvisee ; i++) {
            System.out.println(studentList[i]);

        }
    }
}
class Student{
    public String name;
    public String course;
    public int id;
    public String email;
    public String password;
    public String login;

    private String courseList[]=new String[4];
    private int courseItr=0;

    public void addCourse(String course){
        if (courseItr<3)courseList[courseItr++]=course;
    }


    public Student(String name, int id, String dep){
        this.name=name;
        this.id=id;
        this.course=dep;
        System.out.println("Student object is created");
    }

    @Override
    public String toString() {
        return  "Name: "+name+"  ID: "+id+"\n"+"Department: "+course+"\nAdvised Courses:\n"+courseList()+"\n==============";

    }
    public String courseList(){
        String s="";
        for(int i = 0; i <courseItr ; i++) {
            if(courseItr!=i)s+=courseList[i]+',';
        }
        return s;
    }
}
