package lesson17march.ex2;

public abstract class Student {
    final String fio;
    final int lessonSeed;
    final static int ALLLESS = 20;

    Student(String fio, int lessonSeed) {
        this.fio = fio;
        this.lessonSeed = lessonSeed;
    }

    abstract boolean exams();

    @Override
    public String toString() {
        return fio;
    }
}
