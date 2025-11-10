package pr1;

import pr1.model.Arithmetic;
import common.Control;

public class Calculator {
    public static void main(String[] args) {
        try {
            Control<Arithmetic> control = new Control<>(new Arithmetic());
            control.connectToLocalDb();
            control.handleCommands();
        } catch (RuntimeException e) {
            System.err.println("Произошла ошибка при выполнении программы");
            System.err.println("Ошибка: " + e.getMessage());
        }
    }
}

