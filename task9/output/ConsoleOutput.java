package by.epamtc.stanislavmelnikov.task9.output;

public class ConsoleOutput {
    public void printDataRequestMessage() {
        System.out.println("Enter radius: ");
    }

    public void printWrongDataInputMessage() {
        System.out.println("Wrong data. Try again.");
    }

    public void printCircumference(double circumference) {
        System.out.println("Circumference: " + String.format("%.2f", circumference));
    }

    public void printSquare(double square) {
        System.out.println("Square: " + String.format("%.2f", square));
    }
}
