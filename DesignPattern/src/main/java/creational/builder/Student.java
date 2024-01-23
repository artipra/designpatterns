package creational.builder;

// This implementation wherein fileds are duplicates in outer and inner class
public class Student{

    private int age;
    private String name;

    private Student(){};

    public String toString(){
        return "name: "+ name +" age: "+age;
    }

    public static StudentBuilder builder(){
        return new StudentBuilder();
    }
   public  static class StudentBuilder{
         int age;
         String name;
//fluent interface or method chaining
       public StudentBuilder age(int age) {
           this.age = age;
           return this;
       }

       public StudentBuilder name(String name) {
           this.name = name;
           return this;
       }

       public Student build(){
            Student stud = new Student();
            stud.age = this.age;
            stud.name = this.name;
            return stud;
        }

    }

}