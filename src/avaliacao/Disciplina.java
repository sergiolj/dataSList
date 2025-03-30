package avaliacao;

public class Disciplina {
    private String name;
    private String teacher;
    private int grade;

    public Disciplina(String name, String teacher, int grade) {
        this.name = name;
        this.teacher = teacher;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public String getTeacher() {
        return teacher;
    }

    public int getGrade() {
        return grade;
    }
}
