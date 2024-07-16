package org.example.Lesson70_LambdaExpression;

@FunctionalInterface
public interface OnClickListener {
    int onClick(int i, double d);

    default void print() {

    }
}
