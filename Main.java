public class Main{
    public static void main(String[] args) {
        Student[] students = new Student[5];

        students[0] = new Student("Aibek", 45, "JAVA");
        students[1] = new Student("Saikal", 21, "JAVA");
        students[2] = new Student("Erkin", 34, "JAVA");
        students[3] = new Student("Adelya", 26, "JAVA");
        students[4] = new Student("Farida", 10, "JS");
        int javaCount = 0;
        int jsCount = 0;
        int sum = 0;

        for (Student student : students) {
            if (student.getGroup().equals("JAVA")) {
                javaCount++;
                sum += student.getAge();
            } else if (student.getGroup().equals("JS")) {
                jsCount++;
            }
        }
        System.out.println("Java gruppadaky studentterdin sany: " + javaCount);
        System.out.println("JavaScript gruppadaky studentterdin sany: " + jsCount);
        System.out.println("Alardyn jashtarynyn arifmetikalyk ortochosu: " + sum/students.length);
    }
}
