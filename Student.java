public class Student {
    private String name;
    private int age;
    private String group;

    public Student(String name, int age, String group){
        this.name = name;
        this.age = age;
        this.group = group;
    }

    public String getName () {
        return name;
    }

    public int getAge () {
        return age;
    }

    public Object getGroup () {
        return group;
    }
}
