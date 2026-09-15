class Student {
    String name;
    int roll;
    char grade;

    public void hello() {
        System.out.println("Hello World");
    }

}

class Car {
    public void throttle() {
        System.out.println("The is going fast as fast as it can ");
    }

    public String max_speed(int speed) {
        return "The car max speed is " + speed;
    }
}


class CourseResult {
    String student_name;
    String course_name;
    char grade;

    String details() {
        return "Course name: " + course_name + "\nStudent name: " + student_name + "\nGrade:" + grade;
    }

}

class Rectangle {
    float length;
    float width;

    float area() {
        return length * width;
    }

    float perimeter() {
        return (2 * length) + (2 * width);
    }

}

class Time {
    int seconds;
    int minutes;
    int hours;

     void display_time() {
        System.out.println("time: "+hours+":"+minutes+":"+seconds);
    }
}





public class Main {
    public static void main(String[] args) {
        
        // Student s1 = new Student();
        // s1.name = "Rahaib";
        // s1.roll = 23;
        // s1.grade = 'A';
        // System.out.println(s1.name);
        // System.out.println(s1.roll);
        // System.out.println(s1.grade);
        // s1.hello();

        // Car c1 = new Car();
        // System.err.println(c1.max_speed(200));

        // CourseResult cs1 = new CourseResult();
        // cs1.course_name = "OOPs";
        // cs1.student_name = "Abdullah";
        // cs1.grade = 'A';
        // System.out.println((cs1.details()));

        // Rectangle r1 = new Rectangle();

        // r1.length = 23.3f;
        // r1.width = 12.2f;
        // System.out.println("Rectangle");
        // System.out.println("Area: "+r1.area());
        // System.out.println("Perimeter: "+ r1.perimeter());

        Time t1 = new Time();
        t1.seconds = 20;
        t1.minutes = 17;
        t1.hours = 3;

        t1.display_time();


    }
}   
