/* Design a base class called Student with the following 2 fields:- (i) Name (ii) Id. Derive
2 classes called Sports and Exam from the Student base class. Class Sports has a field
called s_grade and class Exam has a field called e_grade which are integer fields.
Derive a class called Results which inherit from Sports and Exam. This class has a
character array or string field to represent the final result. Also it has a method called
display which can be used to display the result. Illustrate the usage of these classes in
main(). */
///////////////////////////////////////////////////////////////////////////////////////////


class Student{
String name;
int id;
Student(String name,int id){
this.name=name;
this.id=id;
}
}
class Sports extends Student{
char s_grade;
Sports(String name,int id,char sg){
super(name,id);
this.s_grade=sg;
}
}
class Exam extends Sports{
char e_grade;
Exam(String name,int id,char sg,char eg){
super(name,id,sg);
this.e_grade=eg;
}
}
class  Result extends Exam{
String result;
Result(String name,int id,char sg,char eg,String result){
super(name,id,sg,eg);
this.result=result;
}
void display(){
System.out.println("NAME:"+name);
System.out.println("ID:"+id);
System.out.println("EXAM RESULT:"+e_grade);
System.out.println("SPORTS:"+s_grade);
System.out.println("FINAL RESULT:"+result);
System.out.println("------------------------");

}
}
// main class
public class Sports_Exam {
public static void main(String[] args) {
    Result r=new Result("NIKHIL",101,'A','B',"PASS");
    r.display();
}
}
