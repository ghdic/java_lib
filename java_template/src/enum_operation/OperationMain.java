package enum_operation;

import java.util.Arrays;

public class OperationMain {
    public static void main(String[] args) {
        double x = Double.parseDouble("2");
        double y = Double.parseDouble("4");

        for (Operation op : Operation.values()) {
            System.out.printf("%f %s %f = %f\n", x, op, y, op.apply(x, y));
        }
    }
}
