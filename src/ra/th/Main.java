package ra.th;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Huy", 20, "Ha Noi");
        Student student2 = new Student("Hung", 21, "Ha Noi");
        Student student3 = new Student("Ha", 22, "Ha Noi");

        Map<Integer, Student> studentMap = new HashMap<Integer, Student>();
        studentMap.put(1, student1);
        studentMap.put(2, student2);
        studentMap.put(3, student3);
        studentMap.put(4, student1);

        System.out.println("Danh sách sinh viên sử dụng HashMap:");
        for (Map.Entry<Integer, Student> entry : studentMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        Set<Student> students = new HashSet<Student>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student1);

        System.out.println("Danh sách sinh viên sử dụng HashSet:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}