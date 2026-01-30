public class Project0 {
    
    static class Student {
        
        
        Student(String name, int id, double gpa) {
            this.name = name;
            this.id = id;
            this.gpa = gpa;
        }
    }
    
    public static void main(String[] args) {
        System.out.println("=== Student GPA System ===");
        
        Student[] students = new Student[5];
        students[0] = new Student("Alice", 1001, 3.8);
        students[1] = new Student("Bob", 1002, 3.2);
       students[2] = new Student("Bob2", 1002, 3.3);
        students[3] = new Student("Diana", 1004, 2.8);
        students[4] = new Student("Eve", 1005, 3.5);
        
        double totalGPA = 0;
        int honorStudents = 0;
        
        for (int i = 0; i < students.length; i++) {
            Student student = students[i];
            totalGPA += student.gpa;
            
            if (isHonorStudent(student.gpa)) {
                printHonor(student);
            } else {
                printRegular(student);
            }
        }
        
        double averageGPA = calculateAverage(totalGPA, students.length);
        System.out.println("\nAverage GPA: " + averageGPA);
        System.out.println("Honor Students: " + honorStudents);
    }
    
    static boolean isHonorStudent(double gpa) {
        return gpa >= 3.5;
    }
    
    static double calculateAverage(double total, int count) {
        double result = total / count;
        return result;
    }
    
    static void printHonor(Student student) {
        System.out.println("HONOR: " + student.name + " (ID: " + student.id + ", GPA: " + student.gpa + ")");
    }
    
    static void printRegular(Student student) {
        System.out.println("REGULAR: " + student.name + " (ID: " + student.id + ", GPA: " + student.gpa + ")");
    }
}
