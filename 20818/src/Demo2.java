import java.util.ArrayList;
import java.util.List;

class Student{
    public String name;
    public String classes;
    public double score;

    public Student(String name, String classes, double score) {
        this.name = name;
        this.classes = classes;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", classes='" + classes + '\'' +
                ", score=" + score +
                '}';
    }
}
public class Demo2 {
    public static void main(String[] args) {
        List<Student> list=new ArrayList<>();
        Student s1=new Student("张三","01",95);
        Student s2=new Student("李四","01",85);
        Student s3=new Student("王五","01",86);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        for (Student s:list) {
            System.out.println(s.score);
        }
    }

}
