package base.segment_tree;

public interface Merger<E> {
    E merge(E a, E b);
}
