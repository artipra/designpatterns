package creational.builder;

import creational.builder.Database;
import creational.singletone.Singletone;
import creational.builder.Student;

public class BuilderTest {

    public static void main(String[] args) {
        //builder test
        Student s1 = Student.builder().name("arti").age(32).build();
        System.out.println(s1);

        Database db = Database.builder()
                             .port("8080")
                             .pass("test")
                             .userName("root")
                             .build();
        System.out.println(db);



    }
}
