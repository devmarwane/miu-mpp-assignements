package lesson9.lecture.streamandoperations;

@FunctionalInterface
public interface TriFunction<T, U, S, R> {
    R apply(T t, U u, S s);
}
