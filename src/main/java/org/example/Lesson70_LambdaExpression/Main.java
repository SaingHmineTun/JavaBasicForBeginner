package org.example.Lesson70_LambdaExpression;

public class Main {

    public static void main(String[] args) {
        OnClickListener listener = (i, d) -> {
            System.out.println(i + d);
            return 0;
        };
        onClick(listener);
    }

    private static void onClick(OnClickListener listener) {
        listener.onClick(5, 10);
    }

}
