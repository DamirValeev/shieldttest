package lesson17march.ex2;

public class AllTypeStud {
}

class Typical extends Student {
    @Override
    boolean exams() {
        if (lessonSeed >= ALLLESS || (lessonSeed>=10 && Math.random()<0.5)){
            return true;
        }
        else return false;
    }

    Typical(String fio, int lessonSeed){
        super(fio, lessonSeed);
    }

}


class Clever extends Student {
    @Override
    boolean exams() {
        if (lessonSeed >= ALLLESS || (lessonSeed>=10 && Math.random()<0.7)){
            return true;
        }
        else return false;
    }
    Clever(String fio, int lessonSeed) {
        super(fio, lessonSeed);
    }
}

class Genius extends Student {
    @Override
    boolean exams() {
        if (lessonSeed >= 1){
            return true;
        }
        else return false;
    }
    Genius(String fio, int lessonSeed) {
        super(fio, lessonSeed);
    }
}
