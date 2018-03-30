package SynthesisType.newProgQueue;

public class QueueFullException extends Exception {
    int size;
    QueueFullException(int s) {
        size = s;
    }

    @Override
    public String toString() {
        return "\nОчередь заполнена. Максимальный размер очереди: " + size;
    }
}
